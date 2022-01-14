package day08_IfStatement;

public class LogicalOperators {
    public static void main(String[] args) {
        //to find out if someone is eligible to vote-two conditions:age&citizenship
        String name = "Steven";
        int age = 19;
        String citizen = "UK";

        boolean isEligible = age >=18 && citizen == "USA";
        //used and (&&) logic (if meets both conditions; age+citizenship) to see if person is eligible
        //double ==  means is equal to
        System.out.println(name + " is eligible to vote: " + isEligible);
        //both conditions have to be true for statment to be true with && AND Logical Operator
        // 14>18 &&  "USA" == "USA"
        //false && true  == false
        System.out.println("-----------------------------------------------------------");

        //ex:2: Applying for loan;conditions are creditScore and age; at least 700 credit score and at least 21 years old
        String name2 = "Josh";

        int creditScore = 720;
        int age2 = 23;

        boolean isEligible2 = age2 >= 21 && creditScore >= 700;
        System.out.println(name2 + " is Eligible for loan: " + isEligible2);

        System.out.println("-----------------------------------------------------------");
        //ex: gender can be either male or female; if age is more than or equal to 18 and gender is either male or female they can register
        String name3 = "Shay";
        int age3 = 21;
        char gender = 'F';

        boolean isEligible3 = age3 >=18 && (gender == 'M' || gender == 'F'); //for OR Logic || only one conditon has to be true
        // 21 >+ 18 && ('F' == 'M' || 'F' == 'F')
        // true     && (false      || true)

        System.out.println(name3 + " is eligible to register: " + isEligible3);

        System.out.println("--------------------------------------------------");
        //to become a US citizen need to meet one of these conditions:countryOfBirth has to be USA or married to USCitizen
        //given variables:
        String name4 = "James";
        String countryOfBirth = "UK";
        boolean marriedToUSCitizen = false;

        boolean isEligible4 = countryOfBirth == "USA" || marriedToUSCitizen == true;
        System.out.println(name4 + " is eligible to apply for US citizenship: " + isEligible4);

        System.out.println("------------------------------------------------------");
        //ex: to be eligible for scholarship conditions have to be met;
        // student must atl least have 3.5 gpa OR family income has to be 65000
        //variables given:
        String name5 = "Anna";
        double gpa =3.5;
        int familyIncome = 100000;
        boolean isEligible5 = gpa >= 3.5 || familyIncome <= 60000;
        System.out.println(name5 + "is Eligible for scholarship: " + isEligible5);

        System.out.println("-----------------------------------------------------------");
        boolean result2 = true;
        System.out.println("result2 = " + result2);
        boolean result3 = !result2;
        System.out.println("result3 = " + result3);
        System.out.println("-----------------------------------------------------------");

        int score = 85;
        boolean passed = score >= 60;
        boolean failed = !passed;

        System.out.println("passed = " + passed);
        System.out.println("failed = " + failed);

    }

}
