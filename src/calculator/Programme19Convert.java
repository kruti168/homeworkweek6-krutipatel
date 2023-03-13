package calculator;

import java.util.Scanner;

/**19. Write a Java program to convert a given string into lowercase.
 Sample Input: THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG.
 Output: the quick brown fox jumps over the lazy dog.**/

public class Programme19Convert {
public static void main (String []args) {
    String upper;
    Scanner scanner = new Scanner(System.in);//calling scanner
    System.out.println("Enter Upper Case word = ");
    upper = scanner.nextLine();// store memory
    String lower = upper.toLowerCase();//convert lower case,using lowercase()method
    System.out.println("LowerCase Letter = " + lower);
    scanner.close();
}
}






