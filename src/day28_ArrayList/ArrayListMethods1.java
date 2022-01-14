package day28_ArrayList;

import java.util.ArrayList;

public class ArrayListMethods1 {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();
//      ArrayList<dataType>name = new ArrayList<dataType>();

        //add method: adds element into ArrayList after the last index of the ArrayList
        numbers.add(10); //i:0Autoboxing...done automatically
        numbers.add(20);//i:1
        numbers.add(30);//i:2
        numbers.add(40);//i:3
        numbers.add(50);//i:4
        numbers.add(60);//i:5


        //add(index,element):
        numbers.add(2,25);//add element 25 to index 2 and original index 2 will shift up to index 3
        numbers.add(5,45);
        numbers.add(78);//if want to add element to the last index..
        System.out.println(numbers);

        System.out.println( numbers.size() );

        int lastIndex = numbers.size() - 1;

        System.out.println("lastIndex = " + lastIndex);

        int num = numbers.get(3);

        System.out.println("num = " + num);

        System.out.println("------------------------------------");

        for (int i = 0; i < numbers.size(); i++) {
            System.out.println( numbers.get(i) );
        }

        System.out.println("----------------------------------");

        ArrayList<String> list = new ArrayList<>();
        list.add("Java");
        list.add("Python");
        list.add("Java");
        list.add("C#");
        list.add("Ruby");

        list.set(2, "JavaScript"); // replace
        list.set(3, "C++");
        System.out.println(list);






    }

}