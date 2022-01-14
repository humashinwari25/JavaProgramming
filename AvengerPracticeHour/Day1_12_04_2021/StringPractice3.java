package Day1_12_04_2021;

public class StringPractice3 {
    public static void main(String[] args) {
        //given a string: return a version without first&last char
        //so "Hello" yields "ell"

      /*  String str = "Hello";
        String svar = str.substring(1,str.length()-1);
        System.out.println(svar);
       */
        String str ="Selcuk";
       /* char firstChar = str.charAt(0);
       char lastChar = str.charAt(str.length()-1);
       str=str.replace(firstChar,' ');
       str =str.replace(lastChar, ' ');
        System.out.println(str);
        */
        char firstChar = str.charAt(0);
        char lastChar = str.charAt(str.length()-1);
        str=str.replace(firstChar,' ');
        str =str.replace(lastChar, ' ');
        System.out.println(str);

    }
}
