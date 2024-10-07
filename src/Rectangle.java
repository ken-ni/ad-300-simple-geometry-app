public class Rectangle extends Shape{
    int length;
    int width;

    public Rectangle(int length, int width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    public double calculateArea() {
        return length * width;
    }

    public double calculatePerimeter() {
        return 2 * (length + width);
    }
}
