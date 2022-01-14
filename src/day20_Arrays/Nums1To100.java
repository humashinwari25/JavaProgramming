package day20_Arrays;

import java.util.Arrays;

public class Nums1To100 {
    public static void main(String[] args) {


       int[] num = new int[100];

        for (int i = 0; i <= num.length-1; i++) {
            num[i]=i+1;
        }

        System.out.println(Arrays.toString(num));
        }

    }

/*1. create an array that has the numbers 1 to 100

 */