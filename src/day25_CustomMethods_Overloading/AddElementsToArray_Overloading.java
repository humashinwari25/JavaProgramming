package day25_CustomMethods_Overloading;

import java.util.Arrays;

public class AddElementsToArray_Overloading {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6}; //7

        numbers = addElement(numbers, 7);

        char[] chars = {'A', 'B', 'C', 'D'}; //'E'

        chars = addElement(chars, 'E');

        String[] names = {"Ahmet", "Oleksandr", "Sinem", "Cihad"};//"Layan"

        names = addElement(names, "Layan");

        System.out.println("numbers = " + Arrays.toString(numbers));
        System.out.println("chars = " + Arrays.toString(chars));
        System.out.println("names = " + Arrays.toString(names));

    }

    //  1. create a return method called addInteger that can add an Inteeger  after the  last index of an integer array
    public static int[] addElement(int[] array, int element) {
        int[] result = new int[array.length + 1]; //create new array because array size is fixed, can not increase or decrease
        //all elements of the array plus additional array

        int i = 0;
        for (int each : array) { //used for each loop to get all elements of old array and assign to new array
            result[i++] = each;//increase index by 1
        }
        result[i] = element;

        return result;


    }

    //2. create a return method called addDouble that can add a double after the last index of a double array
    public static double[] addElement(double[] array, double element) {
        double[] result = new double[array.length + 1];

        int i = 0;
        for (double each : array) {
            result[i++] = each;
        }
        result[i] = element;
        //result[result.length-1] = element; //element need to be assigned to the last index

        return result;

    }

    //  3. create a return method called addString that can add a String after the last index of a String array
    public static String[] addElement(String[] array, String element) {
        String[] result = new String[array.length + 1];

        int i = 0;
        for (String each : array) {
            result[i++] = each;
        }
        result[i] = element;
        //result[result.length-1] = element; //element need to be assigned to the last index

        return result;

    }


    //     4. create a return method called addChar that can add a char after last index of a char array
    public static char[] addElement(char[] array, char element) {
        char[] result = new char[array.length + 1];

        int i = 0;
        for (char each : array) {
            result[i++] = each;
        }
        result[i] = element;
        //result[result.length-1] = element; //element need to be assigned to the last index

        return result;

    }
}

