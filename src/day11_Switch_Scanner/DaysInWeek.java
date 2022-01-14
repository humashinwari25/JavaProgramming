package day11_Switch_Scanner;

public class DaysInWeek {
    public static void main(String[] args) {
        int number =9;
        /* written in if statement;but switch statement is faster;
        -and only compares the equal ones(==)
        -only accepts data
        -can not be done with boolean,double,float and long
        -it is not as powerful as if statment;
        if statement ex: if(number ==1){
                            System.out.println("Monday");
                            }
         */
        //this is the switch statement for the above example
        switch (number){ //1,2,3,4,5,6,7 == (comparing these numbers)

            case 1:
                System.out.println("Monday");
                break; //exits the switch after executing the case block
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid");
                break;//if default is at the end, it is not mandatory to give break statement
               ///since alreay reached the end.
            //default gets executed only if none of the case blocks are matching; can be put anywhere
            //not just at the end;
        }
    }
}
