package OOPSAssignment;

abstract class Shape {
    public abstract double calculateArea();
    public void display() {
        System.out.println("This is a shape.");
    }
}
class Square extends Shape {
    private double side;

    public Square(double side) {
        this.side = side;
    }
    @Override
    public double calculateArea() {
        return side * side;
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

public class AbstractClassPrinciples {
    public static void main(String[] args) {
        Shape square = new Square(5.0);
        Shape circle = new Circle(3.0);
        square.display();
        circle.display();
        double squareArea = square.calculateArea();
        double circleArea = circle.calculateArea();

        System.out.println("Area of the square: " + squareArea);
        System.out.println("Area of the circle: " + circleArea);
    }
}