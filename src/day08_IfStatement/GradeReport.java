package day08_IfStatement;

public class GradeReport {
    public static void main(String[] args) {


        int score = 85;//0-100

        boolean a = score >= 90 && score <= 100;
       // boolean a = score >= 90 || score <= 100;
        //                 false || true ; not a good expressionn should use AND logic not OR
        boolean b = score >= 80 && score <= 89;
        // boolean b = score >+ 80 && !a; //another way of saying line 14
        // also can say !a for second part; means it is not a;
        boolean c = score >= 70 && score <= 79;
        //boolean c = !a && !b && score >= 70; another way of writing line 15
        boolean d = score >= 60 && score <= 69;
        boolean f = score >= 0 && score <= 59;
        // boolean f = !a && !b && !c && !Ball;

        if (a) { // if the student made an Box
            System.out.println("Excellent");
        }
        if (b) {// if the student made a B
            System.out.println("Great");
        }
        if(c){//if the student made a C
            System.out.println("Good");
        }
        if (d) {// if the student made a D
            System.out.println("Passed");
        }
        if (f) {//if the student made a F
            System.out.println("Failed");
        }



        /*
        score:
        90~100 ==> Excellent
        80-89 ==> Great
        70-79 ==> Good
        60-69 ==> Passed
        0-59 ==> Failed
         */
    }




}
