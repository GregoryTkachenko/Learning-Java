package com.company.JavaMethods;

/*
This method returns the sum of a method's two parameters:
 */
public class ReturnValuesTwoParameters {
    static int myMethod(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        System.out.println(myMethod(5, 3));
    }
}
// Outputs 8 ( 5 + 3)

