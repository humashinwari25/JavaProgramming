package day08_IfStatement;

public class NameOfTheDay {

    public static void main(String[] args) {
        int numOfDay = 5; //1-7
        boolean monday = numOfDay == 1;
        boolean tuesday= numOfDay == 2;
        boolean wednesday= numOfDay == 3;
        boolean thursday = numOfDay == 4;
        boolean friday = numOfDay == 5;
        boolean saturday = numOfDay == 6;
        boolean sunday= numOfDay == 7;

        if (monday) {
            System.out.println("monday = " + monday);
        }
        if(tuesday) {
            System.out.println("tuesday = " + tuesday);
        }
        if(wednesday) {
            System.out.println("wednesday = " + wednesday);
        }
        if(thursday) {
            System.out.println("thursday = " + thursday);
        }
        if(friday) {
            System.out.println("friday = " + friday);
        }
        if(saturday) {
            System.out.println("saturday = " + saturday);
        }
        if(sunday) {
            System.out.println("sunday = " + sunday);
        }

    }
}
/*
 Create a class called NameOfTheDay, write a program that can display the name of the day

            number = 1 ~ 7
 */