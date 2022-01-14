package Day3_12_18_21;

public class WritingTillWord2 {

    public static void main(String[] args) {
        /*
    Given a non-empty string like "Code" print a string like below output.

            (do with substring  first)
    Code → "CCoCodCode"
    abc → "aababc"
    ab → "aab"
            (do with replaceFirst())
    Code → "C-Co-Cod-Code"
    abc → "a-ab-abc"
    ab → "a-ab"

    do with charAt()
  */
        /**
         * (do with charAt())
         *                            Code → "C-Co-Cod-Code"
         *                            abc → "a-ab-abc"
         *                            ab → "a-ab"
         */


            String word="Code";
            String c=word.charAt(0)+"";//C
            String co=""+word.charAt(0)+word.charAt(1);//Co
            String cod=""+word.charAt(0)+word.charAt(1)+word.charAt(2);//Cod
            String code=""+word.charAt(0)+word.charAt(1)+word.charAt(2) +word.charAt(3);//Code

            String temp="";
            for (int i = 0; i <word.length() ; i++) {

                for (int j = 0; j <=i ; j++) {
                    temp+=""+word.charAt(j);
                }
                temp+="-";
            }
            temp=temp.substring(0,temp.length()-1);
            System.out.println("temp = " + temp);


        }
    }