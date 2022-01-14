package day35_Encapsulation.encapsulation;

public class EmployeeObject {


    public static void main(String[] args) {

        Employee employee1 = new Employee("Tatiana", 'F', 32, 110000);

        System.out.println(employee1);

        employee1.setAge(33);
        System.out.println(employee1);
    }
}
