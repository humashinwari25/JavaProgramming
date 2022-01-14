package day12_Scanner;

public class GradeLevel {
    public static void main(String[] args) {
        byte gradeLevel = 62;
        String result ="";
    //  boolean valid = gradeLevel >=1 && gradeLevel <=18;
//If & switch
     if(gradeLevel >= 1 && gradeLevel <=18){  // can either be done this way or using line7&line10
          // if(valid){
            switch (gradeLevel){

             case 1: case 2: case 3: case 4: case 5:
                     result = "Elementary School";
                     break;
                case 6:case 7:case 8:
                    result = "Middle School";
                    break;
            case 9:case 10:case 11:case 12:
                    result = "High School";
                    break;
            case 13:case 14:case 15:case 16:
                result = "College";
                break;
            default:
                result = "Grad School";
                break;
            }
        }else{
            result = "Invalid grade level given";
        }
        System.out.println(result);
        System.out.println("---------------------------------------------------------------");
     //  switch statement alone:
        switch(gradeLevel){
            case 1: case 2:  case 3:  case 4: case 5:
                System.out.println("Elementary School");
                break;
            case 6: case 7: case 8:
                System.out.println("Middle School");
                break;
            case 9: case 10: case 11: case 12:
                System.out.println("High School");
                break;
            case 13: case 14: case 15: case 16:
                System.out.println("College");
                break;
            case 17: case 18:
                System.out.println("Grad School");
            default:
                System.out.println("Invalid Grade Level Given");
                break;
        }












    }
}
/*
1. Create a class called day12_Scanner.GradeLevel, Given a number(byte) grade level determine and print which school type someone is in.
            grade level and types are:
                    1-5: Elementary school
                    6-8: Middle school
                    9-12: High school
                    13-16: College
                    17-18: Grad School

                    For Any Other grade: Invalid grade level given

            Note:
                Solution 1: Use switch statement
                Solution 2: use if & switch both
 */