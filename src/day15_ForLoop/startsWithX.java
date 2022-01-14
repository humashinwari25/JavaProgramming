package day15_ForLoop;

import java.util.Scanner;

public class startsWithX {
    public static void main(String[] args) {
        String word = new Scanner(System.in).next();  //"xcodex"
        //since using one word as input no need for variable for scanner;
// could also be written as scanner and then print and the next statement
        if(word.charAt(0) == 'x'){
            word = word.replaceFirst("x", "a"); //"acodex"
        }
        System.out.println(word);

    }
}
/*
1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
                    Input:
                        xcodex
                    Output:
                        acodex
 */