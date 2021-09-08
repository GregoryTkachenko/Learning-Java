package com.company.JavaStrings;

//The + operator can be used between strings to combine them. This is called concatenation:
public class StringConcatenation {
    public static void main(String[] args) {
//Note that we have added an empty text (" ") to create a space between firstName and lastName on print.
        String firstName = "John";
        String lastName = "Doe";
//You can also use the concat() method to concatenate two strings:
        String fName ="John ";
        String lName = "Doe";
        System.out.println(firstName + " " + lastName);
        System.out.println(fName.concat(lName));
    }
}
