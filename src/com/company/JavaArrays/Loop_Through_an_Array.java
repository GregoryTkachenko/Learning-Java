package com.company.JavaArrays;

/*
You can loop through the array elements with the for loop, and use the length property to specify
how many times the loop should run.
The following example outputs all elements in the cars array:
 */
public class Loop_Through_an_Array {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i]);
        }
    }
}
