package day23_CustomMehtods_Void;

public class CustomMethodsWithParameters {

    public static void main(String[] args) {

    //    OddOrEven();// method demands additonal information to complete its task
      OddOrEven(10);

      ageOfPerson(1995);

        //printNumbers
    }


    //create a function that can check if a number is odd or even #
    //                             parameter given-information that method must have
    public static void OddOrEven(int number){

        if(number % 2 ==0){
            System.out.println( number + " is even number");
        }else{
            System.out.println(number + " is odd number");
        }
    }



    //create a function that can display the age of person
    //==>we need birthyear..so requires parameter

    public static void ageOfPerson(int birthYear){

        int age = 2021 - birthYear;
        System.out.println("your age is: " + age);
    }

    //create a function that can print all the numbers between X and Y

    public static void printNumbers (int x, int y ){


    }
}
