package day22_MultiDimensionalArray;

public class IteratingMultiDimensionalArray2 {
    public static void main(String[] args) {

        int[][] arr2D = { {1, 2,3}, {4,5,6,7,8}, {9,10,11,12,13} };
                              //0     1              2

        for (int i = arr2D.length - 1; i >= 0; i--) {
            //i: index # of 1D arrays starting from last index to 0
            for (int j  = 0; j < arr2D[i].length; j++) {
                //j; index # of elements starting from 0 to last index
                System.out.print(arr2D[i][j]+ " ");

            }
            System.out.println();// appends a new line
        }
        System.out.println("--------------------------------------------------------");

        for (int i1 = 0; i1 < arr2D.length; i1++) {
            //i1: indexes of each 1D array started from 0
            for (int j1 = arr2D[i1].length - 1; j1 >= 0; j1--) {
                //j1:index # of each element starting from last index
                System.out.print(arr2D[i1][j1]+" ");
            }
            System.out.println();
        }
        System.out.println("-------------------------------------------------------------");

        }


    }

/*
print this out;
9 10 11 12 13
4 5 6 7 8
1 2 3

task 2:
3 2 1
8 7 6 5 4
13 12 11 10 9

task 3:

13 12 11 10 9
8 7  6 5 4
3  2 1
 */