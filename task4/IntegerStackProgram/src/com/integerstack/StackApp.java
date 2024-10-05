package com.integerstack;

import java.util.Scanner;

public class StackApp {
	public static void main(String[] args) {
        IntegerStackManager stackManager = new IntegerStackManager();
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            System.out.println("\n--- Integer Stack Operations ---");
            System.out.println("1. Push Element");
            System.out.println("2. Pop Element");
            System.out.println("3. Check if Stack is Empty");
            System.out.println("4. Display Stack");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            
            int option = scanner.nextInt();
            
            switch (option) {
                case 1:
                    System.out.print("Enter an integer to push: ");
                    int element = scanner.nextInt();
                    stackManager.pushElement(element);
                    break;
                    
                case 2:
                    stackManager.popElement();
                    break;
                    
                case 3:
                    stackManager.checkIfEmpty();
                    break;
                    
                case 4:
                    stackManager.displayStack();
                    break;
                    
                case 5:
                    System.out.println("Exiting the program...");
                    scanner.close();
                    return;
                    
                default:
                    System.out.println("Invalid option! Please choose a valid option.");
            }
        }
    }

}
