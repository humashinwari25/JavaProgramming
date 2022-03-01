package day51_Map;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class MapMethods {

    public static void main(String[] args) {

        //student name & score

        Map<String, Integer> students = new HashMap<>();
        students.put("Aygun", 85);    //increasing size of map/adding
        students.put("Huma", 87);
        students.put("Maria", 86);
        students.put("Laila", 85);
        students.put("Alex", 96);
        students.put("Serkan", 92);

        students.put("Aygun", 85);
        students.put("Aygun", 86);
        students.put("Aygun", 87);


        System.out.println(students);
        System.out.println(students.size());

        //display the score of Alex
        System.out.println(students.get("Alex"));

        //replace huma score to 90
        students.replace("Huma", 90);
        System.out.println(students);

        students.remove("Alex");
        System.out.println(students);

        boolean r1 = students.containsKey("Muhtar");  //is muhtar on the sudents, does students contain muhtar//will return false
        System.out.println(r1);
        boolean r2 = students.containsKey("Serkan");
        System.out.println(r2);  //will return true

        boolean r3 = students.containsValue(97);

        System.out.println(r3);


        System.out.println(students.isEmpty());


        System.out.println("-------------------------");

        Map<String, Integer> map1 = new HashMap<>();
        map1.putAll(students);

        Map<String, Integer> map2 = new HashMap<>();
        map2.putAll(students);


        System.out.println("map1 = " + map1);
        System.out.println("map2 = " + map2);

        System.out.println(map1 ==  map2);
        System.out.println(map1.equals(map2));

        map1.clear();
        map2.clear();

        System.out.println(map1);
        System.out.println(map2);


    }
}
