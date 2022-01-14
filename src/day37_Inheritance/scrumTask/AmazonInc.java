package day37_Inheritance.scrumTask;

public class AmazonInc {  ///object class

    public static void main(String[] args) {

        ProductOwner po = new ProductOwner("Suhaib", 29, 'M', 1, 1600000, "Amazon INC");

        BusinessAnalyst ba = new BusinessAnalyst("Cihad", 30, 'M', 2, 150000, "Amazon INC");

        ScrumMaster sm = new ScrumMaster("Anel", 26, 'F', 3, 145000, "Amazaon INC");

        Tester tester1=new Tester("Chinara",32,'F',"QA",12,125000,"Amazon INC");

        Tester tester2=new Tester("Yasaman",31,'F',"QE",123,130000,"Amazon INC");

        Tester tester3=new Tester("Irena",29,'F',"SDET",23,128000,"Amazon INC");

        Tester tester4=new Tester("Cihad",26,'M',"QA",25,125000,"Amazon INC");


        Tester[] testers={tester1,tester2,tester3,tester4};

        Developer developer1 = new Developer("Huma", 27, 'F', "Java Developer", 8, 135000, "Amazon Inc");

        ScrumTeam scrumTeam = new ScrumTeam(po, ba, sm);
        scrumTeam.addDeveloper(developer1);
        scrumTeam.addTesters(testers);

        System.out.println(scrumTeam);

        System.out.println("=============================================================");
        for(Tester tester: scrumTeam.testers){
            System.out.println(tester);
        }
        System.out.println("========================================================");

        for(Developer developer: scrumTeam.developers){
            System.out.println(developer.name+" : "+developer.salary);
        }
    }
}
