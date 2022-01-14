package day04_Variables;

public class PrimativesIntro {

    public static void main(String[] args) {

        //age:38 years old
        byte age = 38;

        // weight = 160 pounds
        //byte weight can not be used because out of byte' range
        //byte' range is -128 to 127
        // have to use short type: it is within range (-32,768-32,767)
        //short weight
         short weight = 160;

         // salary: 100000 $
        //short salary = 100000; //compile error(red) because out of short' range
        int salary = 100000;
        //int - preferred primative data type fo all inter numbers
        //in order to make large number more readable instead of commas use underscore; ex 100,000 = 100_000

        //int asset =3_333_333_333l; //is out of int' range- that's why giving compiler error
        long asset = 3_333_333_333l;
        //if using long data type must include l at the end; if out of int' range

        char ch1 = '#';
        System.out.println("ch1= " + ch1);

        char ch2 = 35;
        System.out.println("ch2 = " + ch2);

        char ch3 = 45000;
        System.out.println("ch3 = " + ch3);
 char gender = 'F';
 char grade = 'A';
 char yesNo = 'Y';
 boolean isEmployed = true;
 boolean isMarried = true;
 boolean result = 100 > 300;
        System.out.println("isEmployed = " + isEmployed);
        System.out.println("isMarried = " + isMarried);
        System.out.println("result = " + result);

        String name = "Wooden Spoon";
        System.out.println("name = " + name);
        String city = "Mclean";
        System.out.println("city = " + city);
        String state = "Virginia";
        System.out.println("state = " + state);
        String country = "USA";
        System.out.println("country = " + country);

         /*int: for integers
         double: for decimals
         char: for single characters such as grades,gender,yes/no ''
         boolean: true or false
         string: sequence of characters, ""
         string of text

          */


    }
}
