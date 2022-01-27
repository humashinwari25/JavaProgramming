package day19_LoopPractice;

public class UniqueCharacters {
    public static void main(String[] args) {
        String str = "aabccdeef";
        String result = ""; //bdf ---unique char: occurs only once:frequency = 1

        for (int j = 0; j < str.length(); j++) {

            char ch = str.charAt(j); //'Box'//character in a string
            int count = 0; // represents the frequency of the ch

            for (int i = 0; i < str.length(); i++) { //compares the character that outer loop picked, with each character of the string,
                char each = str.charAt(i); // each character of str
                if(ch == each){
                    count++;
                }
            }

/*
            if(count == 1){ // if the frequency of the character is 1, then the character is unique
                result += ch;
            }
 */
            if(count != 1){
                continue;
            }

            result += ch;

        }


        System.out.println(result);




    }

}
/*
2. Write a program that can find the unique characters from a string without using indexOf() and lastIndexOf() methods
    			Ex:
                        str = "aabccdeef";
                        output:
                                bdf
 */