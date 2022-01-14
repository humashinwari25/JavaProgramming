package day35_Encapsulation.encapsulation;

public class Person {

    private String name;
    private int age;

    public String getName(){    ///reading variable//no parameters in getter//an instance variable//use get keyword + variable name
        return name;

    }

    public void setName(String name){//writing variable//return type void//use set keyword+variable//need to set paramaters because modifying
        this.name = name;

    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;

    }


}
