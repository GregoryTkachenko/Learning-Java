package com.company.JavaMethods;

/*
You can have as many parameters as you like:
 */
public class MultipleParameters {
    static void myMethod(String fname, int age) {
        System.out.println(fname + " is " + age);
    }

    public static void main(String[] args) {
        myMethod("Liam", 5);
        myMethod("Jenny", 8);
        myMethod("Anja", 31);
    }
}
// Liam is 5
// Jenny is 8
// Anja is 31
/*
Note that when you are working with multiple parameters, the method call must have the same number
of arguments as there are parameters, and the argument must be passed in the same order.
 */