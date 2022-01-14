package day37_Inheritance.phoneTask;



///this is the parent class for iphone, nokia, samsung
//only contains the common features of all the subclass

public class Phone {

    public String brand;//instance because multiple copies of brand--many brands
    public String model; ///instance because multiple models
    public String size;//instance because multiple sizes
    public double price;//instance
    public String color;//instance

    public static boolean hasBattery; //static because one battery for all types of phones..all have to be charged

    public Phone(String brand, String model, String size, double price, String color) {
        this.brand = brand;
        this.model = model;
        this.size = size;
        this.price = price;
        this.color = color;


    }

    //static{    //static block to if variable needs several step to set it..in this case it does..for boolean
   //     hasBattery = true;
   // }
    public void call (long phoneNumber){
        System.out.println(brand + " "+model+" is calling "+phoneNumber);
    }
    public void text(long phoneNumber){
        System.out.println(brand + " "+model+" is texting"+phoneNumber);
    }

    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", size='" + size + '\'' +
                ", price=$" + price +
                ", color=" + color + '\'' +
                ", hasBattery=" + hasBattery + '\''+
                '}';
    }
}
        /*
1.1 Create a class named Phone:
				Variables:
					brand, model, size, price, color
                Add Constructor to set all the fields
				Methods:
					call(long phoneNumber)
					text(long phoneNumber)
					toString()
 */