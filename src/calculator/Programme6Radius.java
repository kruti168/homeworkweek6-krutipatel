package calculator;

import java.util.Scanner;
/**6. Write a program to enter any radius value of the circle and find out the
 area.(Formula of Area A=PI*r*r).**/

public class Programme6Radius {
    public static void main (String[]args) {
  Scanner scanner = new Scanner(System.in);
    System.out.println ("Enter any radius Value of the Circle : ");
    double r= scanner.nextDouble();
  Programme6Radius obj1 = new Programme6Radius();
  obj1.radius(r);
  scanner.close();

    }
    public void radius (double r){
      double area = Math.PI*r*r;
    System.out.println("Area  =  "  + area);
    }


}
