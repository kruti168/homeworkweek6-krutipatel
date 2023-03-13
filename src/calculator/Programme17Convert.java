package calculator;
/**17. Write a Java program to convert a decimal number to binary number.

 Input Data:
 Input a Decimal Number : 5
 Expected Output

 Binary number is: 101**/
import java.util.Scanner;

public class Programme17Convert {
    public static void main (String[]args){

        Scanner decibin = new Scanner(System.in);//call scanner
        System.out.println("Enter Decimal Number =");
        int x = decibin.nextInt();
        System.out.println("Convert Binary Number :"+ Integer.toBinaryString(x));
        decibin.close();
    }
}
