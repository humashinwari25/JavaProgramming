package day09_IfStatements;

public class NameOfDay {
    public static void main(String[] args) {
        int n = 5; // 1~7
        //since 7 conditions(7daysinaweek) using multiple branch if statements
        boolean monday = n == 1;
        boolean tuesday = n == 2;
        boolean wednesday = n == 3;
        boolean thursday = n == 4;
        boolean friday = n == 5;
        boolean saturday = n == 6;
        boolean sunday = n == 7;

        if (monday) {   ///if no boolean you can also write (n == 1) for shortcut
            System.out.println("monday");
        } else if (tuesday) { ///if no boolean you can also write (n == 2)
            System.out.println("tuesday");
        } else if (wednesday) {///if no boolean you can also write (n == 3)
            System.out.println(wednesday);
        } else if (thursday) {///if no boolean you can also write (n == 4)
            System.out.println("thursday");
        } else if (friday) {///if no boolean you can also write (n == 5)
            System.out.println("friday");
        } else if (saturday) {///if no boolean you can also write (n == 6)
            System.out.println("saturday");
        } else if (sunday) {///if no boolean you can also write (n == 7)
            System.out.println("sunday");
        }
        System.out.println("--------------------------------------------------");

        String day;

        if (n == 1) {
            day = "Monday";
        } else if (n == 2) {
            day = "Tuesday";
        } else if (n == 3) {
            day = "Wednesday";
        } else if (n == 4) {
            day = "Thursday";
        } else if (n == 5) {
            day = "Friday";
        } else if (n == 6) {
            day = "Saturday";
        } else if (n == 7) ;
        day = "Sunday";
        }
    }

