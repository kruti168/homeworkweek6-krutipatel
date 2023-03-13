package calculator;

import java.util.Scanner;

/**15. Write a Java program to swap two variables.**/
public class Progarmme15Swap {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);//calling scanner
        System.out.println("Enter number1 =");
        int number1= scanner.nextInt();//store value in memory
        System.out.println("Enter number2 =");
        int number2= scanner.nextInt();

        System.out.println("Before swap number = " + number1 + "," + number2);
        swap(number1,number2);//calling static method
        scanner.close();
    }
    public static void swap(int a ,int b){
        //swapping logic
        int ab;
        ab= a;
        a =b;
        b = ab;
        System.out.println("After swap number a and b ="+ a + "," + b);

    }
}
