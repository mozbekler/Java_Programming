package day25_constructors;

public class ConstructorsIntro {

    public ConstructorsIntro() {
        System.out.println("Object is created by using no argument constructor");
    }

    public ConstructorsIntro(int a){
        System.out.println("Object is created by using int argument constructor");
    }

    public ConstructorsIntro(char a) {
        System.out.println("Object is created by using char argument constructor");
    }

    public ConstructorsIntro(double a) {
        System.out.println("Object is created by using double argument constructor");
    }

    public static void add(){

    }

    public static void main(String[] args) {

        ConstructorsIntro obj1 = new ConstructorsIntro(10);
        ConstructorsIntro obj2 = new ConstructorsIntro();
        ConstructorsIntro obj3 = new ConstructorsIntro('A');



    }



}
