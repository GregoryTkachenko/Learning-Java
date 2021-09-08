package com.company.JavaStrings;
//The indexOf() method returns the index (the position)
// of the first occurrence of a specified text in a string (including whitespace):
public class Finding_a_Character_in_a_String {
    public static void main(String[] args) {
     String txt = "Please locate where 'locate' occurs";
     System.out.println(txt.indexOf("locate"));       //Outputs 7
    }
}
//Java counts positions from zero.
//0 is the first position in a string, 1 is the second, 2 is the third ...