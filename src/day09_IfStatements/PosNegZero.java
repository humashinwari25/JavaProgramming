package day09_IfStatements;

public class PosNegZero {
    public static void main(String[] args) {
         int n = 100;
         //Single if statement
        //used only for 1 condition
         if(n>0){
             System.out.println("Positive");
         }
         if(n<0) {
             System.out.println("Negative");
         }
         if(n==0){
             System.out.println("Zero");
         }
        System.out.println("--------------------------------------------------------------");
        //Multi-Branch if Statement
        //used for three conditions or more; more efficient
        // than writing 3 single if statements like above
        //if&Else statement used for two conditons;no more no less
         boolean positive = n >0;
         boolean negative = n<0;

         if(positive){
             System.out.println("Positive");
         }else if(negative){
             System.out.println("Negative");
         }else{
             System.out.println("Zero");
         }
        System.out.println("---------------------------------------------------");
    }




}
