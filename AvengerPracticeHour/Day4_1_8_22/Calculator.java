package Day4_1_8_22;

public class Calculator {

   //implementation of add method
    public static int add(int num1, int num2){
        return num1+num2;
    }
   //implementation of subtract method
    public static int subtract(int num1, int num2){
        return num1-num2;
    }
    //implementation of multiplication method
    public static int multiply(int num1, int num2){
        return num1*num2;
    }
    //implementation of division method
    public static int divide(int num1, int num2){
        return num1/num2;
    }


    public static void main(String[] args){
        System.out.println(add(4,2));
        System.out.println(subtract(8,7));
        System.out.println(multiply(8,7));
        System.out.println(divide(4,2));


    }
}
