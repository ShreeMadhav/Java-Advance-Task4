package com.integerstack;

import java.util.Stack;

public class IntegerStackManager {
	 // Stack to store integers
    private Stack<Integer> stack;

    // Constructor to initialize the stack
    public IntegerStackManager() {
        stack = new Stack<>();
    }

    // Method to push elements onto the stack
    public void pushElement(int element) {
        stack.push(element);
        System.out.println("Pushed " + element + " onto the stack.");
    }

    // Method to pop elements from the stack
    public void popElement() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty! Cannot pop any elements.");
        } else {
            int poppedElement = stack.pop();
            System.out.println("Popped " + poppedElement + " from the stack.");
        }
    }

    // Method to check if the stack is empty
    public void checkIfEmpty() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Stack is not empty.");
        }
    }

    // Method to display the stack elements
    public void displayStack() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
        } else {
            System.out.println("Current stack: " + stack);
        }
    }

}
