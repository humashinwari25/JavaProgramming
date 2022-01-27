package day16_ForLoopStringPractice;
//possible interview ?????

public class Reverse {
    public static void main(String[] args) {
        String str = "Wooden Spoon";
        // index:     0123456789...

        String result = "";
        // contains the reversed version fo the str
        //no

        //result += str.charAt(str.length()-1); //n=last character of the string
        // noopS nedooW                11
        /* line 17-line 27 same as line 29 & 31..different methods..for loop method shows below
        result  += str.charAt(10); // o
        result += str.charAt(9); //o
        result += str.charAt(8); //p
        result += str.charAt(7); //S
        result += str.charAt(6); //' '
        result += str.charAt(5); // n
        result += str.charAt(4);//e
        result += str.charAt(3);//Ball
        result += str.charAt(2);//o
        result += str.charAt(1);//o
        result += str.charAt(0);//W
      */
       // for (int i = 11; i >= 0; i--) { //this is same as line 31, but with given last index #..last index # is 11
         //   result += str.charAt(i);
        for (int i = str.length()-1; i >= 0 ; i--) {//if last index # is not known use the last index formula
            //index numbers of str(starting last index to index 0)
            result += str.charAt(i);//adding each character to result by using concatenation
        }
        System.out.println(result);
        }

    }

//reverse means getting from the end to the begining , from the last index to the beginning,
// store it in the variable
/*
1. Write a program that can reverse a String
			Ex:
				input:
					Wooden Spoon
				output:
					noopS nedooW

 */