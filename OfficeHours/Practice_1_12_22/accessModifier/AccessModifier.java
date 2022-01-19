package Practice_1_12_22.accessModifier;

import Practice_1_5_22.WrapperClassIntro;

public class AccessModifier {

    public static void main(String[] args){



        Person person = new Person();
        person.ID=123;
        person.name="Palina";
        person.lastName="Ivankiu";
        //person.age=25;

    WrapperClassIntro wp=new WrapperClassIntro();
    System.out.println("wp.str = " + wp.str);
    }
}