package com.company.JavaOperators;
//Logical operators are used to determine the logic between variables or values:
public class JavaLogicalOperators {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(x > 3 && x < 10);    // returns true because 5 is greater than 3 AND 5 is less than 10
    }
}
/*
Operator	    Name	        Description	                                                Example
&& 	            Logical and	    Returns true if both statements are true	                x < 5 &&  x < 10
|| 	            Logical or	    Returns true if one of the statements is true	            x < 5 || x < 4
!	            Logical not	    Reverse the result, returns false if the result is true	    !(x < 5 && x < 10)
 */