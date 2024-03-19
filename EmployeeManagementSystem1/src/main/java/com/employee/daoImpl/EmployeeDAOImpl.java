package com.employee.daoImpl;

import com.employee.dao.EmployeeDAO;
import com.employee.entities.Employee;
import com.hibernateUtil.HibernateUtil;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;
public class EmployeeDAOImpl implements EmployeeDAO {
     SessionFactory sessionFactory;

    public EmployeeDAOImpl() {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public boolean saveEmployee(Employee employee) {
    	try(Session session=HibernateUtil.getSession()) {
            Transaction tx = session.beginTransaction();
            session.save(employee);
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
    public List<Employee> getEmployee(Employee employee) {
    	try(Session session=HibernateUtil.getSession()) {
            Query<Employee> query = session.createQuery("FROM Employee WHERE name = :name", Employee.class);
            query.setParameter("name", employee.getName());
            return query.getResultList();
        }
    }

    @Override
    public Employee getEmployeeById(int employeeId) {
		try (Session session=HibernateUtil.getSession()){

			Employee employee = session.get(Employee.class, employeeId);

			return employee;
		} catch (HibernateException e) {
			System.out.println("HibernateException:" + e);
		} catch (Exception ex) {
			System.out.println("Exception:" + ex);

		}

		return null;
	}

    @Override
    public boolean updateEmployee(int employeeId) {
    	try(Session session=HibernateUtil.getSession()) {
            Transaction tx = session.beginTransaction();
            Employee employee = session.get(Employee.class, employeeId); 
            session.update(employee);
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
    public boolean deleteEmployee(int employeeId) {
    	try(Session session=HibernateUtil.getSession()) {
            Transaction tx = session.beginTransaction();
            Employee employee = session.get(Employee.class, employeeId);
            if (employee != null) {
                session.delete(employee);
                tx.commit();
                return true;
            } else {
                System.out.println("Employee not found with ID: " + employeeId);
            }
    	}
		return false;
    }
}
