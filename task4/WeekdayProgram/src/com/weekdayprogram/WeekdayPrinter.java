package com.weekdayprogram;

import java.util.Scanner;

public class WeekdayPrinter {
	public static void main(String[] args) {
        // Array storing names of the weekdays
        String[] weekdays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        // Scanner to get user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the day position (0-6): ");
        
        try {
            // Get the day position from the user
            int dayIndex = scanner.nextInt();
            
            // Print the corresponding weekday
            System.out.println("The day is: " + weekdays[dayIndex]);
            
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handle the exception if the index is out of bounds
            System.out.println("Invalid day index! Please enter a number between 0 and 6.");
            
        } catch (Exception e) {
            // Handle any other possible exceptions (like invalid input type)
            System.out.println("Invalid input! Please enter a valid number.");
        } finally {
            scanner.close(); // Close the scanner resource
        }
    }

}
