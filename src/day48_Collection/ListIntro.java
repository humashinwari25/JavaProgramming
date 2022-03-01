package day48_Collection;

import java.util.*;

public class ListIntro {

    public static void main(String[] args) {

      //  List<Integer> list1 = new ArrayList<>();
        //polymorphism list being referenced to ArrayList
                            //list can reference to LinkedList/Vector/Stack

        List<Integer> list1 = new ArrayList<>();
        list1.addAll(Arrays.asList(10,20,30,40,50,60));
        //when retreiving element..use arrayList..it is faster

        List<Integer> list2 = new LinkedList<>();
        list2.addAll(Arrays.asList(10,20,30,40,50,60));

        //when add/removing element use LinkedList, it is faster
        //LinkedList uses pointer to connect to each element
        System.out.println(list2.get(0));


        List<Integer> list3 = new Vector<>();
        list3.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println(list3.get(0));


        List<Integer> list4 = new Stack<>();
        list4.addAll(Arrays.asList(10, 20, 30, 40, 50, 60));

        System.out.println(list4.get(0));

        System.out.println("-------------------------------------------------------");

        System.out.println(list4);

        ((Stack) list4).pop();

        System.out.println(list4);

        ((Stack) list4).pop();

        System.out.println(list4);


    }


    public synchronized void method1(){

    }



}