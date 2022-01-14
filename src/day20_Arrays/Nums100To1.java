package day20_Arrays;

import java.util.Arrays;

public class Nums100To1 {
    public static void main(String[] args) {
        int[] num = new int[100];

        for (int i=num.length, j=0; i>=1; i--,j++){
            num[j]=i;
        }
        System.out.println(Arrays.toString(num));
        }
    }

/*
2. create an array that has the numbers 100 to 1
 */