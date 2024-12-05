public class Main {
    public static void main(String[] args) {
        Color color1 = new Color(12, 15, 10);
        Color color2 = new Color(12, 15, 10, 50);
        System.out.println(color1);
        System.out.println(color2);

        Rectangle rectangle1 = new Rectangle(2, 4, color1);
        Rectangle rectangle2 = new Rectangle(25, 14, color2);
        Triangle triangle1 = new Triangle(3, 4, 5, 2.5, new Color(0, 255, 0, 255));
        Triangle triangle2 = new Triangle(30, 15, 3, 8.5, new Color(255, 255, 0, 255));
        
        System.out.println("Rectangle:");
        System.out.println(rectangle1.getColorDescription());
        
        System.out.println("Triangle:");
        System.out.println(triangle1.getColorDescription());
        
        ShapeDescriber shapeDescriber = new ShapeDescriber();
        shapeDescriber.describe(rectangle1);
        shapeDescriber.describe(rectangle2);
        shapeDescriber.describe(triangle1);
        shapeDescriber.describe(triangle2);
    }
}