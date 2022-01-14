package Day3_12_18_21;

public class LoopIntro {

    public static void main(String[] args) {

        for (int i = 0; i <=100 ; i++) {
            System.out.print(" "+i);
        }
        System.out.println("==========================================");
//even #s from 0-100
        for (int i = 0; i <=100 ; i+=2) {
            System.out.print(" "+i);
        }
        System.out.println("================================================");
//odd #s from 0-100
        for (int i = 1; i <=100 ; i+=2) {
            System.out.print(" "+i);
        }
        System.out.println("================================================");

        //divided by  numbers with 5 from 0 to 100

        for (int i = 0; i < 100; i+=5) {
            System.out.print( i+" ");
        }

        System.out.println();
        System.out.println("===========================");

        //even numbers from 100 to 0


        for (int i = 100; i >=0; i-=2) {
            System.out.print( " "+i);
        }

    }
}
