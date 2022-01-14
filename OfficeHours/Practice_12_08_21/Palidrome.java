package Practice_12_08_21;

import java.util.Scanner;

public class Palidrome {
    public static void main(String[] args) {
        /*
                       Write a program that can check if the given String is palindrome

                                  Ex:
                                      input:
                                          Level   =--- from left to right                     level
                                                       right to left -----spells same word     level
                                      output:
                                          true


                                      input:
                                          Anna

                                      output:
                                          true

                       */

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your word");
        String word = input.nextLine();
        String result = "";

        for (int i = word.length()-1; i >=0 ; i--) {
            result += word.charAt(i);
        }
        boolean isPalindrome = word.equalsIgnoreCase(result);
        System.out.println("isPalindrome = " + isPalindrome);
    }
}
