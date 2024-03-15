package com.employee.daoImpl;

import com.employee.dao.LeaveDAO;
import com.employee.entities.Leave;
import com.hibernateUtil.HibernateUtil;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;
public class LeaveDAOImpl implements LeaveDAO {
     SessionFactory sessionFactory;

    public LeaveDAOImpl() {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public boolean saveLeave(Leave leave) {
    	try(Session session=HibernateUtil.getSession()) {
            Transaction tx = session.beginTransaction();
            session.save(leave);
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
    public List<Leave> getLeave(Leave leave) {
    	try(Session session=HibernateUtil.getSession()) {
            Query<Leave> query = session.createQuery("FROM Leave WHERE name = :name", Leave.class);
            query.setParameter("id", leave.getEmployee());
            return query.getResultList();
        }
    }

    @Override
    public Leave getLeaveById(int leaveId) {
		try (Session session=HibernateUtil.getSession()){

			Leave leave = session.get(Leave.class, leaveId);

			return leave;
		} catch (HibernateException e) {
			System.out.println("HibernateException:" + e);
		} catch (Exception ex) {
			System.out.println("Exception:" + ex);

		}

		return null;
	}

    @Override
    public boolean updateLeave(int leaveId) {
    	try(Session session=HibernateUtil.getSession()) {
            Transaction tx = session.beginTransaction();
            Leave leave = session.get(Leave.class, leaveId); 
            session.update(leave);
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
    public boolean deleteLeave(int leaveId) {
    	try(Session session=HibernateUtil.getSession()) {
            Transaction tx = session.beginTransaction();
            Leave leave = session.get(Leave.class, leaveId);
            if (leave != null) {
                session.delete(leave);
                tx.commit();
                return true;
            } else {
                System.out.println("Leave not found with ID: " + leaveId);
            }
        }
		return false;
    }
}