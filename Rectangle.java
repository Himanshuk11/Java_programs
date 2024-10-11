package Exception;
public class Rectangle {
    private double length;
    private double breadth;

    // Parameterized constructor
    public Rectangle(double length, double breadth) {
        if (length <= 0) {
            throw new RuntimeException("Length must be greater than zero");
        }
        if (breadth <= 0) {
            throw new RuntimeException("Breadth must be greater than zero");
        }
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate area
    public double area() {
        return length * breadth;
    }

    // Method to calculate perimeter
    public double perimeter() {
        return 2 * (length + breadth);
    }

    @Override
    public String toString() {
        return "Rectangle [Length: " + length + ", Breadth: " + breadth + "]";
    }
}
