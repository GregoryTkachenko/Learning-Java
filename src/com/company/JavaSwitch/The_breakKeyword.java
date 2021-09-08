package com.company.JavaSwitch;
/*
The break Keyword:
When Java reaches a break keyword,it break out of the switch block.
This will stop the execution of more code and case testing inside the block.
When a match id found, and the job is done, it's time for a break.
There is no need to testing.

The default Keyword:
The default keyword specifies some code to run if there is no case match:

 */
public class The_breakKeyword {
    public static void main(String[] args) {
       int day = 4;
       switch (day) {
           case 1:
               System.out.println("Today is Saturday");
               break;
           case 2:
               System.out.println("Today is Sunday");
               break;
           default:
               System.out.println("Looking forward to the Weekend");
       }
    }
}
// Outputs "Looking forward to the Weekend"
