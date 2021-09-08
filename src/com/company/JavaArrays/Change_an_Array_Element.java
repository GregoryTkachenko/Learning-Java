package com.company.JavaArrays;

/*
To change the value of a specific element, refer tj the index number:
cars[0]="Opel";
 */
public class Change_an_Array_Element {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        cars[0] = "Opel";
        System.out.println(cars[0]);
    }
}
// Now outputs Opel instead of Volvo