package shapes.factory;

import shapes.Circle;
import shapes.Shape;
import java.awt.Color;

public class CircleFactory extends ShapeFactory {
    @Override
    public Shape createShape(int x, int y, Color color, int... dimensions) {
        if (dimensions.length >= 1) {
            return new Circle(x, y, dimensions[0], color);
        }
        throw new IllegalArgumentException("Круг требует радиус");
    }
}
