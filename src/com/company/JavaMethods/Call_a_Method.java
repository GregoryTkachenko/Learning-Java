package com.company.JavaMethods;

/*
To call a method in Java, write the method's name followed by two parentheses () and semicolon;
In the following example, myMethod() is used to print a text (the action), when it is called:
Example
Inside main, call the myMethod() method:
public class Main {
    static void myMethod() {
        System.out.println(" I just got executed!");
    }

    public static void main (String[] args) {
      myMethod();
    }
}
// Outputs "I just got executed!"
*/
public class Call_a_Method {
    static void myMethod() {
        System.out.println("I just got executed!");
    }

    public static void main(String[] args) {
        myMethod();
    }
}
