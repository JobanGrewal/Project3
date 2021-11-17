package package2;

public class AccessModifierDemo {
    private int a;
    private int b;
    public static void sum(int a , int b){
        int c = a+b;
        System.out.println("Addition of two numbers is: " + c);

    }
    public static void difference(int a , int b){
        int c = a-b;
        System.out.println("Subtraction of two numbers is: " + c);


    }

    public void multiply(int a , int b){
        int c = a*b;
        System.out.println("Multiplication of two numbers is: " + c);

    }

    public void division(int a , int b){
        int c = a/b;
        System.out.println("Division of two numbers is: " + c);

    }
}
