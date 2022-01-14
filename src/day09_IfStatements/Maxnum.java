package day09_IfStatements;

public class Maxnum {
    public static void main(String[] args) {
        int n1 =50;
        int n2 =30;

        boolean maxnum1 = n1 > n2;
        boolean maxnum2 = n2 > n1;
        if(maxnum1){
            System.out.println(n1 + " is the maximum number");
        }else{
            System.out.println(n2 +" is the maximum number" );
        }
    }
}
