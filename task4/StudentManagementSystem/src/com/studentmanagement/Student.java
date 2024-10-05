package com.studentmanagement;

public class Student {
	 private int rollNo;
	    private String name;
	    private int age;
	    private String course;

	    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
	        if (age < 15 || age > 21) {
	            throw new AgeNotWithinRangeException("Age is not within the valid range of 15 to 21.");
	        }
	        
	        if (!name.matches("[a-zA-Z ]+")) {
	            throw new NameNotValidException("Name contains invalid characters. Only alphabets are allowed.");
	        }

	        this.rollNo = rollNo;
	        this.name = name;
	        this.age = age;
	        this.course = course;
	    }

	    // Getters and Setters

	    public int getRollNo() {
	        return rollNo;
	    }

	    public void setRollNo(int rollNo) {
	        this.rollNo = rollNo;
	    }

	    public String getName() {
	        return name;
	    }

	    public void setName(String name) {
	        this.name = name;
	    }

	    public int getAge() {
	        return age;
	    }

	    public void setAge(int age) throws AgeNotWithinRangeException {
	        if (age < 15 || age > 21) {
	            throw new AgeNotWithinRangeException("Age is not within the valid range of 15 to 21.");
	        }
	        this.age = age;
	    }

	    public String getCourse() {
	        return course;
	    }

	    public void setCourse(String course) {
	        this.course = course;
	    }

	    @Override
	    public String toString() {
	        return "Student [Roll No = " + rollNo + ", Name = " + name + ", Age = " + age + ", Course = " + course + "]";
	    }
	}
