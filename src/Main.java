import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Shape circle = new Circle(3);
        Shape rectangle = new Rectangle(5, 9);
        Shape triangle = new Triangle(3, 4, 5);

        ArrayList<Shape> shapes = new ArrayList<Shape>();
        shapes.add(circle);
        shapes.add(rectangle);
        shapes.add(triangle);

        for (Shape shape: shapes) {
            System.out.println(shape.getName());
            System.out.println(shape.calculateArea());
            System.out.println(shape.calculatePerimeter());
            System.out.println();
        }
    }
}
