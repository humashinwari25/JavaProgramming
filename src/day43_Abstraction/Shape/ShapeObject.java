package day43_Abstraction.Shape;

public class ShapeObject {
    public static void main(String[] args) {


        Rectangle rectangle = new Rectangle(3.5, 5.5);
        Square square = new Square(4);
        Circle circle = new Circle(3);

        System.out.println(rectangle);
        System.out.println(square);
        System.out.println(circle);
    }
}

