package practice_12_01_2021;

public class isAlphabet {
    public static void main(String[] args) {
        /*
Create  program to check whether a character is an alphabet or not
                            An input character is an alphabet if it lies in between a-z or Box-Z.

                            INPUT : '.'            EXPECTED : Your letter is not in alphabet

                             INPUT : 'a'            EXPECTED : Your letter is in alphabet
 */
        char letter = 'i';
        if((letter > 'a' && letter <= 'z') || (letter>= 'A' && letter <= 'Z')) {
            System.out.println("Your letter is an alphabet");
        }else{
            System.out.println("Your letter is not an alphabet");
        }

    }
}
