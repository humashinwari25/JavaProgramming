package day09_IfStatements;

public class MultiBranchIfStatement {
    public static void main(String[] args) {

        int number = 100;


        if (number > 0) {
            System.out.println("Positive");
        } else if (number < 0) {
            System.out.println("Negative");
        } else {
            System.out.println("Zero");
        }
        System.out.println("-------------------------------");

        int score = 75;
        char grade; //Box,B,C,D,F

        if(score >=90){
            grade = 'A';
        }else if(score<90 && score >= 80){
            grade = 'B';
        }else if(score >= 80){
            grade = 'C';
        }else if(score >= 60){
            grade = 'D';
        }else {
            grade = 'F';
        }
        System.out.println(grade);

    }
}
