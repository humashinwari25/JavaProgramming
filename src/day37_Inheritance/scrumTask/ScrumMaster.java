package day37_Inheritance.scrumTask;

public class ScrumMaster extends Employee{

    public ScrumMaster(String name, int age, char gender, int id, double salary, String companyName) {
        super(name, age, gender, "Scrum Master", id, salary, companyName);
    }
    public void fixBugs(){
        System.out.println(jobTitle+" "+name+" is crying");
    }


}
