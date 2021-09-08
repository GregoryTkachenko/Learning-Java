package com.company.JavaMethods;

/*
A method can also be called multiple times:
 */
public class Call_a_Method_multiple_times {
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    public static void main(String[] args) {
        myMethod();
        myMethod();
        myMethod();
    }
}
// I just got executed!
// I just got executed!
// I just got executed!
