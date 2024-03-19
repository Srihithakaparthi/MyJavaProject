package com.employee.main;

import java.time.LocalDate;
import java.util.Scanner;

import com.employee.entities.Attendence;
import com.employee.entities.Department;
import com.employee.entities.Employee;
import com.employee.entities.Leaves;
import com.employee.entities.Project;
import com.employee.entities.Task;
import com.employee.serviceImpl.AttendenceServiceImpl;
import com.employee.serviceImpl.DepartmentServiceImpl;
import com.employee.serviceImpl.EmployeeServiceImpl;
import com.employee.serviceImpl.LeaveServiceImpl;
import com.employee.serviceImpl.ProjectServiceImpl;
import com.employee.serviceImpl.TaskServiceImpl;

public class AllOperations {

	static EmployeeServiceImpl employeeservice = new EmployeeServiceImpl();
	static DepartmentServiceImpl departmentservice = new DepartmentServiceImpl();
	static TaskServiceImpl taskservice = new TaskServiceImpl();
	static ProjectServiceImpl projectservice = new ProjectServiceImpl();
	static LeaveServiceImpl leaveservice = new LeaveServiceImpl();	
	static AttendenceServiceImpl attendenceservice = new AttendenceServiceImpl();
	
	static Scanner scanner = new Scanner(System.in);
	
	public static boolean employeeInput() {
		scanner.nextLine();
		System.out.println("Enter employeeId :");
		int employeeId = scanner.nextInt();
		System.out.println("Enter name :");
		String name = scanner.nextLine();
		System.out.println("Enter dateOfBirth");
		LocalDate dateOfBirth = LocalDate.parse(scanner.nextLine());
		System.out.println("enter email :");
		String email = scanner.nextLine();
		System.out.println("Enter phoneNumber");
		String phoneNumber = scanner.nextLine();
		System.out.println("Enter record_status");
		char record_status = (char) scanner.nextInt();
		
		//Department department = new Department(departmentId);
		Employee employee = new Employee(employeeId, name, dateOfBirth, email, phoneNumber,record_status);
		
		return employeeservice.saveEmployee(employee);
		
	}
	
	public static boolean departmentInput() {
		scanner.nextLine();
		System.out.println("Enter departmentId :");
		int departmentId = scanner.nextInt();
		System.out.println("Enter departmentName");
		String departmentname = scanner.nextLine();
		System.out.println("Enter location");
		String Location = scanner.nextLine();
		System.out.println("Enter record_status");
		char record_status = (char) scanner.nextInt();
		//int employeeId = scanner.nextInt();
		
		Employee employee = new Employee();
		Department department = new Department(departmentId,departmentname,Location,record_status,employee);		
		return departmentservice.saveDepartment(department);
	}
	public static boolean taskInput() {
		scanner.nextLine();
		System.out.println("Enter taskId :");
		int taskId = scanner.nextInt();
		System.out.println("Enter taskName");
		String taskName = scanner.nextLine();
		System.out.println("Enter startDate");
		LocalDate startDate = LocalDate.parse(scanner.nextLine());
		System.out.println("Enter endDate");
		LocalDate endDate = LocalDate.parse(scanner.nextLine());
		System.out.println("Enter record_status");
		char record_status = (char) scanner.nextInt();
		//int employeeId = scanner.nextInt();
		
		Employee employee = new Employee();
		Task task = new Task(taskId, taskName, startDate, endDate, record_status, employee);
		return taskservice.saveTask(task);
	}
	
	public static boolean projectInput() {
		scanner.nextLine();
		System.out.println("Enter projectId :");
		int projectId = scanner.nextInt();
		System.out.println("Enter budget");
		double budget = scanner.nextDouble();
		System.out.println("Enter status");
		String status = scanner.nextLine();
		System.out.println("Enter record_status");
		char record_status = (char) scanner.nextInt();
		//int employeeId = scanner.nextInt();
		
		Employee employee = new Employee();
		Project project = new Project(projectId, budget, status, record_status, employee);
		return projectservice.saveProject(project);
	}
	
	public static boolean leaveInput() {
		scanner.nextLine();
		System.out.println("Enter leaveId :");
		int leaveId = scanner.nextInt();
		System.out.println("Enter startDate");
		LocalDate startDate = LocalDate.parse(scanner.nextLine());
		System.out.println("Enter endDate");
		LocalDate endDate = LocalDate.parse(scanner.nextLine());
		System.out.println("Enter reason :");
		String reason = scanner.nextLine();
		System.out.println("Enter record_status");
		char record_status = (char) scanner.nextInt();
		//int employeeId = scanner.nextInt();
		
		Employee employee = new Employee();
		Leaves leave = new Leaves(leaveId, startDate, endDate, reason,  record_status,employee);
		return leaveservice.saveLeave(leave);
	}
	
	public static boolean attendenceInput() {
		scanner.nextLine();
		System.out.println("Enter attendenceId :");
		int attendenceId = scanner.nextInt();
		System.out.println("Enter date :");
		LocalDate date = LocalDate.parse(scanner.nextLine());
		System.out.println("Enter timeIn");
		String timeIn = scanner.nextLine();
		System.out.println("Enter timeOut");
		String timeOut = scanner.nextLine();
		System.out.println("Enter record_status");
		char record_status = (char) scanner.nextInt();
		//int employeeId = scanner.nextInt();
		
		Employee employee = new Employee();
		Attendence attendence = new Attendence(attendenceId,  date, timeIn, timeOut, record_status, employee);
		return attendenceservice.saveAttendence(attendence);
		
	}

	
}
