package calculator;

import java.util.Scanner;

/**7. Write a program to insert any temperature value in degree Fahrenheit and
        convert to degree Celsius ((F − 32) × 5/9 = 0°C).**/


public class Programme7Fahrenheit {

    public static void main (String[]args){
        Scanner degree =new Scanner(System.in);// Call Scanner
        System.out.println("Insert any temperature value in degree Fajrenheit =");
        float f = degree.nextFloat();//storing value into variable
        Programme7Fahrenheit obj1 = new Programme7Fahrenheit();//calling instance method
        obj1.tempe( f);
        degree.close();
    //instance method
    }
    public void tempe(float f){
       float celsius = ((f-32)*5/9);//Formula to calcute celcius
       System.out.println("Convert to degree Celcius = " + celsius + "c");

    }

}
