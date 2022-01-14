package day12_Scanner;

import java.util.Scanner;

public class ScannerPractice3 {
    public static void main(String[] args) {
        //123Enter
        Scanner input = new Scanner(System.in);//Enter

        System.out.println("Enter you full name:");
        String fullName = input.nextLine();//Wooden SpoonEnter

        System.out.println("Enter your Programming Language:");
        String progamming = input.nextLine();//Java Programming LanguageEnter

        System.out.println("Enter your age:");
        int age = input.nextInt(); //24Enter

        input.nextLine(); // Enter//to allow to enter input for school name after using nextint

        System.out.println("Enter your School Name");
        String schoolName = input.nextLine(); //Enter

        System.out.println("fullName = " + fullName);
        System.out.println("progamming = " + progamming);
        System.out.println("age = " + age);
        System.out.println("schoolName = " + schoolName);

        input.close();


    }

}
