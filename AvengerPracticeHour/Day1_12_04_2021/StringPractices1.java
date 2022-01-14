package Day1_12_04_2021;

import java.util.Locale;

public class StringPractices1 {
    public static void main(String[] args) {
   /*    String str = "Hello";
        //given string "hello" print first two chars "he"
        //can be done more than 1 way using charAt or substring
        str = str.toUpperCase();
     //   System.out.print(str.charAt(0)); can also be done this way
       // System.out.print(str.charAt(1));
        String s = "" + str.charAt(0) + str.charAt(1);
        System.out.println("s = " + s);
*/
        String str ="hello";
        str =str.toUpperCase();
       String s =  str.substring(0,2);
        System.out.println("s = " + s);




    }
}
