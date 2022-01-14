package day19_LoopPractice;

public class ExitMethod {
    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) { //i: 0-4

            if(i ==3){
               // break;// terminates the loop
                //continue; //terminates the current iteration of the loop.skip #3 but rest will be printed
           System.exit(0); //exits without problems--terminates the entire program
            }
            System.out.println( i);
        }
        System.out.println("Wooden Spoon");
    }
}
