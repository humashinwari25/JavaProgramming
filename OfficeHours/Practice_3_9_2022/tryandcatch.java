package Practice_3_9_2022;

public class tryandcatch {

    public static void main(String[] args) {

        try {
            int [] arr = new int[1];
            arr[1] = 5;
        }  catch (ArrayIndexOutOfBoundsException e){
            System.out.print("C");
        } catch (RuntimeException e) {
            System.out.print("B");
        }catch (Exception e){
            System.out.print("A");
        }
    }

}

    //t fails cause RuntimeException is the parent and needs to be placed as the last catch block option

