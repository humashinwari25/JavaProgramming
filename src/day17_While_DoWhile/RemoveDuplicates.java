package day17_While_DoWhile;

import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str = "AABBCC";
        String result = ""; //AB

        for (int i = 0; i < str.length(); i++) {
            String ch = "" + str.charAt(i); // "Box" "Box" "B" "B" "C" "C"
            if(result.contains(ch)){ // if the result already contains the character then
                continue;// skips
            }
            result += ch;

        }
        System.out.println(result);
    }
}
