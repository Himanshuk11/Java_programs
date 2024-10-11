package Exception;
public class RectangleMain 
{
    public static void main(String[] args) {
        try {
            Rectangle rectangle1 = new Rectangle(5, 10);
            System.out.println(rectangle1);
            System.out.println("Area: " + rectangle1.area());
            System.out.println("Perimeter: " + rectangle1.perimeter());

            // Attempt to create a rectangle with invalid dimensions
            Rectangle rectangle2 = new Rectangle(-5, 10);
            System.out.println(rectangle2);
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            // Another invalid case
            Rectangle rectangle3 = new Rectangle(5, 0);
            System.out.println(rectangle3);
        } catch (RuntimeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
