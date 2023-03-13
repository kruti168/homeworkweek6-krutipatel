package calculator;

import java.util.Scanner;

public class Programme10Tables {
    public static void main (String[]args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number for multiplication table =");
        int a = scanner.nextInt();
        System.out.println(a + " x 1 = " + (a * 1));
        System.out.println(a + " x 1 = " + (a * 2));
        System.out.println(a + " x 1 = " + (a * 3));
        System.out.println(a + " x 1 = " + (a * 4));
        System.out.println(a + " x 1 = " + (a * 5));
        System.out.println(a + " x 1 = " + (a * 6));
        System.out.println(a + " x 1 = " + (a * 7));
        System.out.println(a + " x 1 = " + (a * 8));
        System.out.println(a + " x 1 = " + (a * 9));
        System.out.println(a + " x 1 = " + (a * 10));
        scanner.close();

    }
}
