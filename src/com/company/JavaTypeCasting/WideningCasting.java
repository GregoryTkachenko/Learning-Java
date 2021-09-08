package com.company.JavaTypeCasting;

/*
Type casting is when you assun a value of primitive data type to another type.
In Java, there are two types of casting:
1. Widening Casting (automatically) - converting a smaller type to a larger type size
   byte -> short -> char -> int -> long -> float -> double
2. Narrowing Casting (manually) - converting a larger type to a smaller size type
   double -> float -> long -> int -> char -> short -> byte
 */
// Widening casting is done automatically when passing a smaller size to a larger size type:
public class WideningCasting {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt;          //Automatic casting: int to double
        System.out.println(myInt);        //Outputs 9
        System.out.print(myDouble);       //Outputs 9.0
    }

}
