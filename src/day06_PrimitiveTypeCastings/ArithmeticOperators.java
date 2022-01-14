package day06_PrimitiveTypeCastings;

public class ArithmeticOperators {
    public static void main(String[] args) {
        System.out.println("12" + 1); // concatenation;will result in 121;double quotes=string of text
        System.out.println(10 + 20); // will result in 30; addition ; no double quotes
        System.out.println(100-50);// will result in 50;subtraction; no double quotes
        System.out.println(10 * 6);// will result in 60; multiplication; no double quotes
        System.out.println(100.0/3);//in java when dividing use decimals to get exact answer or will give integer number and not decimal.
        System.out.println(100/3);//will result in integer, not decimal, if want decimal results, need decimal in numerator

        int a = 100;
        double b = a/6; //16
        System.out.println(b);

        double c = a/6.0; //16.6666
        System.out.println(c);
    }


}
