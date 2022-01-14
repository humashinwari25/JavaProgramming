package day07_Operators;
/*
Think of casting as putting an object in a box. The smallest box is the
byte box then short box and so on. When you put an object in a bigger box, you don’t need to
do anything; that’s the optional implicit casting. When you “try” to fit an object in a smaller box,
you may have to do some trimming (you cannot enlarge the box as memory size is an outside constraint
but you may trim the object); that’s the required explicit casting. If the object is small enough although
 it’s of a bigger type, it may end up being the same even after the trimming, like when you cast the short
 100 into byte, it remains 100. However, in general trimming will change the object, like when you cast the
 short 128 into byte, it becomes -128
which does not look like the original object (128) at all. Hence the necessity to correctly use casting.
 */
public class Castings {
    public static void main(String[] args) {
        float averageScore = 20.5f;
        byte num1 = (byte)averageScore; //explicit
        //did explicit casting here; larger primitive type to smaller, float is larger than byte
        //double>float>long>int>short>byte
        short num2 = (short)averageScore;//explicit
        int num3 = (int)averageScore;//explicit
       long num4 = (long)averageScore;//explicit
       float num5 =averageScore;  //no casting;same primitive type
       //implicit casting;casting smaller primitive type to larger primitive type;
       double num6 =averageScore; //implicit-double is float is smaller that double
        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);
        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);
        System.out.println("num5 = " + num5);
        System.out.println("num6 = " + num6);



    }
}
/*
1. create a class named Castings
            1.1 declare a variable of float named averageScore and initialize it to 20.5
            1.2 declare the following variables and assign averageScore to each of them:
                             byte num1;
                             short num2;
                             int num3;
                             long num4;
                             float num5
                             double num6;

 */