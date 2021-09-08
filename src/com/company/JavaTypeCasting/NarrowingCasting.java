package com.company.JavaTypeCasting;

//Narrowing casting must be done manually by placing the type in parentheses in front of the value:
public class NarrowingCasting {
    public static void main(String[] args) {
        double myDouble = 9.78;
        int myInt = (int) myDouble;       //Manual casting: double to int
        System.out.println(myDouble);     //Outputs 9.78
        System.out.println(myInt);        //Outputs 9
    }
}



