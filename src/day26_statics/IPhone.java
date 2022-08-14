package day26_statics;

public class IPhone {

    public static String brand="Apple"; // static because "Apple" is the brand of  all the Iphone objects
    public String model,color;
    public double price;
    public static String OS="iOS";// static because operatiing system is same for all the iphone objects
    public static String madeIn="China";
    public static boolean hasBattery=true;
    public static boolean isTouchScreen=true;

    public IPhone(String model, String color, double price) {
        this.model = model;
        this.color = color;
        this.price = price;
    }

    /*public static void printPhoneInfo(){ //static only accepts statics
        System.out.println("Model: "+model);
        System.out.println("Color: "+color);

     */

    public void printPhoneInfo(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Color: "+color);
        System.out.println("Price: "+ price);

    }

    public static void printOperatingSystem(){
        System.out.println("Operating system: "+OS);
    }



}
/*
Attributes:
brand,model,color,price,OS,madeIN


 */