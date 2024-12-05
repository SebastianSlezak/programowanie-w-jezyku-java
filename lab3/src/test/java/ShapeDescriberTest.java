import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

class ShapeDescriberTest {
    @Test
    void testDescribe() {
        Shape mockShape = mock(Shape.class);

        when(mockShape.getColorDescription()).thenReturn("Czerwony");
        when(mockShape.getArea()).thenReturn(100.0);
        when(mockShape.getPerimeter()).thenReturn(40.0);

        ShapeDescriber shapeDescriber = new ShapeDescriber();
        shapeDescriber.describe(mockShape);

        verify(mockShape).getColorDescription();
        verify(mockShape).getArea();
        verify(mockShape).getPerimeter();
    }

    @Test
    void testDescribeWithRectangle() {
        ShapeDescriber shapeDescriber = new ShapeDescriber();
        Rectangle rectangle = new Rectangle(5, 10, new Color(255, 255, 255));
        shapeDescriber.describe(rectangle);
    }

    @Test
    void testDescribeWithTriangle() {
        ShapeDescriber shapeDescriber = new ShapeDescriber();
        Triangle triangle = new Triangle(3, 4, 5, 6, new Color(0, 0, 255));
        shapeDescriber.describe(triangle);
    }
}