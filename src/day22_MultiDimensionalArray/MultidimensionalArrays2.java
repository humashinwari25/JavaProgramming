package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultidimensionalArrays2 {
    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        int [] arr2 = {4,5,6};
        int [] arr3 = {7,8,9};

        int [][] arr2D = {{1,2,3},{4,5,6},{7,8,9}};
        
        //3 dimensional array contains 2D arrays
         int[][][] arr3D = { {{1,2,3},{4,5,6},{7,8,9}} , {{10,20,30},{40,50,60},{70,80,90}} }; 
          //element index      0 1  2  3  4 5   6 7 8
        //                         0       1        2          0          1            2
        // 2D array index                0                                        1

        System.out.println(Arrays.deepToString(arr3D));
                System.out.println("arr3D = " + arr3D);
    }
}
