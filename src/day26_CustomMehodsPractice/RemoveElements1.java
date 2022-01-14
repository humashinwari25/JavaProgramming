package day26_CustomMehodsPractice;

import java.util.Arrays;

public class RemoveElements1 {

    public static void main(String[] args) {

        int[] numbers = {100, 200, 300, 400, 500, 600};

        numbers = removeElements(numbers, 1); //{100, 300, 400, 500, 600}

        numbers = removeElements(numbers, 1); //[100, 400, 500, 600]

        System.out.println(Arrays.toString(numbers));

    }


//removes the index from the array and returns new array,  for an int variable
    //                                 {1,2,3,4}  ,   2
    public static int[] removeElements(int[] array, int index){

      if(index < 0 || index > array.length-1){
          System.err.println("invalid index: " + index);
          System.exit(0);
      }

        int[] result = new int[array.length-1];

        int j = 0; //index # of arrayResulth
        for (int i =0; i < array.length; i++) {
            if(i == array[index]){ //  if the index of array is matching with the given index
                continue; ///skip that element and it removes the element
            }
            result[j++]= array[i];
        }
        return result;
    }
}

/*
2. Create a class named RemoveElements:
            2.1 Create a method that passes two parameters: an integer array and an integer index. the method removes the element at the given index of the array and returns the new array
                    Ex:
                        int[] arr = {10,20,30,40}
                        remove(arr, 2) ==> {10, 20, 40}

            2.2 Create a method that passes two parameters: a double array and an integer index. the method removes the element at the given index of the array and returns the new array


            2.3 Create a method that passes two parameters: a char array and an integer index. the method removes the element at the given index of the array and returns the new array

            2.4 Create a method that passes two parameters: a String array and an integer index. the method removes the element at the given index of the array and returns the new array

 */