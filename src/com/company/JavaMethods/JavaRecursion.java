package com.company.JavaMethods;

/*
Java Recursion
Recursion is the technique of making a function call itself.
This technique provides a way to break complicated problems down into simple problems which are easier to solve.

Recursion may be a bit difficult to understand. The best way to figure out how it works is to experiment with it.

Recursion Example
Adding two numbers together is easy to do, but adding a range of numbers is more complicated.
In the following example, recursion is used to add a range of numbers together by breaking it down
into the simple task of adding two numbers:

Example
Use recursion to add all of the numbers up to 10.

 */
public class JavaRecursion {
    public static void main(String[] args) {
        int result = sum(10);
        System.out.println(result);
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
        }
    }
}

/*
Example Explained
When the sum() function is called, it adds parameter k to the sum of all numbers smaller than k
and returns the result. When k becomes 0, the function just returns 0.
When running, the program follows these steps:

10 + sum(9)
10 + (9 + sum(8) )
10 + (9 + ( 8 + sum(7) ) )
...
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 +  2 + 1 + sum(0)
10 + 9 + 8 + 7 + 6 + 5 + 4 + 3 + 2 + 1 + 0
Since the function does not call itself when k is 0, the program stops there and returns the result.

*/