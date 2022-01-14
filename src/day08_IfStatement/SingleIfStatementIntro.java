package day08_IfStatements;

public class SingleIfStatementIntro {

    public static void main(String[] args) {
        //find out if  given number is odd or even;

        int number = 101;

        /*
        System.out.println("Odd Number");
        System.out.println("Even Number");
         */

        boolean evenNumber = number%2 == 0; //% module = remainder
        // if the number is evenly divisible by 2 than it is an even number or if the remainder is 0
        boolean oddNumber = ! evenNumber; // not even number
        //if the number is not evenly divisible by 2 and has a remainder other than 0, then it is an odd number

        if(evenNumber){ // false
            System.out.println(number+" is even number");
        }

        if(oddNumber){// true
            System.out.println(number+" is odd number");
        }


        System.out.println("--------------------------------");

        int n = 200;

        // positive
        if(n > 0){ //if the n is greater than zero, then it's positive
            System.out.println(n+" is positive");
        }

        // negative
        if(n < 0){ // if n is less than zero, then it's negative
            System.out.println(n+" is negative");
        }

        // zero
        if(n == 0) {
            System.out.println(n + " is zero");
        }
        System.out.println("-----------------------------");
        int score = 76;
        //if pass exam score  more than 60 or 60 print the following statement
        if(score >= 60){
            System.out.println("Congragulations on passing your exam!");
        }
    }

}