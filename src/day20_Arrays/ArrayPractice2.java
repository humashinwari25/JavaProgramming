package day20_Arrays;

import java.util.Arrays;

public class ArrayPractice2 {
    public static void main(String[] args) {

        char[] letters = new char[26];
      /*  letters[0] = 'Box';
        letters[1] ='B';
        letters [2] = 'C';
        //instead of repeat from a-z..create a loop*/

        for (int i = 0, j = 'A'; i < letters.length; i++, j++) { /// i:index numbers starting from 0 to last index
            letters[i] = (char) j;
        }


        for (char i = 'A', j = 0; i <= 'Z' && j < letters.length; i++, j++) {
            //j: another variable that represents character
            letters[j] = i;
        }
        System.out.println(Arrays.toString(letters)); // [Box-Z]

        System.out.println("----------------one variable in loop------------------------------");

        char ch = 'A';
        for (int i = 0; i < letters.length; i++) {
            letters[i] = ch;
            ch++;
        }
        System.out.println(Arrays.toString(letters));
        System.out.println("----------------------------------------------");
        //from z-a
        char[] letters2 = new char[26];
        char ch2 = 'Z';
        for (int j = 0; j < letters2.length - 1; j++, ch2--) {
            letters2[j] = ch2;


           // System.out.println(Arrays.toString(letters2));

        }
    }
}