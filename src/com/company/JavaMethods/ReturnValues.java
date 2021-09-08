package com.company.JavaMethods;

/*
The void keyword, used in the examples above, indicates that the method should not return a value.
If you want the method to return a value, you can use primitive data type (such as int, char,etc.)instead of void,
 and the return keyword inside the method:
 */
public class ReturnValues {
    static int myMethod(int x) {
        return 5 + x;
    }

    public static void main(String[] qrgs) {
        System.out.println(myMethod(3));
    }
}
// Outputs 8 (5 + 3)

