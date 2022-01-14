package day09_IfStatements;

public class LeapYear {

    public static void main(String[] args) {
        int year = 2000;
        boolean leapYear = year % 4 == 0;
        //two single if statements
        if(leapYear){
            System.out.println("Year " + year + " is a leap Year");
        }
        if(!leapYear){
            System.out.println("Year " + year + " is not a leap Year");
        }
        System.out.println("-----------------------------------------------------------------------");
        //this is the if&else statements;better to use this than 2 single if statements;
        if(leapYear){
            System.out.println("Year " + year + " is a leap Year");
        }else{
            System.out.println("Year " + year + " is not a leap Year");
        }
    }
}
