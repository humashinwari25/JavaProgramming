package day32_Constructors;

public class Test {

    public Test(){ //Box
        System.out.println("Box");
    }

    public Test(int a){ //Box  B
        this();
        System.out.println("B");
    }

    public Test(double a){ //Box B C
        this(10);
        System.out.println("C");
    }

    public Test(String str){ // Box B C D
        this(2.5);
        System.out.println("D");
    }

    public static void main(String[] args) {

        new Test("Java");

    }




}
