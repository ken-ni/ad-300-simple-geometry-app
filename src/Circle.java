public class Circle extends Shape{
    double radius;

    public Circle(double radius) {
        super("Circle");
        this.radius = radius;
    }

    // Formula for area of circle
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    // Formula for perimeter of circle
    public double calculatePerimeter() {
        return 2 * Math.PI * radius;
    }
}
