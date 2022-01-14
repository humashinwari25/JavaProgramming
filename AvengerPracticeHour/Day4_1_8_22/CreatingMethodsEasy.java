package Day4_1_8_22;

public class CreatingMethodsEasy {

    public static void main(String[] args) {

        int result1 = add(4,2);
        int result2 = subtract(4,2);
       int result3 = divide(4,4);
        int result4 = multiply(3,4);


    }

    private static int add(int i, int i1) {
       return i +i1;
    }

    private static int divide(int i, int i1) {
        return i/i1;
    }

    private static int subtract(int i, int i1) {
        return i-i1;
    }

    private static int multiply(int i, int i1) {
        return i * i1;
    }
}
