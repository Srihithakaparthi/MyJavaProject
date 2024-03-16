package TestLeaveService;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import com.employee.entities.Employee;
import com.employee.entities.Leave;
import com.employee.service.LeaveService;
import com.employee.serviceImpl.LeaveServiceImpl;
import com.hibernateUtil.HibernateUtil;

public class TestLeaveService {

	static SessionFactory sessionFactory;
	static Session session;
	static LeaveService leaveService;
	
	@BeforeAll
	 static void SetUp() {
		sessionFactory = HibernateUtil.getSessionFactory();
		leaveService = new LeaveServiceImpl();
		
	}

	private Employee employee;
	
	@Test
	
   void testsaveLeave() {

		Leave testLeave = new Leave(20, LocalDate.parse("2024-01-12"), LocalDate.parse("2024-01-16"), "Festival", 'A',employee);
		assertTrue(leaveService.saveLeave(testLeave));

		Leave testLeave1 = new Leave(22, LocalDate.parse("2024-02-26"), LocalDate.parse("2024-02-28"), "Marriage", 'A',employee);
		assertTrue(leaveService.saveLeave(testLeave1));
		
		Leave testLeave2 = new Leave(25, LocalDate.parse("2024-01-2"), LocalDate.parse("2024-01-8"), "Sick", 'A',employee);
		assertTrue(leaveService.saveLeave(testLeave2));
	}
	
	//@Test
	//void testGetLeaveById() {

	//	Leave leaves = leaveService.getLeaveById("1");
		//assertNotNull(leaveService.saveLeave(leaves));

	//}
	
	//@Test
	//void testUpdateLeave() {
		//Leave leaves = new Leave(2, LocalDate.parse("2024-03-2"), LocalDate.parse("2024-03-6"), "Marriage", 'A',employee);

	//	boolean updatedLeaves = leaveService.updateLeave("2", leaves);
		//assertTrue(updatedLeaves);

	//}

	//@Test

	//void testGetAllLeaves() {

		//List<Leave> leaveList = ((Object) leaveService).getAllLeaves();
		//assertNotNull(leaveList);
	//}

	//@Test
	// void testDeleteLeave() {
		//boolean success = leaveService.deleteLeave("2");
		//assertTrue(success);
		// assertNull(leaveService.getLeaveById("2"));
	//}

	@AfterAll
	static void tearDown() {
		sessionFactory.close();
	}
	
}
