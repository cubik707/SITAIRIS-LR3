package shapes.factory;

import shapes.Rectangle;
import shapes.Shape;
import java.awt.Color;

public class RectangleFactory extends ShapeFactory {
    @Override
    public Shape createShape(int x, int y, Color color, int... dimensions) {
        if (dimensions.length >= 2) {
            return new Rectangle(x, y, dimensions[0], dimensions[1], color);
        }
        throw new IllegalArgumentException("Прямоугольник требует ширину и высоту");
    }
}
