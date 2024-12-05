import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        ShapeDAO shapeDAO = new ShapeDAO(sessionFactory);

        try {
            Color redColor = new Color(255, 0, 0, 255);
            Color greenColor = new Color(0, 255, 0, 255);

            Rectangle rectangle = new Rectangle(5.0, 10.0, redColor);
            Triangle triangle = new Triangle(3.0, 4.0, 5.0, greenColor);

            shapeDAO.saveShape(rectangle);
            shapeDAO.saveShape(triangle);

            System.out.println("All shapes in the database:");
            for (Shape shape : shapeDAO.getAllShapes()) {
                System.out.println(shape);
                System.out.println("Area: " + shape.getArea());
                System.out.println("Perimeter: " + shape.getPerimeter());
                System.out.println("Color: " + shape.getColorDescription());
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            shapeDAO.close();
        }
    }
}
