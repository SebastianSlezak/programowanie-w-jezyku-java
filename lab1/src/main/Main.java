abstract class Shape {
    public void print(){
        System.out.println("Class name: " + this.getClass().getSimpleName());
    }

    public abstract double getArea();
    public abstract double getPerimeter();
}

class Rectangle extends Shape{
    double width;
    double height;

    public Rectangle(double width, double height){
        this.width = width;
        this.height = height;
    }
    @Override
    public double getArea() {
        return width * height;
    }

    @Override
    public double getPerimeter() {
        return 2 * width + 2 * height;
    }

}

class Triangle extends Shape{
    double a;
    double b;
    double c;

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea(){
        double p = getPerimeter() / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    @Override
    public double getPerimeter(){
        return a + b + c;
    }
}

class ShapeDescriber {
    public static void describe(Shape shape){
        System.out.println("Area: " + shape.getArea());
        System.out.println("Perimeter: " + shape.getPerimeter());
    }
}

class Main{
    public static void main(String[] args) {
        Triangle triangle = new Triangle(2,2,2);
        Rectangle rectangle = new Rectangle(2,3);
        ShapeDescriber.describe(triangle);
        ShapeDescriber.describe(rectangle);
    }
}