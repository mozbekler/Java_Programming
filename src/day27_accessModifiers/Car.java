package day27_accessModifiers;

public class Car { //outer class

    public String make,model,color;
    public int year;
    public double price;

    public static int wheels=4;

    public class CarEngine{ //Inner class

        public void method(){
            System.out.println(make);
            System.out.println(wheels);
        }

    }
    public static class StaticInnerClass{//static only accepts static

        public void method(){
            System.out.println(wheels); // We can not use make int the method because it is not static
        }

    }
}
