package day28_ArrayList;

public class StrongPassword2 {
    public static void main(String[] args) {

        String password = "WoodenSpoon123";

        int countUpperCase = 0;
        int countLowerCase = 0;
        int countDigits = 0;
        int countSpecialChar = 0;

        for (int i = 0; i <password.length() ; i++) {
            char each = password.charAt(i);

            if(Character.isUpperCase(each)){
                countUpperCase++;
            }else if(Character.isLowerCase(each)){
                countLowerCase++;
            }else if(Character.isDigit(each)){
                countDigits++;
            }else{
                countSpecialChar++;
            }
        }
      //  System.out.println("countLowerCase = " + countLowerCase);
        // System.out.println("countUpperCase = " + countUpperCase);
       //  System.out.println("countSpecialChar = " + countSpecialChar);
      //  System.out.println("countDigits = " + countDigits);

        boolean hasUpperCase = countUpperCase > 0;
        boolean hasLowerCase = countLowerCase >0;
        boolean hasDigit = countDigits >0;
        boolean hasSpecialChar = countSpecialChar >0;

        boolean isStrongPassword = password.length()>8 && !password.contains(" ")&& hasUpperCase && hasLowerCase && hasDigit && hasSpecialChar;

        System.out.println("isStrongPassword = " + isStrongPassword);
    }

}
/*
1.Write a program that can verify if a password is a strong password. Characteristics of strong passwords are:
        1.1 Password must be at least have 8 characters long, and should not contain space
        1.2 PassWord should at least contain one upper case letter
        1.3 PassWord should at least contain one lower case letter
        1.4 Password should at least contain one special characters
        1.5 Password should at least contain a digit
 */