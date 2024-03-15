package com.employee.daoImpl;

import com.employee.dao.ProjectDAO;
import com.employee.entities.Project;
import com.hibernateUtil.HibernateUtil;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;
public class ProjectDAOImpl implements ProjectDAO {
     SessionFactory sessionFactory;

    public ProjectDAOImpl() {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public boolean saveProject(Project project) {
    	try(Session session=HibernateUtil.getSession()) {
            Transaction tx = session.beginTransaction();
            session.save(project);
            tx.commit();
            return true;
        }catch(HibernateException e) {
        	System.out.println("Hibernate Exception is:"+e);
        }catch(Exception e) {
        	System.out.println("Exception is :"+e);
        }
		return false;
    }

    @Override
    public List<Project> getProject(Project project) {
    	try(Session session=HibernateUtil.getSession()) {
            Query<Project> query = session.createQuery("FROM Project WHERE name = :name", Project.class);
            query.setParameter("id", project.getProjectId());
            return query.getResultList();
        }
    }

    @Override
    public Project getProjectById(int ProjectId) {
		try (Session session=HibernateUtil.getSession()){

			Project project = session.get(Project.class, ProjectId);

			return project;
		} catch (HibernateException e) {
			System.out.println("HibernateException:" + e);
		} catch (Exception ex) {
			System.out.println("Exception:" + ex);

		}

		return null;
	}
    @Override
    public boolean updateProject(int projectId) {
    	try(Session session=HibernateUtil.getSession()) {
            Transaction tx = session.beginTransaction();
            Project project = session.get(Project.class, projectId); 
            session.update(project);
            tx.commit();
            return true;
        }catch(HibernateException e) {
        	System.out.println("Hibernate Exception is:"+e);
        }catch(Exception e) {
        	System.out.println("Exception is :"+e);
        }
		return false;
    }

    @Override
    public boolean deleteProject(int projectId) {
    	try(Session session=HibernateUtil.getSession()) {
            Transaction tx = session.beginTransaction();
            Project project = session.get(Project.class, projectId);
            if (project != null) {
                session.delete(project);
                tx.commit();
                return true;
            } else {
                System.out.println("Project not found with ID: " + projectId);
            }
        }
		return false;
    }
}