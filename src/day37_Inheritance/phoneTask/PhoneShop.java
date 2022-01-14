package day37_Inheritance.phoneTask;

public class PhoneShop {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("Iphone 12", "12", 1000, "Rose Gold");
        Samsung samsung = new Samsung("galaxy s19", "6.7", 900, "White");
        Nokia nokia = new Nokia("Brick", "4 inches", 50, "Black");


        System.out.println(iphone);
        System.out.println(samsung);
        System.out.println(nokia);

        iphone.call(911);
        iphone.text(123456789);
        iphone.faceTime(78945613);
        iphone.faceTime("yahoo@gmail.com");

        System.out.println("--------------------------------------------------");

        samsung.call(911);
        samsung.text(123456789);
        samsung.freeze();

        System.out.println("--------------------------------------------------");

        nokia.call(432109876);
        nokia.text(321098765);
        nokia.selfDefense();


    }

}
//1.5 Create a class named Phone Objects=PhoneShop  and test of the sub class' objects