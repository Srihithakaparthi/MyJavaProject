package TestEmployeeService;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import com.employee.entities.Employee;
import com.employee.service.EmployeeService;
import com.employee.serviceImpl.EmployeeServiceImpl;
import com.hibernateUtil.HibernateUtil;

public class TestEmployeeService {

	static SessionFactory sessionFactory;
	static Session session;
	static EmployeeService employeeService;
	
	@BeforeAll
	 static void SetUp() {
		sessionFactory = HibernateUtil.getSessionFactory();
		employeeService = new EmployeeServiceImpl();
		
	}
	
	@Test
	
   void testsaveEmployee() {

		Employee testEmployee = new Employee("12", "Rohan", LocalDate.parse("1996-06-25"), "rohan@gmail.com","9955556720",'A');
		assertTrue(employeeService.saveEmployee(testEmployee));

		Employee testEmployee1 = new Employee("13", "Rohit", LocalDate.parse("1992-02-5"), "rohit@gmail.com","8244865680",'A');
		assertTrue(employeeService.saveEmployee(testEmployee1));

		Employee testEmployee2 = new Employee("14", "JaneSmith", LocalDate.parse("1996-09-13"), "jone@gmail.com","9646265642",'A');
		assertTrue(employeeService.saveEmployee(testEmployee2));

	}
	
	//@Test
	//void testGetEmployeeById() {

	//	Employee employees = employeeService.getEmployeeById("1");
		//assertNotNull(employeeService.saveEmployee(employees));

	//}
	
	//@Test
	//void testUpdateEmployee() {
		//Employee employees = new Employee("10", "Joe", LocalDate.parse("1997-09-11"), "joe@gmail.com","9854375409",'A');

	//	boolean updatedEmployees = employeeService.updateEmployee("10", employees);
		//assertTrue(updatedEmployees);

	//}

	//@Test

	//void testGetAllEmployees() {

		//List<Employee> employeeList = ((Object) employeeService).getAllEmployees();
		//assertNotNull(employeeList);
	//}

	//@Test
	// void testDeleteEmployee() {
		//boolean success = employeeService.deleteEmployee("1");
		//assertTrue(success);
		// assertNull(userService.getUserById("1"));
	//}

	@AfterAll
	static void tearDown() {
		sessionFactory.close();
	}
	
}
