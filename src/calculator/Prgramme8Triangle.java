package calculator;

import java.util.Scanner;

/**8. Write a program to calculate the area of a triangle.**/


public class Prgramme8Triangle {
    public static void main(String[] args) {
        Scanner tri = new Scanner(System.in);// calling scanner
        System.out.println("Enter the base =  ");
        double k = tri.nextDouble();// store  static values
        System.out.println("Enter the height =  ");

        double n = tri.nextDouble();// stote static values
        trangle(k,n);// calling static method
        tri.close();
    }
        //static method
     public static void trangle(double k,double n){

            double area = (k * n) / 2;
            System.out.println("Calculate the area of a Triangle =" + area);
        }
    }
