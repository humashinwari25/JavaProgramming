package day27_WrapperClasses;

public class WrapperClassMethod {


    public static void main(String[] args) {


        //parse Methods
        String str = "123";

       int num =  Integer.parseInt(str);    //int

        System.out.println(num + 1);//124
        System.out.println(str + 1);//1231

        String str2 = "10.5";

       double num2 = Double.parseDouble(str2);  // return type will be double

        System.out.println(num2 +1);//11.5

        int max = Integer.MAX_VALUE;//provides max value of int
        int min = Integer.MIN_VALUE;//provides min value of int


        System.out.println("max = " + max);
        System.out.println("min = " + min);

        double max1 = Double.MAX_VALUE;
        double min1 = Double.MIN_VALUE;

        System.out.println("max1 = " + max1);
        System.out.println("min1 = " + min1);

        long max2 = Long.MAX_VALUE;
        long min2 = Long.MIN_VALUE;

        System.out.println("max2 = " + max2);
        System.out.println("min2 = " + min2);

        String s1 = "maybe";

       boolean r1 =  Boolean.parseBoolean(s1);

       System.out.println(r1);

        System.out.println("------------------------------------------------------------------------------");
//valueOf Methods
        String s2 = "123";
        Integer x  = Integer.valueOf(s2);//Integer
        int y = Integer.valueOf(s2); // Integer


        System.out.println(x);
        System.out.println(y);

        String s3 = "1.5";
       double z = Double.valueOf(s3); //Double

        System.out.println(z);
    }
}


