package day24_CustomMethods_Return;

public class ReturnMethodIntro {

    public static void main(String[] args) {


        String str = "Java";

       String result = reverse(str);

        System.out.println(result);
        if(str.equalsIgnoreCase(result)){
            System.out.println(str + " is palindrome");
        }else{
            System.out.println(str + "is not palindrome");
        }
    }

    public static String reverse(String str){ //"Java"

        String reverse = ""; //variable to contain expected result

        for (int i = str.length()-1; i >=0 ; i--) { // i is less than the length of the string, and finishes at greater than or equal to 0, and decreases each time
            reverse += str.charAt(i);    //// result added to each character of the given argument
        }
        return reverse;

    }




}
