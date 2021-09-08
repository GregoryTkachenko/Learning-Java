package com.company.JavaMethods;

/*
With method overloading, multiple methods can have the same name with the different parameters:
Example:
int myMethod(int x)
float myMethod(float x)
double myMethod(double x, double y)

Consider the following example, which have two methods that add numbers of different type:

 */
public class JavaMethodOverloading {
    static int plusMethodInt(int x, int y) {
        return x + y;
    }

    static double plusMethodDouble(double x, double y) {
        return x + y;
    }

    public static void main(String[] args) {
        int myNum1 = plusMethodInt(8, 5);
        double myNum2 = plusMethodDouble(4.3, 6.26);
        System.out.println("int: " + myNum1);
        System.out.println("double: " + myNum2);
    }
}
/*
Instead of defining two methods that should do the same thing, it is better to overload one.
In the example below, we overload the plusMethod method to work for both int and double:
static int plusMethod(int x, int y) {
    return x + y;
}

static double plusMethod(double x, double y) {
    return x + y;
}

public static void main(String[] args) {
    int myNum1 = plusMethod(8, 5);
    double myNum2 = plusMethod(4.3, 6.26);
    System.out.println("int: " + myNum1);
    System.ouy=t.println("double: " + myNum2);
}

Note: Multiple method can have the same name as long as the number and/or type of parameters are different.

 */

