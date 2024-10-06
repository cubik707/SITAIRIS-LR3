package shapes.factory;

import shapes.Shape;

import java.awt.*;

public abstract class ShapeFactory {
    public abstract Shape createShape(int x, int y, Color color, int... dimensions);
}
