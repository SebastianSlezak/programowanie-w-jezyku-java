public class Rectangle extends Shape{
    double a, b;

    public Rectangle(double a, double b, Color color) {
        super(color);
        this.b = b;
        this.a = a;
    }

    @Override
    double getArea() {
        return this.a * this.b;
    }

    @Override
    double getPerimeter() {
        return 2 * this.a + 2 * this.b; 
    }
}