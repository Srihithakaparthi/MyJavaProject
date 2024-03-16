package com.employee.daoImpl;

import com.employee.dao.DepartmentDAO;
import com.employee.entities.Department;
import com.hibernateUtil.HibernateUtil;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;
public class DepartmentDAOImpl implements DepartmentDAO {
     SessionFactory sessionFactory;

    public DepartmentDAOImpl() {
        this.sessionFactory = sessionFactory;
    }

	@Override
    public boolean saveDepartment(Department department) {
    	try(Session session=HibernateUtil.getSession()) {
            Transaction tx = session.beginTransaction();
            session.save(department);
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
    public List<Department> getDepartment(Department department) {
    	try(Session session=HibernateUtil.getSession()) {
            Query<Department> query = session.createQuery("FROM Department WHERE name = :name", Department.class);
            query.setParameter("name", department.getDepartmentId());
            return query.getResultList();
        }
    }

    @Override
    public Department getDepartmentById(int departmentId) {
		try (Session session=HibernateUtil.getSession()){

			Department department = session.get(Department.class, departmentId);

			return department;
		} catch (HibernateException e) {
			System.out.println("HibernateException:" + e);
		} catch (Exception ex) {
			System.out.println("Exception:" + ex);

		}

		return null;
	}

    @Override
    public boolean updateDepartment(int departmentId) {
    	try(Session session=HibernateUtil.getSession()) {
            Transaction tx = session.beginTransaction();
            Department department = session.get(Department.class, departmentId); 
            session.update(department);
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
    public boolean deleteDepartment(int departmentId) {
    	try(Session session=HibernateUtil.getSession()) {
            Transaction tx = session.beginTransaction();
            Department department = session.get(Department.class, departmentId);
            if (department != null) {
                session.delete(department);
                tx.commit();
                return true;
            } else {
                System.out.println("Department not found with ID: " + departmentId);
            }
    	}
		return false;
    }
}



