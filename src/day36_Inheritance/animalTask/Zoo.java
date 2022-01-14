package day36_Inheritance.animalTask;

public class Zoo {
    public static void main(String[] args) {

        Dog dog = new Dog();
        dog.setInfo("Max", "Husky", 'M', 2, "Small","Brown");

        dog.eat();
        dog.drink();
        dog.sleep();
        dog.move();
        //dog.hunt();
        //dog.scratch();

        System.out.println(dog);

        Cat cat = new Cat();
        cat.setInfo("Tarcin", "British", 'M', 3, "Small", "brown");

        cat.eat();
        cat.drink();
        cat.sleep();
        cat.move();
        //cat.bark();
        //cat.hunt();
        cat.scratch();

        System.out.println(cat);

        Tiger tiger = new Tiger();
        tiger.setInfo("Sher Khan", "Bengal", 'M', 6, "small", "white");

        tiger.eat();
        tiger.sleep();
        tiger.drink();
        tiger.move();

        tiger.roar();
        tiger.hunt();

        //tiger.bark();

        System.out.println(tiger);


    }

}

