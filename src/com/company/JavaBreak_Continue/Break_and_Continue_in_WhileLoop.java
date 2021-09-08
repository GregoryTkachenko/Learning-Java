package com.company.JavaBreak_Continue;

/*
You csn also use break and continue in while loop:

 */
public class Break_and_Continue_in_WhileLoop {
    public static void main(String[] args) {
        int i = 0;
        while (i < 10) {
            System.out.println(i);
            i++;
            if (i == 4) {
                break;
            }
        }
    }
}
/*
Continue example
int i =0;
while (i < 10) {
  if (i == 4) {
    i ++;
    continue;
  }
  System.out.println(i);
  i++;
}

 */