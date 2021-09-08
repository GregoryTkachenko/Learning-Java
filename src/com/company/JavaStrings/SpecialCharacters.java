package com.company.JavaStrings;
//Because strings must be written within quotes, Java will misunderstand this string, and generate an error:
//String txt = "We are the so-called "Vikings" from the north." - gives error!!!
/*The solution to avoid this problem, is to use the backslash escape character.
The backslash (\) escape character turns special characters into string characters:
Escape character	    Result	        Description
\'	                    '	            Single quote
\"	                    "	            Double quote
\\	                    \	            Backslash

 */
public class SpecialCharacters {
    public static void main(String[]args) {
        String txt = "We are the so-called \"Vikings\" from the north.";
        System.out.println(txt);

    }
}
/*
Six other escape sequences are valid in Java:
Code	            Result	Try it
\n	                New Line
\r	                Carriage Return
\t	                Tab
\b	                Backspace
\f              	Form Feed

 */