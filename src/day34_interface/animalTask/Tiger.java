package day34_interface.animalTask;

public class Tiger extends Animal{




    public Tiger(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Tiger "+ getName()+" is eating deer.");
    }

    public void hunt(){
        System.out.println(getName()+" is hunting");
    }


}
