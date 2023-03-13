package instancestatic;
/**3. Write a Java programme using the following steps.
 3.1 Declare one instance and one static variable.
 3.2 Declare one instance method.
 3.3 Declare one static method.
 3.4 Call both instance and static variables into both instance and static methods inside the
 print statement.
 3.5 Declare the Main method.
 3.6 Call both instance and static methods into the Main method and run the programme.**/

public class Programme3nstanceStatic {
    int  a = 20; //intance variable
    static int  b = 30;//static variable

    public static void main (String[]args){
        //calling static method
        var();
        //calling instanse method
        Programme3nstanceStatic obj1 = new Programme3nstanceStatic();
        obj1.var1();

    }
    //static method
    public static void var(){
        System.out.println("Variable =" + b);//30

    }
    //instanse method
    public void var1(){
        System.out.println("Variable = " + a);//20
    }

}
