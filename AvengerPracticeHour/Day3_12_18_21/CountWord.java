package Day3_12_18_21;

public class CountWord {

    public static void main(String[] args) {
        String sentence ="Java is Java";
        String words ="Java";
        int count = 0;

        for (int i = 0; i <=sentence.length()- words.length(); i++) {
            String temp=sentence.substring(i,i+ words.length());
            if(temp.equals(words))
                count++;
            }
            System.out.println("count = " + count);

    }
}
/**
 * 1.
 *                                 Given a non-empty string like "Code" print a string like below output.
 *                                 (do with substring  first)
 *                                 Code → "CCoCodCode"
 *                                 abc → "aababc"
 *                                 ab → "aab"
 *
 */