package day42_Exceptions;

public class MorningWorkOut {

    public static void main(String[] args) {

        System.out.println("----------------Push up started------------");
        for (int i = 1; i <= 30; i++) {
            System.out.println("Push up " + i);
            try {
                Thread.sleep(150);
           } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("------------Push ups completed-----------");

        System.out.println("-------------------Pull ups started-------------");

        for (int i = 1; i <=30 ; i++) {
            System.out.println("Pull up " + i);
         //   System.out.print("\r Push up" +i)//use this to change from typing on new line to number changing on one line
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("------------Pull ups completed------------------");
    }

    public static void sleep(double v) {
    }
}

/*   custom method--may need for Selenium
    public static void sleep(double seconds) {
        try{
            Thread.sleep( (long) (seconds * 1000) );
        }catch (InterruptedException e ){
            e.printStackTrace();
        }

 */