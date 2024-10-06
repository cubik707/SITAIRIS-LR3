package shapes.factory;

import shapes.Dot;
import shapes.Shape;

import java.awt.*;

public class DotFactory extends ShapeFactory {
    @Override
    public Shape createShape(int x, int y, Color color, int... dimensions) {
        return new Dot(x, y, color);
    }
}
