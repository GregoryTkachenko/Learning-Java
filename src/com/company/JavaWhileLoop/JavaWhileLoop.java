package com.company.JavaWhileLoop;

/*
The while loop through a block of code as long as a specified condition is true:

Syntax
while (condition) {
  // code block to be executed
}

In example below, the code in the loop will run, over and over again,
as long as a variable (i) is lees than 5:

 */
public class JavaWhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
            System.out.println(i);
            i++;
        }
    }
}
// Do not forget to increase the variable used in the condition, otherwise the loop will never end!
