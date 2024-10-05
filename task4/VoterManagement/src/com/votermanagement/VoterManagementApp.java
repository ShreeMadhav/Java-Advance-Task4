package com.votermanagement;

public class VoterManagementApp {
	 public static void main(String[] args) {
	        try {
	            // Creating a voter with valid age
	            Voter voter1 = new Voter(1, "John Doe", 25);
	            System.out.println(voter1);

	            // Creating a voter with invalid age (throws InvalidVoterAgeException)
	            Voter voter2 = new Voter(2, "Jane Roe", 16); // This will throw the exception
	            System.out.println(voter2);

	        } catch (InvalidVoterAgeException e) {
	            System.out.println(e.getMessage());
	        }
	    }

}
