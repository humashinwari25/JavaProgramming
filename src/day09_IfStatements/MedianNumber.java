package day09_IfStatements;

public class MedianNumber {
   public static void main(String[] args) {
       int a = 10;
       int b = 15;
       int c = 20;

        boolean aIsMedian = (a>b && a<c) || (a>c && a <b);
        boolean bIsMedian = (b>a && b<c) || (b<a && b>c);
        boolean cIsMedian = (c>b && c<a) || (c>a && c<b);//can also write like this:
       //!aIsMedian && !bIsMedian

       if(aIsMedian){
            System.out.println(a + " is the median");
        }
       //in order for a to be the median#;c is max &b is min;a is med ;
       //if b is max & c is min, then a is med;
       if(bIsMedian) {
           System.out.println(b + " is the median");
        }
       //if be is med, c is max and a is min
       if(cIsMedian) {
            System.out.println(c + " is the median");
        }
    }
}
/*
Create a class called MedianNumber. write a program that can find the median number between three DIFFERENT given integers

            Ex:
                a = 10, b= 15, c = 20;

            Output:
                15 is the median number

 */