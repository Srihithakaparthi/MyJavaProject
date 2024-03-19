package com.employee.daoImpl;

import com.employee.dao.AttendenceDAO;
import com.employee.entities.Attendence;
import com.hibernateUtil.HibernateUtil;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;
public class AttendenceDAOImpl implements AttendenceDAO 
   {
     SessionFactory sessionFactory;

    public AttendenceDAOImpl() {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public boolean saveAttendence(Attendence attendence) {
    	try(Session session=HibernateUtil.getSession()) {
            Transaction tx = session.beginTransaction();
            session.save(attendence);
            tx.commit();
            session.close();
            return true;
        }catch(HibernateException e) {
        	System.out.println("Hibernate Exception is:"+e);
        }catch(Exception e) {
        	System.out.println("Exception is :"+e);
        }
		return false;
    }

    @Override
    public List<Attendence> getAttendence(Attendence attendence) {
    	try(Session session=HibernateUtil.getSession()) {
            Query<Attendence> query = session.createQuery("FROM Attendence WHERE name = :name", Attendence.class);
            query.setParameter("name", attendence.getAttendanceId());
            return query.getResultList();
        }
    }

    @Override
    public Attendence getAttendenceById(int attendenceId) {
		try (Session session=HibernateUtil.getSession()){

			Attendence attendence = session.get(Attendence.class, attendenceId);

			return attendence;
		} catch (HibernateException e) {
			System.out.println("HibernateException:" + e);
		} catch (Exception ex) {
			System.out.println("Exception:" + ex);

		}

		return null;
	}

    @Override
    public boolean updateAttendence(int attendenceId) {
    	try(Session session=HibernateUtil.getSession()) {
            Transaction tx = session.beginTransaction();
            Attendence attendence = session.get(Attendence.class, attendenceId); 
            session.update(attendence);
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
    public boolean deleteAttendence(int attendenceId) {
    	try(Session session=HibernateUtil.getSession()) {
            Transaction tx = session.beginTransaction();
            Attendence attendence = session.get(Attendence.class, attendenceId);
            if (attendence != null) {
                session.delete(attendence);
                tx.commit();
                return true;
            } else {
                System.out.println("Attendence not found with ID: " + attendenceId);
            }
    	}
		return false;
    }

}