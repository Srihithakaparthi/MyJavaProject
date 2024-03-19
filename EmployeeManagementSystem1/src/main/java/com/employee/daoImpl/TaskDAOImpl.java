package com.employee.daoImpl;

import com.employee.dao.TaskDAO;
import com.employee.entities.Task;
import com.hibernateUtil.HibernateUtil;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;
public class TaskDAOImpl implements TaskDAO {
     SessionFactory sessionFactory;

    public TaskDAOImpl() {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public boolean saveTask(Task task) {
    	try(Session session=HibernateUtil.getSession()) {
            Transaction tx = session.beginTransaction();
            session.save(task);
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
    public List<Task> getTask(Task task) {
    	try(Session session=HibernateUtil.getSession()) {
            Query<Task> query = session.createQuery("FROM Task WHERE name = :name", Task.class);
            query.setParameter("name", task.getTaskName());
            return query.getResultList();
        }
    }

    @Override
    public Task getTaskById(int taskId) {
		try (Session session=HibernateUtil.getSession()){

			Task task = session.get(Task.class, taskId);

			return task;
		} catch (HibernateException e) {
			System.out.println("HibernateException:" + e);
		} catch (Exception ex) {
			System.out.println("Exception:" + ex);

		}

		return null;
	}

    @Override
    public boolean updateTask(int taskId) {
    	try(Session session=HibernateUtil.getSession()) {
            Transaction tx = session.beginTransaction();
            Task task = session.get(Task.class, taskId); 
            session.update(task);
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
    public boolean deleteTask(int taskId) {
    	try(Session session=HibernateUtil.getSession()) {
            Transaction tx = session.beginTransaction();
            Task task = session.get(Task.class, taskId);
            if (task != null) {
                session.delete(task);
                tx.commit();
                return true;
            } else {
                System.out.println("Task not found with ID: " + taskId);
            }
        }
		return false;
    }
}
