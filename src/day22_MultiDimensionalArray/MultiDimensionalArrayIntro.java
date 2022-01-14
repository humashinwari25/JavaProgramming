package day22_MultiDimensionalArray;

import java.util.Arrays;

public class MultiDimensionalArrayIntro {
    public static void main(String[] args) {
        String []  group1 = { "Jon", "Joes", "James" };
        String [] group2 ={"Aaron", "Shay", "Breanna"};
        String []  group3 ={"Cassandra", "Tahir", "Aygun"};

        String [][] groups = new String [3][]; //index:0,1,2
        groups[0] = group1;
        groups[1] = group2;
        groups[2]= group3;

      //  System.out.println(Arrays.toString(groups));
        ///toString() is for one/single dimensional arrays only
//     deepToString() = to print multi-dimensional arrays
        System.out.println(Arrays.deepToString(groups));

        /*
        {1,2,3}
        {4,5,6,7}
        {8,9,10,11,12}
         */
//to.count.length;array.index:
//                          0        1           2
    int [][] arr2D = { {1,2,3}, {4,5,6,7}, {8,9,10,11,12} } ;
//    index of elements 0,1,2    0,1,2,3    0,1,2, 3, 4
        System.out.println(Arrays.deepToString(arr2D));
        System.out.println("--------------------------------------------------------------");
        //retrieve array{4,5,6,7} from 2D array:
       // System.out.println(arr2D[1]); hashcode
        System.out.println(Arrays.toString(arr2D[1]));

        // retrieve element 11 : since its element no need to use toString method to print

        System.out.println((arr2D[2][3]));



    }
}
/*
String []  group1 = { "Jon", "Joes", "James" };
String [] group2 ={"Jon", "Joes", "James"};
String []  group3 ={"Jon", "Joes", "James"};
 */