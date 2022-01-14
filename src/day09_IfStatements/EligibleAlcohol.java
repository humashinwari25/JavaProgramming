package day09_IfStatements;

public class EligibleAlcohol {
    public static void main(String[] args) {
        int age = 12;
        boolean eligibleToBuy = age >= 18;

        if(eligibleToBuy){
            System.out.println("Eligible");
        }else{
            System.out.println("Not Eligible");
        }

        }




}
//3. Write a progrm that can check if the person is eligible to buy alcohol