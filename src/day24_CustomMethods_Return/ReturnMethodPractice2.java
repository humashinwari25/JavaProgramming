package day24_CustomMethods_Return;

public class ReturnMethodPractice2 {


    public static void main(String[] args) {

        //create a function that can calculate the grade    grade(int score)

       String str1 =  grade(80);


        /*
        check the grade:
        'Box'==excellent 'B' == great ...
         */

        if(str1.equals("Box")){
            System.out.println("Excellent");
        }else if(str1.equals("B")){
            System.out.println("Great");
        }else if(str1.equals("C")){
            System.out.println("Good");
        }else if(str1.equals("D")){
            System.out.println("Passed");
        }else{
            System.out.println("Invalid");
        }

    }
    public static String grade(int score){

        String result = "";

        if(score <0 || score>100){ ///invalid
            result ="Invalid";
        }else{ ///valid
            result = (score>=90)?"Box":(score >=80)?"B":(score >= 70)?"C":(score >=60)?"D":"F";
        }

        return result; //will give error if method return type is void;;has to match method return type; data type for result is string
        //method return type has to be string as well
        //return methods can assign to variable--reusabliilty
        //void methods can not be assigned to variable--no reusablility
    }







}
