package OOPS;
abstract class Shape {
    final double PI = 3.142;
    public abstract double area();
}
class Circle extends Shape {
    private double radius;
    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    public double area() {
        return PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double breadth;
    public Rectangle(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    public double area() {
        return length * breadth;
    }
}

class Cube extends Rectangle {
    private double height;

    public Cube(double length, double breadth, double height) {
        super(length, breadth);
        this.height = height;
    }

    @Override
    public double area() {
        return 6 * (super.area() / height); 
    }

    public double volume() {
        return super.area() * height; 
    }
}

public class ShapeTest {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Circle Area: " + circle.area());

        Rectangle rectangle = new Rectangle(4.0, 6.0);
        System.out.println("Rectangle Area: " + rectangle.area());

        Cube cube = new Cube(4.0, 4.0, 4.0);
        System.out.println("Cube Surface Area: " + cube.area());
        System.out.println("Cube Volume: " + cube.volume());
    }
}
