package day08_IfStatement;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2020;
        boolean isLeapYear = year % 4 == 0;

        System.out.println(year + " is leap year: " + isLeapYear);
    }




}
/*
create a class named LeapYear, and write a program that can identify if the given year is leap Year, print true if it's leap year, otherwise print false

	        Ex:
	             if  year = 2020

	            output:
	                2020 is leap year: true

 */