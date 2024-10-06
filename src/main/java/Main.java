import editor.ImageEditor;
import shapes.Circle;
import shapes.CompoundShape;
import shapes.Dot;
import shapes.Rectangle;
import shapes.factory.CircleFactory;
import shapes.factory.DotFactory;
import shapes.factory.RectangleFactory;
import shapes.factory.ShapeFactory;
import shapes.factory.CompoundShapeFactory;
import shapes.Shape;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        ImageEditor editor = new ImageEditor();

        ShapeFactory circleFactory = new CircleFactory();
        ShapeFactory dotFactory = new DotFactory();
        ShapeFactory rectangleFactory = new RectangleFactory();
        CompoundShapeFactory compoundShapeFactory = new CompoundShapeFactory();

        Shape circle1 = circleFactory.createShape(10, 10, Color.BLUE, 10);

        // Создание первого CompoundShape (круг и точка)
        Shape circle2 = circleFactory.createShape(110, 110, Color.RED, 50);
        Shape dot1 = dotFactory.createShape(160, 160, Color.RED);
        CompoundShape compoundShape1 = compoundShapeFactory.createCompoundShape(circle2, dot1);

        // Создание второго CompoundShape (прямоугольник и точки)
        Shape rectangle = rectangleFactory.createShape(250, 250, Color.GREEN, 100, 100);
        Shape dot2 = dotFactory.createShape(240, 240, Color.GREEN);
        Shape dot3 = dotFactory.createShape(240, 360, Color.GREEN);
        Shape dot4 = dotFactory.createShape(360, 360, Color.GREEN);
        Shape dot5 = dotFactory.createShape(360, 240, Color.GREEN);
        CompoundShape compoundShape2 = compoundShapeFactory.createCompoundShape(rectangle, dot2, dot3, dot4, dot5);

        editor.loadShapes(circle1, compoundShape1, compoundShape2);
    }
}