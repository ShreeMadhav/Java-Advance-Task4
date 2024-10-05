package com.studentgrades;

import java.util.HashMap;

public class StudentGradeManager {
	 private HashMap<String, Integer> studentGrades = new HashMap<>();
	    
	    // Method to add a new student
	    public void addStudent(String name, int grade) {
	        studentGrades.put(name, grade);
	        System.out.println(name + " has been added with grade: " + grade);
	    }
	    
	    // Method to remove a student by name
	    public void removeStudent(String name) {
	        if(studentGrades.containsKey(name)) {
	            studentGrades.remove(name);
	            System.out.println(name + " has been removed from the system.");
	        } else {
	            System.out.println(name + " not found in the system.");
	        }
	    }
	    
	    // Method to display a student's grade by name
	    public void displayStudentGrade(String name) {
	        if(studentGrades.containsKey(name)) {
	            System.out.println(name + "'s grade: " + studentGrades.get(name));
	        } else {
	            System.out.println(name + " not found in the system.");
	        }
	    }
	    
	    // Method to display all students and their grades
	    public void displayAllStudents() {
	        if (studentGrades.isEmpty()) {
	            System.out.println("No students in the system.");
	        } else {
	            System.out.println("Students and their grades:");
	            for (String name : studentGrades.keySet()) {
	                System.out.println(name + ": " + studentGrades.get(name));
	            }
	        }
	    }

}
