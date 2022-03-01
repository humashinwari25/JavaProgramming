package day49_Collections;

import java.util.*;

public class SetInterfacePractice {


    public static void main(String[] args) {

        List<Integer>  list = new ArrayList<>();  //will keep same order; has index #s, has null values
        list.addAll(Arrays.asList(10, 200, 300, 40,9));
        list.addAll(Arrays.asList(10, 200, 300, 40,9));
        list.addAll(Arrays.asList(10, 200, 300, 40,9));
        list.addAll(Arrays.asList(10, 200, 300, 40,9));
        list.addAll(Arrays.asList(10, 200, 300, 40,9));

        System.out.println("list = " + list); //will print duplicated, will result in 25 items
        System.out.println(list.get(4)); //has index #s so can retrieve elements



        Set<Integer> hashSet = new HashSet<>();  //fastest performance, does not give any order, use if want to remove duplicates,has null values
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(10,200,300,40,90));
        hashSet.addAll(Arrays.asList(null, null, null));


        System.out.println(hashSet);  //gives in very random order; will result in 5 items
        //still gives just one hashset..doesn't allow duplicates
       // System.out.println(hashSet.get(4)); can not use because does not have index #s,




        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(10, 200, 300, 40, 90));
        linkedHashSet.addAll(Arrays.asList(null, null, null));

        System.out.println("linkedHashSet = " + linkedHashSet);


        Set<Integer> treeSet = new TreeSet<>();

        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        treeSet.addAll(Arrays.asList(10,200,300,40,90));
        //  treeSet.addAll(Arrays.asList(null,null,null));


        System.out.println("treeSet = " + treeSet);

        //   String str = null;
        // System.out.println(str.charAt(0));



    }
}
