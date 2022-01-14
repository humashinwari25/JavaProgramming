package Day2_12_11_21;

public class RotateLeft2 {
    public static void main(String[] args) {
      //  Scanner input = new Scanner(System.in);
        //System.out.println("Enter one word");
        //String word = input.next();

       String word = "Hello";
       String temp= word.substring(2)+word.substring(0,2);
        System.out.println("temp = " + temp);
        //can do either way--above or below
        String temp2 ="";   ///dummy variable
        for (int i = 2; i < word.length(); i++) {
            temp2+=word.charAt(i);
            //use two for loops to get both parts
        }
        for (int i = 0; i < 2 ; i++) {
            temp2+=word.charAt(i);
        }
        System.out.println("temp2 = " + temp2);
    }
}
/*
Given  a string, return a "rotated left 2 " version whtere the first 2 characters
the string will be at least 2 ch.

input: "hello" -->"lloHe"
       "java"----> "vaja"
       "Hi"----> "Hi"
 */