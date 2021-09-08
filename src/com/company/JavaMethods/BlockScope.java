package com.company.JavaMethods;

/*
A block of code refers to all of the code between carly braces {}.
Variable declared inside blocks of code are only accessible by the code between the curly braces,
which follows the line in which the variable was declared:

*/
public class BlockScope {
    public static void main(String[] args) {
        // Code here CANNOT use x

        { // This is a block
            // Code here CANNOT use x
            int x = 100;
            // Code here Can use x;
            System.out.println(x);
        }  // The block ends here

        // Code CANNOT use x
    }
}

/*
A block of code may exist on its own or it can belong to an if, while or for statement.
In the case of for statements,
variables declared in the statement itself are also available inside block's scope.

*/
