package day39_Recap.cydeoTAsk;

public class Cydeo {

    public static void main(String[] args) {
    Tester tester = new Tester("James", 23, 'M',987,"SDET",120000);

    Developer developer = new Developer("Huma", 25, 'F', 786, "Developer", 165000);

    Teacher teacher = new Teacher("Muhthtar", 30, 'M', 675, "Cydeo Instructor", 150000);

    Student student = new Student("Alia", 25, 'F', 675, "Information Technology");


        System.out.println(tester);
        System.out.println(developer);
        System.out.println(teacher);
        System.out.println(student);

        System.out.println("---------------------------------------------------------------");

        developer.setAge(39);
        System.out.println(developer.getAge());

        System.out.println(developer);

        System.out.println("--------------------------------------------------------------------");

        developer.work();
        tester.work();
        teacher.work();
        //student.work();  not implemented in student class

        System.out.println("================================================================");

        developer.eat();
        developer.drink();
        developer.sleep();

        developer.fixingBugs();
        System.out.println("=====================================================================");

        tester.eat();
        tester.drink();
        tester.sleep();
        //tester.fixingBugs()   not implemented in tester class
        tester.createTicket();

        System.out.println("===========================================================================");

        teacher.eat();
        teacher.drink();
        teacher.sleep();

        //teacher.fixingBugs();
        //teacher.createTicket();

        System.out.println("===============================================================================");

        student.eat();
        student.drink();
        student.sleep();

       // student.fixingBugs();  not inherited in student class
       // student.createTicket();  not inherited in student class

        student.study();
    }



}
/*
  7. Create a class named Cydeo:
            create objects of Tester, Developer,Teacher, Student

            test all the functions of each objects

            Analyze the relationships between the classes
 */
