package practice_12_01_2021;

public class PatientInfo {
    public static void main(String[] args) {
        String name = "John";
        int age = 8;
        char gender = 'F';
        String DOB = "10-23-23";
        boolean isMarried = true;
        String phoneNumber = "102.205.6523";
        boolean havingInsurance = true;
        String insuranNum  = "A12345";
        String employer = "Cydeo";
        double coPayWithIns = 20.0;
        double copayWithoutIns = 250.0;

        System.out.println("name = " + name);
        System.out.println("age = " + age);
        System.out.println("gender = " + gender);
        System.out.println("DOB = " + DOB);
        System.out.println("isMarried = " + isMarried);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("havingInsurance = " + havingInsurance);
        System.out.println("insuranNum = " + insuranNum);
        System.out.println("employer = " + employer);
        System.out.println("coPayWithIns = " + coPayWithIns);
        System.out.println("copayWithoutIns = " + copayWithoutIns);

        System.out.println("escape sequences");
        System.out.println("\tname: " +name+"\n\tage: " +age+"\n\tgender: "+gender);
        
        if(havingInsurance){
            System.out.println("coPayWithIns = " + coPayWithIns);
        }else{
            System.out.println("copayWithoutIns = " + copayWithoutIns);
        }

    }

}
/*
Task02: Create a class named PatientInfo. declare the following variables:

                         1. name (String)
                         2. age (int)
                         3. gender (char)
                         4. date of birth (String)
                         5. isMarried (boolean)
                         6. phone number (String)
                         7. havingInsurance (boolean)
                         8. Insurance number (String)
                         9. Employer (String)
                        10. copayWithInsurance (double)
                        11. copayWithoutInsurance (double)

 */