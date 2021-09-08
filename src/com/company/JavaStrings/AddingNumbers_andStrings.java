package com.company.JavaStrings;

/*
Java uses the + operator for both addition and concatenation.
Numbers are added. Strings are concatenated.
 */
public class AddingNumbers_andStrings {
    public static void main(String[] args) {
//If you add two numbers, the result will be a number:
        int x = 10;
        int y = 20;
        int z = x + y;         // z will be 30 (an integer/number)
//If you add a number and a string, the result will be a string concatenation:
        String a = "10";
        int b = 30;
        String c = a + b;
        System.out.println(z);
        System.out.println(c);  //c will be 1030 (a String)
    }
}
