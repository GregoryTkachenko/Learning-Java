package com.company.Java_If_Else;

/*
Use the else statement to specify a block of the code to be executed is the condition is false.

Syntax
 if (condition) {
   // block of code to be executed if the condition is false
} else {
   // block of code to be executed if the condition is false
}

 */
public class The_else_Statement {
    public static void main(String[] args) {
        int time = 20;
        if (time < 18) {
            System.out.println("Good day.");
        } else {
            System.out.println("Good evening");
        }
    }
}
// Output "Good evening."
