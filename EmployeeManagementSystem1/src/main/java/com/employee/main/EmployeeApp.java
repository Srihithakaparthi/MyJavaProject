
package com.employee.main;

import java.time.LocalDate;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.employee.entities.Attendence;
import com.employee.entities.Department;
import com.employee.entities.Employee;
import com.employee.entities.Leaves;
import com.employee.entities.Project;
import com.employee.entities.Task;

public class EmployeeApp {

	public static void main(String[] args) {
		SessionFactory factory = null;
		
		try {
			
			
			factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
			Session session = factory.openSession();
		
			session.beginTransaction();
			
			Employee employee = new Employee(12, "Rohan", LocalDate.parse("1996-06-25"), "rohan@gmail.com","9955556720",'A');
		    session.save(employee);
		    
		    
		    Department department = new Department(101, "Engineering", "Hyderabad", 'A',employee);
		    session.save(department);
		    
			Task task = new Task(1, "Planning", LocalDate.parse("2024-02-01"), LocalDate.parse("2024-02-10"), 'A', employee);
			session.save(task);
			
			Project project = new Project(22685, 50000.00, "In Progress", 'A', employee);
			session.save(project);
			
			Leaves leave = new Leaves(20, LocalDate.parse("2024-01-12"), LocalDate.parse("2024-01-16"), "Festival", 'A',employee);
			session.save(leave);
			
			Attendence attendence = new Attendence(51, LocalDate.parse("2024-03-14"), "9:00", "6:00", 'A', employee);
			session.save(attendence);
					
			
			session.getTransaction().commit();
			session.clear();
		} catch (HibernateException e) {
			e.printStackTrace();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}
}