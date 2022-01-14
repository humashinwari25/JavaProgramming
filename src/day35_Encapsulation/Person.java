package day35_Encapsulation;

public class Person {

    public String name;
    public int age;
    public char gender;
    public String language;

    public static String planet;
    public static boolean isHuman, hasNose;
    public static int numberOfWings, numberOfHead;

    //only use this keyword when parameter has same name as the instance variable..for calling the instances
    public Person(String name, int age, char gender, String language, int numberOfWings, int numberOfHead) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.language = language;
        this.numberOfWings = numberOfWings;
        this.numberOfHead = numberOfHead;
    }

    static{
        planet = "Earth";
        isHuman = true;
        hasNose = true;
        numberOfWings = 1;
        numberOfHead = 1;

    }

    public static void printPlanetName(){
        System.out.println("Planet name is " + planet);
    }
    public void eat(String food) {
        System.out.println(name + " is eating " + food);
    }

    public void drink(String drink) {
        System.out.println(name + " is drinking " + drink);
    }

    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", language='" + language + '\'' +
                '}';
    }
}
/*
2. Create a class named Person:
        Variables:
        name, age, gender, language, planet, isHuman, hasNose, numberOfWings, numberOfHead

        Add a constructor to initialize all the fields//wwe use constructor because instance variables belong to the class or to the object to use outside of class

        Add a static block to initialize all the statics

        Methods:
        printPlanetName()
        eat(String food)
        drink(String drink)
        toString()

 */