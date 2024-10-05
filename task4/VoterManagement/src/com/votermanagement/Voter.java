package com.votermanagement;

public class Voter {
	 private int voterId;
	    private String name;
	    private int age;

	    public Voter(int voterId, String name, int age) throws InvalidVoterAgeException {
	        if (age < 18) {
	            throw new InvalidVoterAgeException("invalid age for voter");
	        }
	        this.voterId = voterId;
	        this.name = name;
	        this.age = age;
	    }

	    // Getters and Setters
	    public int getVoterId() {
	        return voterId;
	    }

	    public void setVoterId(int voterId) {
	        this.voterId = voterId;
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

	    public void setAge(int age) throws InvalidVoterAgeException {
	        if (age < 18) {
	            throw new InvalidVoterAgeException("invalid age for voter");
	        }
	        this.age = age;
	    }

	    @Override
	    public String toString() {
	        return "Voter [VoterId=" + voterId + ", Name=" + name + ", Age=" + age + "]";
	    }

}
