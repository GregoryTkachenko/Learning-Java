package com.company.JavaArrays;

/*
There is also a "for-each" loop, which is used exclusively to loop through elements in arrays:
Syntax
for (type variable : arrayName) {
  ...
}

The following example outputs all elements in the cars array, using a "for-each" loop:
*/
public class Loop_Through_an_Array_with_For_Each {
    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i);
        }
    }
}
/*
The example above can be read like this:
for each String element (called i - as in index) in cars,
print out the value of i.

If you compare the for loop and for-each loop, you will see that the for-each method
is easier to write, it does not require a counter (using the length property), and it is more readable.
*/