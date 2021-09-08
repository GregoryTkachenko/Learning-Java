package com.company.Java_If_Else;

/*
There is also a short-hand if else, which is know as the ternary operator because it consist of three operators.
It can be used to replace multiple lines of code with a single line.
It is often used to replace simple if else statements:

Syntax
variable = (condition) ? expressionTrue : expressionFalse;

 */
public class Short_Hand_If_ElseTernary_Operator {
    public static void main(String[] args) {
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);
    }
}
