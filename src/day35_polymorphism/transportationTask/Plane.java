package day35_polymorphism.transportationTask;

import day34_interface.animalTask.Flyable;

public abstract class Plane extends Transportation implements Flyable {

    public Plane(String make, String model, String color, int year, double price) {
        super(make, model, color, year, price);
    }

    public void land(){
        System.out.println("Plane "+ getMake()+" "+ getModel()+" is landing.");
    }


}
