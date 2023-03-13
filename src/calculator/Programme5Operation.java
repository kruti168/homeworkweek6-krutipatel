package calculator;
/**5. Write a program for a calculator with addition, subtraction, multiplication
 and division methods all with parameters and use string concatenation
 methods.(Note: Two static and Two instance methods.)**/
public class Programme5Operation {


    public static void main (String []args){
        //calling instanse method
        Programme5Operation obj = new Programme5Operation();
        obj.multipication( 5,6);//30
        obj.division(4,7);//0

        //calling static method
        additions(2,6);//8
        subtraction(5,9);//-4

    }
    //static method
    public static void additions( int a ,int b){
        int ans= a + b;
        System.out.println("Addition of two Number =" + ans);

    }
    public static void subtraction(int a,int b){

        int ans= a - b;
        System.out.println("Subtraction of two number =" + ans);
    }
    //instance method
    public  void multipication(int a,int b){

        int ans= a * b;
        System.out.println("multiplication  of two number =" + ans);
    }
    public  void division(int a,int b){

        int ans= a / b;
        System.out.println("division  of two number =" + ans);
    }
}
