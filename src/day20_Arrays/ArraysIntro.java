package day20_Arrays;

import javax.lang.model.SourceVersion;
import java.util.Arrays;

public class ArraysIntro {
    public static void main(String[] args) {
        //create a variable that's capable enough to contain 5 names
        //for arrays use square bracket [] after datatype or after variableName
        //array - holds multiple value of same data type
        //size is fixed
        //BOTH primitive&NoN-primitive
        //every element has index #
        //Single Dimensional == 1 bracket



        //Arrays Utility: class name:Arrays  pacakage: java.util
        //PRINTING single dimensional arrays --use tostring method otherwise gives hashcode line25
        //
        //default values: memorize
        //non-primitives: null; primitives(byte,short,int long = 0; float, double = 0.0; boolean = false)

        // OR String myGroup[] = new String[5];
        String[] myGroup = new String[5];
        //System.out.println(myGroup);   //hashcode
        System.out.println(Arrays.toString(myGroup));
///assign names to  myGroup: Gunay, Neira, Suat, Hulya, Mikael
        myGroup[0] = "Gunay";
        myGroup[1] = "Neira";
        myGroup[2] = "Suat";
        myGroup[3] = "Hulya";
        myGroup [4] = "Mikael";

        System.out.println(Arrays.toString(myGroup));

        System.out.println("------------------------------------------------------------------");
//use this when if quantity of elements are known and know what those elements are;;7 days in a week and name of days
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};
        //index =          0         1          2            3           4           5         6
// days[7]= "javaday";
        System.out.println(Arrays.toString(days));

        int number = 1;
        if(number <1 || number >7) {
            System.err.println("Invalid Number");
            System.exit(0);
        }
        System.out.println(days[number-1]);


        }
    }

