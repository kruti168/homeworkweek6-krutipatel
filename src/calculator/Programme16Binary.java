package calculator;

import java.util.Scanner;

/**16. Write a Java program to add two binary numbers.

 Input Data:
 Input first binary number: 10
 Input second binary number: 11
 Expected Output:

 Sum of two binary numbers: 101**/


public class Programme16Binary {
    public static void main (String[]args){
        Scanner deci = new Scanner(System.in);//calling scanner
        System.out.println("Enter First Binary Number =");
        String n1 = deci.next();//store memory
        System.out.println("Enter Second Binary Number =");
        String n2 = deci.next();

        int a = Integer.parseInt(n1,2 );//assign values
        int b = Integer.parseInt(n2,2);
        int c = a + b;//store result

        System.out.println("A = " + Integer.toBinaryString(a));
        System.out.println("B = " + Integer.toBinaryString(b));
        System.out.println("C = A + B"  +Integer.toBinaryString(c));
        deci.close();
    }
}
