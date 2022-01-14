package day17_While_DoWhile;

public class FrequencyOfWord2 {
    public static void main(String[] args) {
        String str = "Cat Cat Dog Dog CAT CAT cAT";

        int frequency = 0;
        for (int i = 0; i <=str.length()-3; i++) {  //subtract the total # of char of word :has 3 characters-to not go out of range;
            String eachSub = str.substring(i, i +3); //add total #of characters in word

            if(eachSub.equalsIgnoreCase("Cat")){
                frequency ++;

            }
        }
        System.out.println(frequency);
    }
}
/*
int wordLength = word.length();
for (int i= 0; i< sentence.length()-wordLength; i++){
            String eachSub = sentence.substring(i, i+wordLength);
            if (eachSub.equals(word)){
                count++;
            }
 */
/*
write a program that can return the frequency of the
word cat from the sentence
 */