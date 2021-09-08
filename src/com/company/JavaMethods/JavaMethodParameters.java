package com.company.JavaMethods;

/*
Parameters and Arguments
Information can be passed to methods as parameter.Parameters act as variables inside the method.

Parameters are specified after the method name, inside the parentheses.
You can add as many parameters as you want, just separate them with comma.

The following example has a method that takes a String called fname as parameter.
When the method is called, we pass along a first name, which is used inside the method to print the full name:
*/
public class JavaMethodParameters {
    static void myMethod(String fname) {

        System.out.println(fname + " Refsnes");
    }

    public static void main(String[] args) {
        myMethod("Liam");
        myMethod("Jenny");
        myMethod("Anja");
    }
}
// Liam Refsnes
// Jenny Refnes
// Anja Refnes
/*
When a parameter is passed to the method, it is called an argument.
So, from the example above: fname is parameter, while Liam, Jenny and Anja are arguments.
 */