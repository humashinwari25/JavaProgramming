package day34_GarbageCollection_AccessModifiers;

import day30_CustomClass.Dog;
import day31_Constructors.Student;
import day32_Constructors.Car;

import java.util.ArrayList;
import java.util.Arrays;

public class GarbageCollection {


    public static void main(String[] args) {
        //int n = null;//this will give error

        //null only to non primitives...null does not equal 0; 0 is an existing value..null not existing value, nothing has been created-is empty
        //String str = null;

        String str = "Wooden Spoon"; //after line 13, "Wooden Spoon" will be eligible for garbage collection..collect&destroy that object
        str = null;

        System.out.println( str );

        Car car1 = new Car("Toyota");
        car1 = null;

        System.out.println(car1);

        System.out.println("--------------------------------------------------------------------");

        Dog dog1 = new Dog();
        dog1.name = "Lucy";

       dog1 =  new Dog();
        dog1.name = "Max";

        System.out.println(dog1);

        System.out.println("---------------------------------------------------------------------");

        String language = "Python";
             language =   "Java";

        System.out.println(language);
        System.out.println("--------------------------------------------------------------------------");

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(100);

        ArrayList<Integer> list2 = list1 ;

        list2.addAll(Arrays.asList(200, 300, 400));

        System.out.println(list1);
        System.out.println(list2);

        System.out.println(list1 == list2 );

        System.out.println("-----------------------------------");

    Student student1 = new Student("Tahir", 30, 'M', 'B', 14);
        student1.grade = 'A';

        Student student2 = student1;
        student2.name = "Ahmet";

        System.out.println(student1);
        System.out.println(student2);


        System.out.println("--------------------------------------------------------");

        ArrayList<String> l1 = new ArrayList<>();
        l1.add("Java");

        ArrayList<String> l2 = new ArrayList<>();

        System.out.println("l1 = " + l1);
        System.out.println("l2 = " + l2);

    }
}
