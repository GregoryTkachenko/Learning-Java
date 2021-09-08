package com.company.JavaForLoop;

/*
There is also a "for-each" loop, which is used exclusively to loop through elements in an array:

Syntax
for (type variableName : arrayName) {
  // code block to be executed
}

The following example outputs all elements in the cars array, using a "for-each" loop:

 */
public class For_EachLoop {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
/*
Don't worry if you don't understand the example above.
You will learn more about Arrays in the Arrays chapter.
 */
