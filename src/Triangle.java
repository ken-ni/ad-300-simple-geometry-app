public class Triangle extends Shape{
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        super("Triangle");
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calculateArea() {
        double s = ((a + b + c) / 2);
        return Math.sqrt(s*(s - a)*(s - b)*(s - c));
    }

    public double calculatePerimeter() {
        return a + b + c;
    }
}
