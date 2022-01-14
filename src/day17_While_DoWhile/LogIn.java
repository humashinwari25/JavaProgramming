package day17_While_DoWhile;

import java.util.Scanner;

public class LogIn {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your username:");
        String u = scan.next();

        System.out.println("Enter your password:");
        String p = scan.next();

        if(u.equals("Cydeo")&&p.equals("Cydeo123")){ //if credentials are valide..then user logged in
            System.out.println("Logged in");
        }else { //otherwise user has 3 attempts
            int attempts = 3;
            while (!(u.equals("Cydeo") && p.equals("Cydeo123")) && attempts > 0) { ///while the credentials are invalid and user still has attempts
                System.out.println("Incorrect username or password, please re-enter");
                System.out.println("Enter your username:");
                u = scan.next();

                System.out.println("Enter your password:");
                p = scan.next();
                attempts--;//decreasing # of attempts
            }
            if ((u.equals("Cydeo") && p.equals("Cydeo123"))) {
                System.out.println("Logged in");
            } else {
                System.out.println("Your account is locked.");
            }
        }
scan.close();

    }
}
