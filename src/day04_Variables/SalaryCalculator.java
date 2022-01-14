package day04_Variables;
// hourtlyRate, weeklyHours

public class SalaryCalculator {
    public static void main(String[] args) {
        int HourlyRate = 50;
        int WeeklyHours = 40;
        int NumberOfWeeks = 52;

        int salary = HourlyRate * WeeklyHours * NumberOfWeeks;
        //*52 weeks in a year;

        //System.out.println(salary);
        System.out.println("HourlyRate = " + HourlyRate);
        System.out.println("WeeklyHours =" + WeeklyHours);
        System.out.println("salary = $" + salary);
        System.out.println("NumberOfWeeks = " + NumberOfWeeks);


    }


}
