package instancestatic;
/**4. Write a Java programme using the following steps.
 4.1 Declare two instance and two static variables.
 4.2 Declare one instance method.
 4.3 Declare one static method.
 4.4 Call all four instance and static variables into both instance and static methods inside the
 print statement.
 4.5 Declare the Main method.
 4.6 Call both instance and static methods into the Main method and run the programme.**/

public class Programme4TwoInstanseStatic {

    int a = 20; //intance variable
    int a1= 30;//instance variable
    static int b = 50;//static variable
    static int b1= 40;//static variable

    public static void main(String[] args) {
        //calling static method
        var();

        //calling instanse method

        Programme4TwoInstanseStatic obj =new Programme4TwoInstanseStatic();
        obj.var1();

    }

    //static method
    public static void var() {
        System.out.println("Variable =" + b);//30
        System.out.println("Variable =" +b1);


    }
    //intanse method
    public void var1(){
        System.out.println("Variable =" + a);
        System.out.println("Variable =" + a1);
    }
}