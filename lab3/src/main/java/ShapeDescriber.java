import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ShapeDescriber {
    Logger logger = LoggerFactory.getLogger(ShapeDescriber.class);
    
    void describe(Shape shape) {
        logger.info("Opis: " +
        "Kolor: " + shape.getColorDescription()
        + " Typ: " + shape.getClass().getName());
        logger.info("Pole: " + shape.getArea());
        logger.info("Obwod: " + shape.getPerimeter());
    }
}