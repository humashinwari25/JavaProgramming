package day10_NestedIf;

public class nestedIfStatements {
    public static void main(String[] args) {
        //to check if student passed or failed test

        int score = 50;

        //precondition=if score is valid; score has to be more than 0 and less than 100; can not be 150
        if (score >= 0 && score <= 100) {//if score is valid; this is the precondition

            if (score >= 60) {
                System.out.println("Passed");
            } else {
                System.out.println("Failed");
            }
        } else {//if the score is not valid
            System.out.println("Invalid Score");
        }
    }
}
