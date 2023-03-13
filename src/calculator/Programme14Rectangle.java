package calculator;

import java.util.Scanner;

/**14. Write a Java program to print the area and perimeter of a rectangle.

 Test Data:
 Width = 5.5 Height = 8.5

 Expected Output:

 Area is 5.6 * 8.5 = 47.60
 Perimeter is 2 * (5.6 + 8.5) = 28.20**/

public class Programme14Rectangle {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter width of Tringle =");
        double wi = scanner.nextDouble();
        System.out.println("Enter Height of Tringle =");
        double he = scanner.nextDouble();
        area(wi,he);
        scanner.close();
        }



    public static void area(double a , double b ){
        double result = a * b;
        System.out.println(" Print the area =" + result);
        double result1= 2 * (a+b);
        System.out.println(" Print the perimeter =" + result1);

    }
}
