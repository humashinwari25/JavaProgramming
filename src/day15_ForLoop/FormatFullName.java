package day15_ForLoop;

import java.util.Locale;

public class FormatFullName {
    public static void main(String[] args) {

        String firstName = "JOSH",
                lastName = "smiTH";

      //  firstName = firstName.substring(0, 1).toUpperCase() + firstName.substring(1).toLowerCase();
                  //c                                  ydeo     ==> Cydeo
       // System.out.println(firstName);
        firstName = ("" + firstName.charAt(0) ).toUpperCase() + firstName.substring(1).toLowerCase();
                            //"C"                                       "ydeo"==>Cydeo
        //anything concated to empty string will result in string data type
        //do this for char method when trying to convert to string

        System.out.println(firstName);

        lastName = (" " + lastName.charAt(0) ).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println(lastName);

       // lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1).toLowerCase();
        System.out.println("fullName = " + firstName + lastName);
    }
}
