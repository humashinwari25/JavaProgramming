package day08_IfStatement;

public class SalaryCalculator {
    public static void main(String[] args) {
        int hourlyRate = 50;
        int weeklyHours = 45;

        double stateTaxRate = 6.5,// if using same data type you can add comma instead of semicolon and continue to next tab
                federalTaxRate = 26.2;
        //---------------------------------------------------------

        int salaryBeforeTax = hourlyRate * weeklyHours * 52;//52 weeks in a year
        double federalTax = salaryBeforeTax * federalTaxRate/100; //in order to convert to percentage to decimal value; mathematical formual
        double stateTax = salaryBeforeTax * stateTaxRate /100;//
        double totalTax = stateTax + federalTax;
        double salaryAfterTax = salaryBeforeTax - totalTax;

        System.out.println("Gross pay is:$ " + salaryBeforeTax);
        System.out.println("State tax is:  $ " + stateTax);
        System.out.println("Federal tax is $ " + federalTax);
        System.out.println("Total tax is $ " + totalTax);
        System.out.println("Net Income = $ " + salaryAfterTax);

    }



}
/*
Create a class called SalaryCalculator.java
			3.1 declare the following variables:
					hourlyRate, weeklyHours, stateTax, federalTax

			3.2 use the given info in above variables to calculate the followings:
					1. salaryBeforeTax
					2. stateTax
					3. federalTax
					4. totalTax
					5. salaryAfterTax

					Hint: salaryBeforeTax = hourlyRate * weeklyHour * 52

			3.3 use print statement to print each of the above
				Ex:
					   hourlyRate = $50
					   weeklyHours = 45
					   stateTax = 6 (given as percentage, you need to convert to decimal)
					   federalTax = 26 (given as percentage, you need to convert to decimal)

				   output:
				    	Gross pay is: $117000
				    	Federal tax is: $30420
			    		State tax is: $7020
			    		Total tax is: $37440
			    		Net income is: 79560
 */