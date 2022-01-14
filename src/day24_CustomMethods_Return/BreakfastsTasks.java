package day24_CustomMethods_Return;

public class BreakfastsTasks {


    public static void main(String[] args) {


        initials("Cydeo", "School");

        System.out.println("------------------------------------------------------------------------------------");

        domain("humashinwari@yahoo.com");

        System.out.println("-----------------------------------------------------------------------------------");

        nameOfMonth(6);

        System.out.println("-----------------------------------------------------------------------------------------");

        String[] emails = {"josh@gmail.com", "Jim@yahoo.com", "Elminur@cydeo.com", "Gulsen@gmail.com" };

        for (String email : emails) {   ///for each emails given, print email in domain of email by using task 2
            domain(email);
        }


        System.out.println("------------------------------------------------------------------------------------------");

        nameOfDay(6);

        System.out.println(" --------------------------------------------------------------------------------------------");

        daysInMonths(3);

    }


    //	1. Create a method that can display the initials of the person- initials(String firstName, String lastName)
    public static void initials(String firstName, String lastName){
        String initial = firstName.charAt(0)+""+ lastName.charAt(0);
        initial = initial.toUpperCase();
        System.out.println("initial = " + initial);
    }

   // 2. Create a method that can display the domain of the email: domain(String email)
    public static void domain(String email){

        String domain = email.substring( email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println("domain = " + domain);
    }

    //3. Create a method that can display the name of the month based on the given number to the method :nameOfMonth(int number)
    public static void nameOfMonth(int number) {

        String name = "";

        if (number >= 1 && number <= 12) {

            name = (number == 1) ? "January" : (number == 2) ? "February" : (number == 3) ? "March" : (number == 4) ? "April" : (number == 5) ? "May" : (number == 6) ? "June" : (number == 7) ? "July" :
                    (number == 8) ? "August" : (number == 9) ? "September" : (number == 10) ? "October" : (number == 11) ? "November" : "December";

        } else {

            name = "invalid";
        }

        System.out.println("name = " + name);


    }

  //  4. Create a method that can print the name of the day based on the given number to the method: nameOfDay(int number)
    public static void nameOfDay(int number){

        String name = "";

        if(number >= 1 && number <= 7) {

            name = (number == 1) ? "Monday" : (number == 2) ? "Tuesday" : (number == 3) ? "Wednesday" : (number == 4) ? "Thursday" : (number == 5) ? "Friday" : (number == 6) ? "Saturday" :"Sunday";
        }else{
            name = "invalid";
        }
        System.out.println("name = " + name);
    }

    //5. Create a method that can print how many days a month has = daysInMonths(int number)
    public static void daysInMonths(int number){

        int days = 0;
        String result ="";

        if(number >= 1 && number <= 12){ // number: 1~12

            switch (number){
                case 2:
                    result = "28 days";//if the year is leap year
                    break;

                case 4: case 6: case 9: case 11:
                    result = "30 days";
                    break;

                default: //1, 3, 5,7,8, 10, 12
                    result = "31 days";
            }

        }else{
            result = "Invalid Number";
        }


        System.out.println(result);

    }
}
/*
Warmup tasks:
	1. Create a method that can display the initials of the person

	2. Create a method that can display the domain of the email

	3. Create a method that can display the name of the month based on the given number to the method

	4. Create a method that can print the name of the day based on the given number to the method

	5. Create a method that can print how many days a month has
 */