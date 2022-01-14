package day09_IfStatements;

public class EligibleToVote {
    public static void main(String[] args) {
        int age = 34;
        String citizenship = "VA";

        boolean eligible = age >=18 && citizenship == "USA";


        if(eligible){
            System.out.println("Eligible to Vote");
        }else{
            System.out.println("Not Eligible to Vote");

        }
    }
}
