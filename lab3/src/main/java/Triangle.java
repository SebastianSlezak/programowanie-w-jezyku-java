public class Triangle extends Shape{
    double a, b, c, h;

    public Triangle(double a, double b, double c, double h, Color color) {
        super(color);
        this.a = a;
        this.b = b;
        this.c = c;
        this.h = h;
    }

    @Override
    double getArea() {
        return (a * h) / 2;
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }
}