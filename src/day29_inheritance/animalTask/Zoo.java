package day29_inheritance.animalTask;

public class Zoo {

    public static void main(String[] args) {

        Dog dog = new Dog();
        Cat cat = new Cat();
        Tiger tiger = new Tiger();

        dog.setInfo("Max","Huskey",'M',4,"Big","Black");
        cat.setInfo("Lilly","Van",'F',2,"Medium","White");
        tiger.setInfo("Tiger","Thai",'M',5,"Big","Yellow-Black");

        


        System.out.println(dog);
        System.out.println(cat);
        System.out.println(tiger);

        System.out.println("------------------------------");
        
        dog.eat();
        dog.sleep();
        dog.drink();

        cat.eat();
        cat.sleep();
        cat.drink();

        tiger.eat();
        tiger.sleep();
        tiger.drink();

        dog.bark();
        cat.meow();
        cat.scratch();
        tiger.hunt();

        dog.setAge(7);

        System.out.println(dog);





    }
}
