package day32_finalKeyword.carTask_methodOverriding;

import java.util.ArrayList;
import java.util.Arrays;

public class Tesla extends Car{

    public Tesla(String model, String color, int year, double price) {
        super(model, color, year, price);
    }

    public void autoPilot(){
        System.out.println("Autopiloting"+ getMake()+getModel());
    }

    @Override
    public void start() {
        System.out.println("Say \"Start\" to start "+ getMake()+" "+getModel());
    }

    @Override
    public void setModel(String model) {
        String [] models={"Model S", "Model Y", "Model x", "Model 3" };


        if (!Arrays.asList(models).contains(model)){
            System.err.println("Invalid Tesla Model: "+model);
            System.exit(1);

        }

        super.setModel(model);
    }

    @Override
    public void setColor(String color) {
        ArrayList<String> colors = new ArrayList<>();
        colors.addAll(Arrays.asList("White", "Red", "Black", "Silver", "Blue", "Brown", "Green"));


        if (!colors.contains(color)){
            System.err.println("Invalid Tesla color"+ color);
            System.exit(1);
        }

        super.setColor(color);
    }

    @Override
    public void setYear(int year) {

        if(year < 2008){
            System.err.println("Invalid year of Tesla: "+year);
            System.exit(1);
        }

        super.setYear(year);
    }

    @Override
    public void setPrice(double price) {

        if (price<50000){
            System.err.println("Invalid price for tesla car: "+ price);
            System.exit(1);
        }

        super.setPrice(price);
    }
}
