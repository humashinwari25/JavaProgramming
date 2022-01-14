package Day1_12_04_2021;

public class StringPractice2 {
    // print new string made of 3 copies of last 2
    // characters of original string...length will be at least
    // 2
    public static void main(String[] args) {
//                    01234
        String str = "CYDEO";
   // str.length()-1==index of last character
        int lastIndexOfChar = str.length()-1;//(5-1=4)
        int secondlastofChar = str.length()-2;//(5-2=3)
       String result =  "" +str.charAt(secondlastofChar)+str.charAt(lastIndexOfChar);
        System.out.println( result+result+result);
        //or use repeat method
        System.out.println(result.repeat(3));

        /* can do this way also..using other
        //substring method; substring starts from second to last character to the end& then repeated 3x
        String str = "CYDEO";
        int lastSecondOfChar = str.length()-2;
        String chars = str.substring(lastSecondOfChar);
        System.out.println(chars.repeat(3));
         */
}
}