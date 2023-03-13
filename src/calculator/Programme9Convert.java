package calculator;

import java.util.Scanner;

/**9. Write a program to convert the upper case to lower case.**/

public class Programme9Convert {
    public static void main (String []args){
        String upper;
        Scanner scanner = new Scanner(System.in);//calling scanner
        System.out.println("Enter Upper Case word = ");
        upper = scanner.nextLine();// store memory
        String lower = upper.toLowerCase();//convert lower case,using lowercase()method
        System.out.println("LowerCase Letter = " +  lower);
        scanner .close();

    }



}
