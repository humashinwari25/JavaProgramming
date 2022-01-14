package day15_ForLoop;

import java.util.Scanner;

public class ReplaceX {
    public static void main(String[] args) {
        String str = "xcodeX";
        String result = str.replace("x", "a").replace("X", "a");
        //                       "acodeX"                                    "acodea"
        System.out.println(result);

    }
}
/*1. Write a program that asks user to enter a word. If the work starts with x, replace it with a.
        Input:
        xcodex
        Output:
        acodex

 */