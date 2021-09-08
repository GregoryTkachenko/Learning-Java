package com.company.Variables;

/* In Java, there are different types of variables, for example:
String - stores text, such as "Hello". String values are surrounded by double quotes
int - stores integers (whole numbers), without decimals, such as 123 or -123
float - stores floating point numbers, with decimals, such as 19.99 or -19.99
char - stores single characters, such as 'a' or 'B'. Char values are surrounded by single quotes
boolean - stores values with two states: true or false
*/


public class Variables {
    public static void main(String[] args) {
        String name = "John";
        String firstName = "John";
        String lastName = "Doe";
        String fullName = firstName + " " + lastName;
        int myNum = 15;                  // we can use final variable - final int myNum = 15;
        myNum = 20;                      // myNum is now 20
        int myNum2;
        myNum2 = 16;
        int x = 5;
        int y = 6;
        int q = 10, w = 20, z = 50;
        // Good
        int minutesPerHour = 60;

        // OK, but not so easy to understand what m actually is
        int m = 60;

        System.out.println(name);
        System.out.println(myNum);
        System.out.println(myNum2);
        System.out.println("Hello " + name);
        System.out.println(fullName);
        System.out.println(x + y);          // print the value of x + y
        System.out.println(q + w + z);     // To declare more then one variables same type, use comma-separated list
        System.out.print(minutesPerHour);
        System.out.println(m);

    }
}
/* other types:
int myNum = 5;
float myFloatNum = 5.99f;
char myLetter = 'D';
boolean myBool = true;
String myText = "Hello";
 */





