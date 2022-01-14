package day16_ForLoopStringPractice;
///possible interview ????????????????????
public class Palindrome {
    public static void main(String[] args) {
        String word = "mom";

        String reverse = "";
        for (int i =word.length()-1; i >= 0 ; i--) {
            reverse += word.charAt(i);
        }
        boolean isPalindrome = word.equalsIgnoreCase(reverse);
        System.out.println("isPalindrome = " + isPalindrome);
    }
}
/*
"Java" ==>"avaJ" ==>false (not palindrome)
"Anna"==> "annA" ==>true (palindrome)
"Level" ==>"leveL" ==>true (palindrome)
"Racecar"
"Dad"
"mom"....
decide if word is palendrome or not
first step==reverse it
8. Write a program that can check if the given String is palindrome

			Ex:
				input:
					Level

				output:
					true


				input:
					Anna

				output:
					true

 */