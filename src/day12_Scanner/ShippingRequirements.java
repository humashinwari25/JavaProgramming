package day12_Scanner;

import java.util.Scanner;

public class ShippingRequirements {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        System.out.println("Enter your Full Name: ");
        String fullName = input.nextLine();

        System.out.println("Enter your building Number: ");
        String buildingNumber =input.next();

        input.nextLine();

        System.out.println("Enter your Street name: ");
        String streetName = input.nextLine();

        System.out.println("Enter your city Name: ");
        String cityName = input.nextLine();

        System.out.println("Enter your State: ");
        String state = input.next();

        System.out.println("Enter your ZipCode: ");
        String zipCode = input.next();

        input.nextLine();

        System.out.println("Enter your countryName: ");
        String countryName = input.nextLine();

        System.out.println(fullName + '\n' + buildingNumber +" " + streetName +  '\n' + cityName + ", " + state +" " + zipCode + " " + countryName);
      /*  System.out.println("buildingNumber = " + buildingNumber);
        System.out.println("streetName = " + streetName);
        System.out.println("cityName = " + cityName);
        System.out.println("state = " + state);
        System.out.println("zipCode = " + zipCode);
        System.out.println("countryName = " + countryName);*/

        input.close();
    }
}
/*
1.full name (nextLine)
2.building number (next)
3.street name (nextLine)
4. cit name(nextLine)
5.State (next)
6.zipcode (next)
7.Display shipping address
 */