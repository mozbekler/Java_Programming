package day27_accessModifiers;

public class StaticBlock {
    public StaticBlock(){
        System.out.println("Constructor");
    }


    public static void main(String[] args) {

        System.out.println("main method");

        new StaticBlock();
        new StaticBlock();
        new StaticBlock();
    }

    static{

        System.out.println("Static block");


    }
}
