package TestTaskService;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.Test;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;

import com.employee.entities.Employee;
import com.employee.entities.Task;
import com.employee.service.TaskService;
import com.employee.serviceImpl.TaskServiceImpl;
import com.hibernateUtil.HibernateUtil;

public class TestTaskService {

	static SessionFactory sessionFactory;
	static Session session;
	static TaskService taskService;
	
	@BeforeAll
	 static void SetUp() {
		sessionFactory = HibernateUtil.getSessionFactory();
		taskService = new TaskServiceImpl();
		
	}

	private Employee employee;
	
	@Test
	
   void testsaveTask() {

		Task testTask = new Task(1, "Planning", LocalDate.parse("2024-02-01"), LocalDate.parse("2024-02-10"), 'A', employee);
		assertTrue(taskService.saveTask(testTask));
		Task testTask1 = new Task(4, "Execution", LocalDate.parse("2024-02-15"), LocalDate.parse("2024-02-22"), 'A', employee);
		assertTrue(taskService.saveTask(testTask1));
		Task testTask2 = new Task(8, "Project Information", LocalDate.parse("2024-02-23"), LocalDate.parse("2024-02-29"), 'A', employee);
		assertTrue(taskService.saveTask(testTask2));
		
	}
	
	//@Test
	//void testGetTaskById() {

	//	Task tasks = taskService.getTaskById("2");
		//assertNotNull(taskService.saveTask(tasks));

	//}
	
	//@Test
	//void testUpdateTask() {
		//Task tasks = new Task(2, "Budgets", LocalDate.parse("2024-03-01"), LocalDate.parse("2024-03-3"), 'A', employee);

	//	boolean updatedTasks = taskService.updateTask("2", tasks);
		//assertTrue(updatedTasks);

	//}

	//@Test

	//void testGetAllTasks() {

		//List<Task> taskList = ((Object) taskService).getAllTasks();
		//assertNotNull(taskList);
	//}

	//@Test
	// void testDeleteTask() {
		//boolean success = taskService.deleteTask("2");
		//assertTrue(success);
		// assertNull(taskService.getTaskById("2"));
	//}

	@AfterAll
	static void tearDown() {
		sessionFactory.close();
	}
	
}
