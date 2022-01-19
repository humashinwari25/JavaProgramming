package Practice_1_12_22.remainderRule;

import java.util.Scanner;

public class RemainderRule {
    //modulus == remainder
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num1= input.nextInt();
        int num2= input.nextInt();

        System.out.println(remainder(num1,num2));

    }

    public static boolean remainder(int a,int b){
        if(a % b == 0){
            return true;
        }else{
            return false;
        }
    }

}

