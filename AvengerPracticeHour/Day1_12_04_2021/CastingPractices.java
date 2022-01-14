package Day1_12_04_2021;

public class CastingPractices {
    public static void main(String[] args) {
        //DataTypes: double>float>long>int>short>byte

        //byte to short
        byte b = 10; // implicit casting done by compiler: byte is < short //no loss of data
        short s =b;

        //double to int
        double d = 5.3;  //explicit casting double to int: double is > int..will not fit; have to do manually
       // int i = d; --> this is give error..need to do manually
        int i = (int)d;  //so d will now be 5 since it is int not double anymore..loss of data

        //long to int
        long l =999999l;
       // int a = l; --> will give error..again explicit casting; do manually & reassign
        int a = (int)l; //l=99999

        System.out.println("l = " + l);
        System.out.println("a = " + a);

///ex: question from quiz..
     //   float f =12.12;  ///float needs f at the end otherwise compiler error
       float f = 12.12f; //can also write as: float f = (float)12.12;
        short g = (byte)f;
        byte c =(byte)g;
        //What's the value of c? //answer: compiler error
//quiz question:
    /*    int ivar = 10;
        float fvar = 12.5; //incorrect; float fvar = 12.5f otherwise considered integer & integer <float
        double dvar = 12; //this is correct;
        ivar = fvar; //into to float : no error -implicit
        fvar =ivar; //float into int-No : int ivar = (int)fvar
        dvar =fvar;//double to float-No: double dvar =(double)fvar
        fvar=dvar;//float to double implicit no error
        ivar=dvar;//int-double-no error-implicit
        */
    }
}
