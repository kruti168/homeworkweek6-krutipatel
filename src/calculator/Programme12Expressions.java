package calculator;

public class Programme12Expressions {

    public static void main (String[]args){

        System.out.println("Specified Expression =(25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5)" );
        Programme12Expressions obj1 = new Programme12Expressions();//calling instance method
        obj1.exppression();

    }
    public void exppression(){
        double result = ((25.5 * 3.5 - 3.5 * 3.5) / (40.5 - 4.5));//exppression
        System.out.println("Result = "+ result);

    }
}
