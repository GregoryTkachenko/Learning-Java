package com.company.JavaMethods;

/*
It is common to use if...else statements inside methods:
 */
public class A_Method_with_If_Else {

    // Create a  checkAge() method with an integer variable called age
    static void checkAge(int age) {
        //If age less 18, print "access denied"
        if (age < 18) {
            System.out.println("Access denied - You are not old enough!");
            // If age is greater than, or equal to 18, print "access granted"
        } else {
            System.out.println("Access granted - You are old enough!");
        }
    }

    public static void main(String[] args) {
        checkAge(20);      //Call the checkAge method and pass along an age of 20
    }
}
// Outputs "Access granted - You are old enough!"
