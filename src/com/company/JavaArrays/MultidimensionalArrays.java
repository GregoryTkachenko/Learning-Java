package com.company.JavaArrays;

/*
A multidimensional arrays is an array containing one or more arrays.
To create a ywo-dimensional array, add each array within its own set of curly braces:
Example
int[][] myNumbers = { {1,2,3,4}, {5,6,7} };
myNumbers is now an array with two arrays as its elements.

To access the elements of the myNumbers array, specify two indexes:
one for array, and one for the element inside that array.
This example accesses the third element (2) in the second array (1) of myNumbers:
*/
public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] myNumbers = {{1, 2, 3, 4}, {5, 6, 7}};
        int x = myNumbers[1][2];
        System.out.println(x);         //Outputs 7
    }
}
/*
We can also use for loop inside another for loop to get the elements
of a two-dimensional array (we still have to point to the two indexes):
public class MultidimensionalArrays {
    public static void main(String[] args) {
    int[][] myNumbers = { {1,2,3,4}, {5,6,7} };
    for (int i = 0; i < myNumbers.length; ++i) {
       for (int j = 0; j < myNumbers[i].length; ++j) {
        System.out.println(myNumbers[i][j]);
      }
    }
  }
}
 */