package day29_ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListPractice2 {
    public static void main(String[] args) {

        /*
        array list of employees--remove ALL employees except ahmed & david
         */

        ArrayList<String> employees = new ArrayList<>();
        employees.addAll(Arrays.asList("Ali", "David", "Ahmed", "Jimmy", "Daniel", "Ahmed", "Aaron", "David", "Shay"));

        employees.retainAll(Arrays.asList("Ahmed", "David"));

        System.out.println(employees);

        String[] names = {"Mary", "Monica", "Mehray", "Musti", "Sumeyra", "Hasan", "Beril"};

        ArrayList<String> list = new ArrayList<>(Arrays.asList(names));

        list.removeIf(p -> p.charAt(0) == 'M');

        names = list.toArray(new String[0]);

        System.out.println(Arrays.toString(names));
    }
}
