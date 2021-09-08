package com.company.JavaOperators;

//Assignment operators are used to assign values to variables.
//In the example below, we use the assignment operator (=) to assign the value 10 to a variable called x:
public class JavaAssignmentOperators {
    public static void main(String[] args) {
        int x = 10;
        //The addition assignment operator (+=) adds a value to a variable:
        int a = 10;
        a += 5;
        System.out.println(x);
        System.out.print(a);
    }
}

/*A list of all assignment operators:
Operator	        Example	            Same As	Try it
=	                x = 5	            x = 5
+=	                x += 3	            x = x + 3
-=	                x -= 3	            x = x - 3
*=	                x *= 3	            x = x * 3
/=	                x /= 3	            x = x / 3
%=	                x %= 3              x = x % 3
&=	                x &= 3          	x = x & 3
|=	                x |= 3	            x = x | 3
^=	                x ^= 3	            x = x ^ 3
>>=               	x >>= 3         	x = x >> 3
<<=	                x <<= 3	            x = x << 3
*/