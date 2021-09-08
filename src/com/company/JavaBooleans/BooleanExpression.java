package com.company.JavaBooleans;
/*
A Boolean expression
is a Java expression that returns a Boolean value: true or false.
You can use a comparison operator, such as the greater than (>) operator to
find out if an expression (or a variable) is true:
 */
public class BooleanExpression {
    public static void main(String[] qrgs) {
        int x = 10;
        int y = 9;
        System.out.println(x > y);           // returns true, because 10 is higher than 9
        System.out.println(y > x);           // returns false, because 9 is lower then 10
        System.out.println(x == y);          // returns false, because 10 not equal 9
    }
}

