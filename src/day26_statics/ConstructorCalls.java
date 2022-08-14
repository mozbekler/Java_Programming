package day26_statics;

public class ConstructorCalls {
    public ConstructorCalls(){
        System.out.println("Default constructor");
    }

    public ConstructorCalls(int a ){
        this();
        System.out.println("Constructor with int argument");
        //this();//Constructor call has to be in the first step
    }

    public ConstructorCalls(double b){
        System.out.println("Constructor with double argument");
    }
    public ConstructorCalls(String c){
        this();
        //this(2.5);
        System.out.println("Constructor with dString argument");
    }
    public static void main(String[] args) {

        method2();


    }

    public static void method1(){
        System.out.println("Method 1");
    }

    public static void method2(){
        method1();
        System.out.println("method 2");
    }
}
