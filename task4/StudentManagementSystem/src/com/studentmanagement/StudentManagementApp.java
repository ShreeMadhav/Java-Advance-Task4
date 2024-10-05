package com.studentmanagement;

import java.util.ArrayList;
import java.util.List;

public class StudentManagementApp {
	 public static void main(String[] args) {
	        // List to store multiple student objects
	        List<Student> students = new ArrayList<>();

	        try {
	            // Adding valid student
	            students.add(new Student(101, "John Doe", 19, "Computer Science"));
	            students.add(new Student(102, "Jane Roe", 20, "Physics"));

	            // Adding student with invalid age
	            students.add(new Student(103, "Alice Smith", 23, "Mathematics")); // This will throw AgeNotWithinRangeException

	        } catch (AgeNotWithinRangeException | NameNotValidException e) {
	            System.out.println(e.getMessage());
	        }

	        try {
	            // Adding student with invalid name
	            students.add(new Student(104, "Bob@123", 18, "Biology")); // This will throw NameNotValidException

	        } catch (AgeNotWithinRangeException | NameNotValidException e) {
	            System.out.println(e.getMessage());
	        }

	        // Display all students in the list
	        System.out.println("\nList of Valid Students:");
	        for (Student student : students) {
	            System.out.println(student);
	        }
	    }
}
