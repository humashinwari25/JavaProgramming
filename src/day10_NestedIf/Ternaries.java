package day10_NestedIf;

public class Ternaries { // shortcut of the if statements ; use only if returning same types of value.
    // ? = if
    // : = else
    // (condition)? value : value;
    public static void main(String[] args) {
        int a = 100;
        int b = 200;
        int max;

        if (a > b) {   /////if else
            max = a;
        } else {
            max = b;
        }
        System.out.println(max);

        System.out.println("----------------------------"); //ternary
        int max2 = (a > b) ? a : b;
        System.out.println(max2);
        System.out.println("---------------------------------");//ex.2

        int score =70;
        char grade;

        if(score >=90){
            grade = 'A';
        }else if(score >=80){
            grade = 'B';
        }else if(score >=70){
            grade = 'C';
        }else if(score >=60){
            grade = 'D';
        }else {
            grade = 'F';
        }
        System.out.println(grade);
        System.out.println("-------------------------------------------------");
        //now ex:2 in ternary
        char grade2 = (score >= 90)? 'A' :(score >=80)? 'B' :(score >=70)? 'C' :(score >=60)? 'D' :'F';
        System.out.println(grade2);
    }
}
