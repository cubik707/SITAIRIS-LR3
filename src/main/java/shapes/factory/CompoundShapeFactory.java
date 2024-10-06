package shapes.factory;

import shapes.CompoundShape;
import shapes.Shape;
import java.awt.Color;

public class CompoundShapeFactory extends ShapeFactory {
    @Override
    public Shape createShape(int x, int y, Color color, int... dimensions) {
        return new CompoundShape();
    }

    public CompoundShape createCompoundShape(Shape... shapes) {
        return new CompoundShape(shapes);
    }
}

