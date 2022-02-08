package day44_Abstraction.Animal;

public interface Playable {
    //supertype...

    boolean isFriendly = true; // static&final

    /*
    public static void method1(){
    System.out.println(isFriendly);
     */

    void play(); //abstract by default

}
