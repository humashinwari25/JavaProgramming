package Day2_12_11_21;

public class EncryptPassword {
    /**
     *  5.
     *                 Given a string password. Encrypt with "x" a given password
     *                 and print.
     *                 (do with for loop)
     *                 password: cydeo
     *                 encrypt with char :x
     *                 output:cxyxdxexox
     */

    public static void main(String[] args) {

        String password = "cydeo";
        char encryptWithChar = 'x';

        String encryptedPassword = "";

        for (int i = 0; i < password.length(); i++) {
            encryptedPassword+= ""+ password.charAt(i)+encryptWithChar;
           // encryptedPassword =encryptedPassword+password.charAt(i)+encryptWithChar;//same statement as above


        }
        System.out.println("encryptedPassword = " + encryptedPassword);

    }
}
