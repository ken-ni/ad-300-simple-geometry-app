import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(5, 9);
        Shape triangle = new Triangle(3, 4, 5);

        // Create arraylist of shapes, and add them to this so we can loop through them with their methods
        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);

        // Loop through each shape giving name, area, and perimeter
        for (Shape shape: shapes) {
            System.out.println(shape.getName());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
            System.out.println();
        }
    }
}
