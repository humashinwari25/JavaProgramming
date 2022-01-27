package day17_While_DoWhile;

public class BranchingStatements2 {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'E'; i++) {
            if (i == 'C') {
                continue;
            }
            System.out.println(i);////Box B C D E
        }
        System.out.println("---------------------------------------------------------------");
        //print all even number 1~10 (skip the odd numbers)
       //in order to print even numbers, we skipped odd #s
        for (int i = 1; i < 11; i++) { // i: 1,2,3,4,5,6,7,8,9,10
            //if(i%2==0){  f or
            if(i%2 != 0) { // 1,3,5,7,9,
            continue;// skip iterations
        }
        System.out.println(i);

            // print all odd numbers between 1`10(skip even #s)
           for (int i1 =1 ; i1 < 11; i1++){

                if (i1%2==0){ // 2,4,6,8,10
                   continue;
                }
              System.out.println(i1);
            }
    }
    }
}
