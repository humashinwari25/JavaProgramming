package day24_CustomMethods_Return;

public class ReturnMethodPractice4 {
    public static void main(String[] args) {

        String str = "ccccccccccdddddddddddddddddaaaaaaaaaaaaaaaaaaabbbbbbbbbbbbbf";

        str = removeDuplicates(str);

        System.out.println(str);


    }




    //create a method that can remove all the duplicates from string & returns the new value

    public static String removeDuplicates(String str){


      // logic for problem:1st  get all characters from the string under the condition in the for loop and then add to another
        //then  if character is not contained it will skip otherwise it will add it

        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char each = str.charAt(i);


            if(!result.contains(""+each)){   //if the result does not contain each character
                result += each;
            }
        }
        return result;
    }
}
