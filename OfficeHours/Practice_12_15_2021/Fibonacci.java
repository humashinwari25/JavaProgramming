package Practice_12_15_2021;

//public class Fibonacci
 /*   public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many fibonacci number do you want to see?");
        int number = input.nextInt();

        result =;
        for (int i = 2; i <number ; i++) {
            result =num0+num1; // 0+1=1
            System.out.println(result);
            num0 =num1;num0=num1;
            num1=result;//num2=1
        }
        int[] fibo= new int[number];

        fibo[0] =0;
        fibo[1] =1;

        for (int i = 2; i <number ; i++) {
            fibo[i]=fibo[i-1]+fibo[i-2];
            //fibo[2]=fibo[1] +fibo[0] =1
            //fibo[3]=fibo[2] +fibo[1] =1 +1=2
        }
        System.out.println(Arrays.toString(fibo));
    }
}
/* Create a program that will give you the Fibonacci numbers up to the x value.

                           Fibonacci is a sequence of number starting from 0, 1 where the following numbers are the sum
                           of the previous 2 numbers

                           Note: Fibonacci numbers are read as index values, so the 0th Fibonacci is 0, 1st value is 1,
                           2nd value is 1, etc

                          Ex:
                             Input:
                               8
                             Output:
                               0, 1, 1, 2, 3, 5, 8, 13, 21

            */