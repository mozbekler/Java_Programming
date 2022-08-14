package day26_statics;

import java.util.Arrays;

public class TestCarObjects {

    public static void main(String[] args) {

        Car car1 = new Car("BMW");
        Car car2= new Car("Audi","Q4");
        Car car3 = new Car("Toyota","Camry",2021);
        Car car4 =new Car("Mercedes","E200",2000,4220);
        Car car5 = new Car("Honda","Accord",2020,13324,"Black");

        Car[] cars={car1,car2,car3,car4,car5};

        System.out.println(Arrays.deepToString(cars));

    }
}
