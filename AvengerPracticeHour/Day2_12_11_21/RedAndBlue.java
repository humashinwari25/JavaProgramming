package Day2_12_11_21;

public class RedAndBlue {
    public static void main(String[] args) {

        String word = "xxbluetimes";
        String temp = "";

        if (word.startsWith("red")) {
            temp = "\"red\"";

        } else if (word.startsWith("blue")) {

            temp = "\"blue\"";
        } else {
            temp = "\"\"";
        }

        System.out.println("temp = " + temp);
    }
}
/*
 2.
                Given a string, if the string begins with "red" or "blue" print that color string,
                otherwise print the empty string.

                input :"redxx" → "red"
                input :"xxred" → ""
                input :"blueTimes" → "blue"
 */