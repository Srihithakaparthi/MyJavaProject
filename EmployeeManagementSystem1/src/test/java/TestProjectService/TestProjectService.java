package TestProjectService;

import static org.junit.jupiter.api.Assertions.*;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import com.employee.entities.Employee;
import com.employee.entities.Project;
import com.employee.service.ProjectService;
import com.employee.serviceImpl.ProjectServiceImpl;
import com.hibernateUtil.HibernateUtil;

public class TestProjectService {

	static SessionFactory sessionFactory;
	static Session session;
	static ProjectService projectService;
	
	@BeforeAll
    static void SetUp() {
		sessionFactory = HibernateUtil.getSessionFactory();
		projectService = new ProjectServiceImpl();
        
		employee = new Employee();
	}

	private static Employee employee;
	
	@Test
	
   void testsaveProject() {

		Project testProject = new Project(22685, 50000.00, "In Progress", 'A', employee);
		assertTrue(projectService.saveProject(testProject));
		
		Project testProject1 = new Project(2205, 25000.00, "Pending", 'A', employee);
		assertTrue(projectService.saveProject(testProject1));
		
		Project testProject2 = new Project(5012, 70000.00, "Completed", 'A', employee);
		assertTrue(projectService.saveProject(testProject2));


	}
	
	//@Test
	//void testGetProjectById() {

	//	Project projects = projectService.getProjectById("2");
		//assertNotNull(projectService.saveProject(projects));

	//}
	
	//@Test
	//void testUpdateProject() {
		//Project projects = new Project(2206, 65000.00, "In Progress", 'A', employee);

	//	boolean updatedProjects = projectService.updateProject("2206", projects);
		//assertTrue(updatedProjects);

	//}

	//@Test

	//void testGetAllProjects() {

		//List<Project> projectList = ((Object) projectService).getAllProjects();
		//assertNotNull(projectList);
	//}

	//@Test
	// void testDeleteProject() {
		//boolean success = projectService.deleteProject("2206");
		//assertTrue(success);
		// assertNull(projectService.getProjectById("2206"));
	//}

	@AfterAll
	static void tearDown() {
		sessionFactory.close();
	}
	
}
