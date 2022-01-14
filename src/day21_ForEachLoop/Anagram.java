package day21_ForEachLoop;

import javax.lang.model.SourceVersion;
import java.util.Arrays;
import java.util.Locale;

public class Anagram {
    public static void main(String[] args) {
        //two strings are given

        String str1 = "abcd";
        String str2= "dbca";

        // write a program that can check if str1&str2 are build of same charcters
        //if same, it will be anagrams and should result true; otherwise false

        char[]  ch = str1.toCharArray();
        char[] ch2 =str2.toCharArray();

        System.out.println(Arrays.toString(ch));
        System.out.println(Arrays.toString(ch2));

        Arrays.sort(ch);
        Arrays.sort(ch2);
        System.out.println(Arrays.toString(ch));
        System.out.println(Arrays.toString(ch2));

        boolean result = Arrays.equals(ch,ch2);
        System.out.println("result = " + result);



/*
        //  System.out.println(Arrays.toString(ch1));
        //   System.out.println(Arrays.toString(ch2));

        Arrays.sort(ch1);
        Arrays.sort(ch2);

        //  System.out.println();

        // System.out.println(Arrays.toString(ch1));
        //  System.out.println(Arrays.toString(ch2));

        boolean anagram =  Arrays.equals(ch1, ch2);

        System.out.println("anagram = " + anagram);
       */
    }
}
