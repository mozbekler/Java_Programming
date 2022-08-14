package day34_interface.animalTask;

public class Duck extends Animal implements Playable, Flyable, Swimmable{

    public Duck(String name, String breed, char gender, int age, String size, String color) {
        super(name, breed, gender, age, size, color);
    }

    @Override
    public void eat() {
        System.out.println("Duck "+getName()+" is eating worm");
    }

    @Override
    public void play() {
        System.out.println("Duck "+getName()+" is playing with its friends");
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }
}
