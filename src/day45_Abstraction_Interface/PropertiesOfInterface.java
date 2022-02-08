package day45_Abstraction_Interface;


public interface PropertiesOfInterface {

    int a=100; //static & final by default
    static int b=200;  //final default
//
   // public PropertiesOfInterface(int a){
 //   this.a = a;

   // static{
 //   b = 100;
 //   }

 //   public void method1(){
  //      System.out.println("Instance Method");
 //   }

     static void method2(){
        System.out.println("Static method");
    }

    public abstract void method3();
    //before java 8, only abstract method could be created


    public default void method(){
        System.out.println("Default method");
    }



}
