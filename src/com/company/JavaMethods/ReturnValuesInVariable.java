package com.company.JavaMethods;

/*
You can also store the result in a variable (recommended, as it is easier to read and maintain):
 */
public class ReturnValuesInVariable {
    static int myMethod(int x, int y) {
        return x + y;
    }

    public static void main(String[] args) {
        int z = myMethod(5, 3);
        System.out.println(z);
    }
}
// Outputs 8 (5 + 3)


