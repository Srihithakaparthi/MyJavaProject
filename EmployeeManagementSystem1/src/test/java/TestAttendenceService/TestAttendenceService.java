package TestAttendenceService;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.employee.entities.Attendence;
import com.employee.entities.Employee;
import com.employee.service.AttendenceService;
import com.employee.serviceImpl.AttendenceServiceImpl;
import com.hibernateUtil.HibernateUtil;

public class TestAttendenceService {

	static SessionFactory sessionFactory;
	static Session session;
	static AttendenceService attendenceService;
	
	@BeforeAll
	 static void setUp() {
		sessionFactory = HibernateUtil.getSessionFactory();
		attendenceService = new AttendenceServiceImpl();
		
	    employee = new Employee();
	}

	private static Employee employee;

	@Test
	
   void testsaveAttendence() {

		Attendence testAttendence = new Attendence(51, LocalDate.parse("2024-03-14"), "9:00", "6:00", 'A', employee);
		assertTrue(attendenceService.saveAttendence(testAttendence));

		Attendence testAttendence1 = new Attendence(52, LocalDate.parse("2024-03-15"), "9:00", "6:00", 'A', employee);
		assertTrue(attendenceService.saveAttendence(testAttendence1));

		Attendence testAttendence2 = new Attendence(53, LocalDate.parse("2024-03-16"), "9:00", "6:00", 'A', employee);
		assertTrue(attendenceService.saveAttendence(testAttendence2));

	}
	
	//@Test
	//void testGetAttendenceById() {

	//	Attendence attendences = attendenceService.getAttendenceById("1");
		//assertNotNull(attendenceService.saveAttendence(attendences));

	//}
	
	//@Test
	//void testUpdateAttendence() {
		//Attendence attendences = new Attendence(4, LocalDate.parse("2024-03-17"), "9:00", "6:00", 'A', employee);

	//	boolean updatedAttendences = attendenceService.updateAttendence("4", attendences);
		//assertTrue(updatedattendences);

	//}

	//@Test

	//void testGetAllAttendences() {

		//List<Attendence> attendenceList = ((Object) attendenceService).getAllAttendences();
		//assertNotNull(attendenceList);
	//}

	//@Test
	// void testDeleteAttendence() {
		//boolean success = attendenceService.deleteAttendence("4");
		//assertTrue(success);
		// assertNull(attendenceService.getAttendenceById("4"));
	//}

	@AfterAll
	 static void tearDown() {
		sessionFactory.close();
	}
	
}

