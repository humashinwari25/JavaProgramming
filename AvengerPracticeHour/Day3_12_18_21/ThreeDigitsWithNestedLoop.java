package Day3_12_18_21;

public class ThreeDigitsWithNestedLoop {
    public static void main(String[] args) {
          /*
                writing three-digits numbers with nested loops
                hint:
                ABC=100*Box+10*B+C //a can not be 0; has to be 1
                (Because any number multiply by 0 is zero thats why we start from 1)
                220=100*2+10*2+0
                */

        for (int a = 1; a <=9;a++) {
            for (int b = 0; b<=9; b++) {
                for (int c = 0; c <=9 ; c++) {
                    int abc =100*a+10*b+c;
                    System.out.println(abc);
                }
            }
        }
    }
}
