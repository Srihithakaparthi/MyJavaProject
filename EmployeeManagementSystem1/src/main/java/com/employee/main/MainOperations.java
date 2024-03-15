package com.employee.main;

import java.util.Scanner;

public class MainOperations {
	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner(System.in);
		
		while(true) {
			System.out.println("welcome to EmployeeManagementSystem:\n" +"1.Employee Details\n" + "2.Department Details\n" +
		"3.Task Details\n" + "4.Project Details\n" + "5.Leave Details\n" + "6.Attendence Details\n");
			int input = scanner.nextInt();
			switch(input) {
			case 1:
				AllOperations.EmployeeOperations();
				System.out.println("==========================================");
			    break;
			    
			case 2:
				AllOperations.DepartmentOperations();
				System.out.println("==========================================");
			    break;
			    
			case 3:
				AllOperations.TaskOperations();
				System.out.println("==========================================");
			    break;
			    
			case 4:
				AllOperations.ProjectOperations();
				System.out.println("==========================================");
			    break;
			    
			case 5:
				AllOperations.LeaveOperations();
				System.out.println("==========================================");
			    break;
			    
			case 6:
				AllOperations.AttendenceOperations();
				System.out.println("==========================================");
			    break;			    
			    
			}
		}
	}

}
