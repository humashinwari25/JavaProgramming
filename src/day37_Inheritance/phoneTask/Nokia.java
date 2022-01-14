package day37_Inheritance.phoneTask;

public class Nokia extends Phone {

    public Nokia( String model, String size, double price, String color) {
        super("Nokia", model, size, price, color);
    }

    public void selfDefense(){
        System.out.println("you can use "+brand+" "+model+ " as a self defense tool");
    }


    public String toString() {
        return "Nokia{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
/*
 1.4 Create a sub class of Phone named Nokia:
        Variables:
        brand, model, size, price, color

        Methods:
        setInfo()
        call(long phoneNumber)
        text(long phoneNumber)
        selfDefense()
        toString()

 */
