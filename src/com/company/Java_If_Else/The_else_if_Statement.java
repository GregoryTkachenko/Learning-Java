package com.company.Java_If_Else;

/*
Use the else if statement to specify a new condition if the first condition is false.

Syntax
if (condition1) {
  // block of code to be executed if condition is true
} else if (condition2) {
  // block of code to be executed if the condition1 is false and condition2 is true
} else {
  // block of code to be executed if the condition1 is false and condition2 is false
}

 */
public class The_else_if_Statement {
    public static void main(String[] args) {
        int time = 22;
        if (time < 10) {
            System.out.println("Good morning.");
        } else if (time < 20) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening.");
        }
    }
}
