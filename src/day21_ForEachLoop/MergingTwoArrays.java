package day21_ForEachLoop;

import java.util.Arrays;

public class MergingTwoArrays {
    public static void main(String[] args) {
        String[] group1 = {"Ali", "Layan", "Aysenur"};//3
        String[] group2 = {"Maria", "Aygun", "Duygu", "Suat", "Valeriy"};//5

        String[] students = new String[group1.length + group2.length];
        //8:size of array,

        int i =0;
        for (String each : group1) {
          students[i++] = each;
        }

        for (String each : group2) {
         students[i++] =  each;
        }
        System.out.println(Arrays.toString(students));
    }
}
