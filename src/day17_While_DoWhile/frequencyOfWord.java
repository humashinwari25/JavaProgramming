package day17_While_DoWhile;

public class frequencyOfWord {
    public static void main(String[] args) {
        /*   01234567
        Str="JavaJava"
        possible substrings:
        1. Java -- substring(0,4)
        2.avaJ -- substring(1,5)
        3.vaJa --(2,6)
        4.aJav --(3,7)
        5.Java --(4,8)
         */

        String str = "JavaJavaJavaJavaJava";
        int frequency = 0;
//                            8--3                to make sure index doesnt go out of range
        for (int i = 0; i < str.length()-3; i++) { //max of i can be 7 i=1,2,3,4,5,6,7
            String eachSub = str.substring(i, i + 4);
           // System.out.println(eachSub);

            if(eachSub.equals("Java")){
                frequency++;
            }
        }
        System.out.println( frequency);
            }
        }

/*
2. write a program that can return the frequency of the word Java from the sentence
        Ex:
            sentence = "JavaJavaJava";
            output: 3
           	Str = "JavaJava";
 */


