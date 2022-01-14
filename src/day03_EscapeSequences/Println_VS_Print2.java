package day03_EscapeSequences;

public class Println_VS_Print2 {
    public static void main(String[] args) {   //main method

        System.out.println("Knock Knock"); //first it prints knock knock, then it appends a line
        System.out.println("Who is this?");

        System.out.println("This is Java");

        System.out.println("-------------------------");

        System.out.print("Knock Knock");   //prints Knock Knock, does not append new line
        System.out.print("Who is this?");
        System.out.print("This is Java");

        System.out.println();
        System.out.println("------------------------------------");

        System.out.println("Hello everyone?how are you all today? Today we will learn Escape Seqences, and next week we will learn Variables");

        System.out.print("Hello Everyone, How are you all today?");
        System.out.print("Today we will learn Escape Sequences,");
        System.out.print(", and next week we will learn Variables");
    }



}
/* used for multi line comments
(// used for single line comments)
 */