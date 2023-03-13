package calculator;

import java.util.Scanner;

/**13. Write a Java program that takes three numbers as input to calculate and
 print the average of the numbers.**/
public class Programme13Average {
    public static void main (String[]args){
        Scanner scanner = new Scanner(System.in);//calling scanner
        System.out.println("Enter first  Number = ");
        double a = scanner.nextDouble();//store value
        System.out.println("Enter second Number = ");
        double b = scanner.nextDouble();
        System.out.println("Enter third  Number = ");
        double c = scanner.nextDouble();
        average(a,b,c);//calling static method
        scanner.close();
        //static method
    }public static void average(double a,double b, double c) {
        double result = (a+b+c)/3;
        System.out.println(result);
    }
}
