package Day4_1_8_22;

public class EqualsZerosAndOnes {


    public static void main(String[] args) {
        int[] array = {1,1,1,0,1,0};
        int countZeros =0;
        int countOnes = 0;
        int moves =0;

        for ( int i : array){
            if( i ==1){
                countOnes++;
            }else {
                countZeros++;
            }

        }
        System.out.println("countOnes = " + countOnes);
        System.out.println("countZeros = " + countZeros);

        if(countOnes < countZeros){
            moves = (countZeros-countOnes)/2;
        }
    }
}
