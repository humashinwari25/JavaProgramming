package day22_MultiDimensionalArray;

import java.util.Arrays;

public class IteratingMultiDimensionalArray {
    public static void main(String[] args) {
//retreive single Dimensional arrays:
        //to.count.length;array.index:
//                          0        1           2
        int [][] arr2D = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12} } ;
//    index of elements 0,1,2    0,1,2,3    0,1,2, 3, 4

        for (int i = 0; i <arr2D.length ; i++) { //i: index #s of Single-Dimensional arrays

            System.out.println(Arrays.toString(arr2D[i]));


            //retreive element;
            for (int j = 0; j < arr2D[i].length ; j++) { //j: index #s of elements

                System.out.print(" "+arr2D[i][j]);
            }
            System.out.println(" ");
        }





    }
}
