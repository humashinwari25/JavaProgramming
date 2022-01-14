package day11_Switch_Scanner;

public class Calculator {
    public static void main(String[] args) {
        double n1 = 200.5,
            n2 = 10.5;
         char operator = '*';
         boolean valid = operator == '+' || operator == '-' || operator == '*' || operator == '/';

         if(valid){//operator : +,-,*,//if it is valid one of those operators

             switch(operator){
                 case '+':
                     System.out.println(n1+n2);
                     break;
                 case '-':
                     System.out.println(n1-n2);
                             break;
                 case '*':
                     System.out.println(n1*n2);
                 default:
                     System.out.println(n1/n2);
             }

         }else{////else statement for invalid operators used
             System.err.println("Invalid Operator: "+operator);
         }

    }
}
//practice calculator problem from prac