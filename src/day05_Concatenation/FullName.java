package day05_Concatenation;

public class FullName {
    public static void main(String[] args) {
        String firstName = "Hapo";
        String lastName ="Shini";
        String fullName = firstName + " " + lastName;
        int age = 45;
        String JobTitle = "Analyst";
        String companyName = "Cydeo";
        double salary = 100_000.58;

        System.out.println("Full name of the person is  " + fullName + ".");
        System.out.println(fullName + " is " + age + " years old." );
        System.out.println(fullName + " is " + JobTitle + " works at " +
                companyName + "," + " salary is $" + salary + ".");
    }
}
//fullname of the person is---------
//---- is ---- years old.
//fullname is JobTitle, works at CompanyName.