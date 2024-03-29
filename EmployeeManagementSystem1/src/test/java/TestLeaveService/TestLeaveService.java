package TestLeaveService;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.employee.entities.Employee;
import com.employee.entities.Leaves;
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
        
		employee = new Employee();
	}

	private static Employee employee;
	
	@Test
	
   void testsaveLeave() {

		Leaves testLeave = new Leaves(20, LocalDate.parse("2024-01-12"), LocalDate.parse("2024-01-16"), "Festival", 'A',employee);
		assertTrue(leaveService.saveLeave(testLeave));

		Leaves testLeave1 = new Leaves(22, LocalDate.parse("2024-02-26"), LocalDate.parse("2024-02-28"), "Marriage", 'A',employee);
		assertTrue(leaveService.saveLeave(testLeave1));
		
		Leaves testLeave2 = new Leaves(25, LocalDate.parse("2024-01-2"), LocalDate.parse("2024-01-8"), "Sick", 'A',employee);
		assertTrue(leaveService.saveLeave(testLeave2));
	}
	
	//@Test
	//void testGetLeavesById() {

	//	Leaves leaves = leavesService.getLeavesById("1");
		//assertNotNull(leavesService.saveLeaves(leaves));

	//}
	
	//@Test
	//void testUpdateLeave() {
		//Leaves leaves = new Leaves(2, LocalDate.parse("2024-03-2"), LocalDate.parse("2024-03-6"), "Marriage", 'A',employee);

	//	boolean updatedLeaves = leavesService.updateLeave("2", leaves);
		//assertTrue(updatedLeaves);

	//}

	//@Test

	//void testGetAllLeaves() {

		//List<Leaves> leavesList = ((Object) leavesService).getAllLeaves();
		//assertNotNull(leaveList);
	//}

	//@Test
	// void testDeleteLeaves() {
		//boolean success = leaveService.deleteLeaves("2");
		//assertTrue(success);
		// assertNull(leaveService.getLeaveById("2"));
	//}

	@AfterAll
	static void tearDown() {
		sessionFactory.close();
	}
	
}
