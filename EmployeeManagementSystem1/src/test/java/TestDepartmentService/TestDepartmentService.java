package TestDepartmentService;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import com.employee.entities.Department;
import com.employee.entities.Employee;
import com.employee.service.DepartmentService;
import com.employee.serviceImpl.DepartmentServiceImpl;
import com.hibernateUtil.HibernateUtil;

public class TestDepartmentService {

	static SessionFactory sessionFactory;
	static Session session;
	static DepartmentService departmentService;
	
	@BeforeAll
	 static void SetUp() {
		sessionFactory = HibernateUtil.getSessionFactory();
		departmentService = new DepartmentServiceImpl();
		
	}

	private Employee employee;
	
	@Test
	
   void testsaveDepartment() {

		Department testDepartment = new Department(101, "Engineering", "Hyderabad", 'A',employee);
		assertTrue(departmentService.saveDepartment(testDepartment));
        
		Department testDepartment1 = new Department(102, "IT", "Pune", 'A',employee);
		assertTrue(departmentService.saveDepartment(testDepartment1));

		Department testDepartment2 = new Department(103, "Non-IT", "Banglore", 'A',employee);
		assertTrue(departmentService.saveDepartment(testDepartment2));

		
	}
	
	//@Test
	//void testGetDepartmentById() {

	//	Department departments = departmentService.getDepartmentById("1");
		//assertNotNull(departmentService.saveDepartment(departments));

	//}
	
	//@Test
	//void testUpdateDepartment() {
		//Department departments = new Department(105, "sales", "Hyderabad", 'A',employee);

	//	boolean updatedDepartments = departmentService.updateDepartment("105", departments);
		//assertTrue(updatedDepartments);

	//}

	//@Test

	//void testGetAllDepartments() {

		//List<Department> departmentList = ((Object) departmentService).getAllDepartments();
		//assertNotNull(departmentList);
	//}

	//@Test
	// void testDeleteDepartment() {
		//boolean success = departmentService.deleteDepartment("105");
		//assertTrue(success);
		// assertNull(departmentService.getDepartmentById("105"));
	//}

	@AfterAll
	static void tearDown() {
		sessionFactory.close();
	}
	
}
