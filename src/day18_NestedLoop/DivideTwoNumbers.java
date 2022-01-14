package day18_NestedLoop;

public class DivideTwoNumbers {
    public static void main(String[] args) {

        int a = 30;//a = a-b; 30-7 = 23; 23 is still > 7 so 23-7=16; 16>7 so 16-7=9;9>7so
        // 9-7=2; 2!>7 so condition is false
        int b = 7;

        int count = 0; //4(got subtracted 4 times)

        while(a>=b){
            a-=b;
            count++;
        }
        System.out.println(count +" with a remainder of " + a);
    }
}
/*
1.  Write a program that can divide two positive numbers without using / (division) and * (multiplication) and % operators
                        20 / 6 ==> 3 with the reaminder of 2
                        a = 20
                        b = 6;
                        a -= b;  // a = 14
                        a -= b;  // a = 8
                        a -= b;  // a = 2
                        x = 100;
                        y = 8;
                        while(a >= b){
                                a -= b;
                                count++;
                        }
 */