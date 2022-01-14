package day07_Operators;

public class ShortHandOperators {

    public static void main(String[] args) {
        //assignment operator: = (not equal operator in math, in Java called assignement)
        int number = 100;
        System.out.println("number = " + number); //100

        number = 200;
        System.out.println("number = " + number);//200

        String word ="Java Programming";
        System.out.println("word = " + word);//Java Programming
        word = "Wooden Spoon";
        System.out.println("word = " + word);//Wooden Spoon
        word = "Cydeo";
        System.out.println("word = " + word);//Cydeo
        System.out.println("----------------------------------------------");
// Addition Assignment:
        int x = 100;
        System.out.println("x = " + x); //100
        System.out.println(x + 200); // 300
        x = x + 200;
        System.out.println("x = " + x); //300

        String str = "Wooden";
        str += " Spoon";
        System.out.println("str = " + str); // Wooden Spoon

        double num1 = 2.5;
        System.out.println("num1 = " + num1); // 2.5
        num1 +=5.5;
        System.out.println("num1 = " + num1);// 8.0


        double availableBalance = 1000.50;
        //deposit $300
        availableBalance +=300;
        System.out.println("availableBalance = " + availableBalance); // $1300.5

        System.out.println("---------------------------------------");

        //subtraction assignment; ex: withdrawing $500
        availableBalance -= 500;
        System.out.println("availableBalance = " + availableBalance);//800.5
        
        //withdrawing 200$, then deposit $400
        availableBalance -= 200;
        System.out.println("availableBalance = " + availableBalance);//600.50
        availableBalance +=400;
        System.out.println("availableBalance = " + availableBalance);//1000.50

        //multiplication assignment;
        double salary = 50000.50;
        System.out.println("salary = " + salary);
        salary *= 2;
        System.out.println("salary = " + salary);
        double dodge = 0.000000001;
        dodge *= 1000000;
        System.out.println("dodge = " + dodge);

        // division assignment;
        double num2 = 25000;
        num2 /= 2;  //num2/2 = num2/2;
        System.out.println("num2 = " + num2);

        //remainder assignment; %= ; want to assign num3 as remainder
        double num3 =100;
        num3 %= 3;
        System.out.println("num3 = " + num3);
        System.out.println("--------------------------");

        int amount =127; //cents
        int quarters = 127/25;
        int cents = 127 % 25;

        System.out.println("quarters = " + quarters); //5
        System.out.println("cents = " + cents);//2

        System.out.println("------------------------------------");
        int cents2 = 127;
        cents2 %=25;
        System.out.println("cents2 + " + cents2);


        System.out.println("------------------------------------------");
        int y = 300;
        y %=16;
        System.out.println("y = " + y);//12

        System.out.println("-----------------");
        int balance = 3500;
        // insurance fee: $153
        balance %=153;
        System.out.println("balance = " + balance);//134


    }
}
