/*package Practice_3_9_2022;

public class Circle {

    public class Shape {

        public String name;

    }

    class Circle extends Shape {
        public double radius;
    }

    class MainClass {
        public static void main(String [] args) {
            Circle c1 = new Circle();
            Shape s1 = c1;
            s1.name = "Circle";
            Circle c2 = (Circle) s1;
            c2.radius = 3.1;
            Shape s2 = c2;
            //  System.out.println(s2.radius);
        }
    }
}

 */
/*
------encapsulation----------allows data hiding by adding ----private--access modifiers to variables
and getters(reading) and setters(modify/setting) to read and modify them;

                                                                             set method for changing
making all variables in a class private and only providing getters and no setters will make object of class
immutable ===>true --immutable means not changing if not changing dont use setters use getters

to change from other class use set method

a child class able to have many parent classes as needed====>false
can not extend to more than one class no more than one parent


which will be inherited to subclass
protected variables can be inherited, reachable within same package
final class/private class can not be inherited
default variable when
public methods can be inherited==reachable from all


static member that is inherited can be accessed through parent and by class name=>ture


-----method overriding is used to change the implementation in the child class method overloading
is used to provide method that share a name but accept different arguments

which are true of method over ridding?
-methods have same name
-there must be an inheritance relationship--
-return type should be same

exceptions:
check: compile time
when you write code,you will see your error
subclass of Exceptions


runtime:unchecked are runtime
subclass of RunTimeExceptions
after you run it you will see it


---checked---------------  exception must be handled before running a program because they are subclass
of ----exceptions----



-






 */