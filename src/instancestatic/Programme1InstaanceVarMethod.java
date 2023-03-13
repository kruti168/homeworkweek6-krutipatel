package instancestatic;

/**
 * 1. Write a Java programme using the following steps.
 * 1.1 Declare two instance variables.
 * 1.2 Declare one instance method.
 * 1.3 Call both instance variables into the instance method inside the print statement.
 * 1.4 Declare the Main method.
 * 1.5 Call the above instance method into the Main method and Run the programme.
 **/

public class Programme1InstaanceVarMethod {
    //instance variables
    int a = 20;
    int b = 30;

    public static void main(String[] args) {
        //calling method
        Programme1InstaanceVarMethod var = new Programme1InstaanceVarMethod();
        var.myMethod();

    }

    //instance method
    public void myMethod() {
        System.out.println("Variables =" + a);//20
        System.out.println("Variables =" + b);//30

    }
}
