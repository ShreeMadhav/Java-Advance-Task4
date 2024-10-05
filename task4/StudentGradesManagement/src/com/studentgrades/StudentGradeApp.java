package com.studentgrades;

import java.util.Scanner;

public class StudentGradeApp {
	 public static void main(String[] args) {
	        StudentGradeManager manager = new StudentGradeManager();
	        Scanner scanner = new Scanner(System.in);
	        
	        while (true) {
	            System.out.println("\n--- Student Grade Management System ---");
	            System.out.println("1. Add Student");
	            System.out.println("2. Remove Student");
	            System.out.println("3. Display Student Grade");
	            System.out.println("4. Display All Students");
	            System.out.println("5. Exit");
	            System.out.print("Choose an option: ");
	            
	            int option = scanner.nextInt();
	            scanner.nextLine();  // Consume newline
	            
	            switch (option) {
	                case 1: 
	                    System.out.print("Enter student name: ");
	                    String name = scanner.nextLine();
	                    System.out.print("Enter grade: ");
	                    int grade = scanner.nextInt();
	                    manager.addStudent(name, grade);
	                    break;
	                
	                case 2:
	                    System.out.print("Enter student name to remove: ");
	                    String nameToRemove = scanner.nextLine();
	                    manager.removeStudent(nameToRemove);
	                    break;
	                
	                case 3:
	                    System.out.print("Enter student name to display grade: ");
	                    String nameToDisplay = scanner.nextLine();
	                    manager.displayStudentGrade(nameToDisplay);
	                    break;
	                    
	                case 4:
	                    manager.displayAllStudents();
	                    break;
	                
	                case 5:
	                    System.out.println("Exiting the system...");
	                    scanner.close();
	                    return;
	                
	                default:
	                    System.out.println("Invalid option! Please choose a valid option.");
	            }
	        }
	    }

}
