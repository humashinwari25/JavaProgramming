package Day3_12_18_21;

public class TwoDigitsWithNestedLoop {
    public static void main(String[] args) {

        ///*
        //                writing two-digits numbers with nested loops
        //                hint:
        //                AB=10*Box+B
        //                */

        for (int a = 1; a <= 9; a++) { //a:1
            for (int b = 0; b <=9; b++) {//b:0
                int ab= 10*a+b;//a:1 b: 0  ab:10
                System.out.println(ab + " ");
            }



        }
    }
}
