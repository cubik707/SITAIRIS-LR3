package adapter;

import shapes.Shape;
import rect_from_another_library.Rectangle;
import java.awt.*;

public class RectangleAdapter implements Shape {
    private Rectangle rectangle;
    private boolean selected;

    public RectangleAdapter(Rectangle rectangle) {
        this.rectangle = rectangle;
        this.selected = false;
    }

    @Override
    public int getX() {
        return rectangle.getX();
    }

    @Override
    public int getY() {
        return rectangle.getY();
    }

    @Override
    public int getWidth() {
        return rectangle.getWidth();
    }

    @Override
    public int getHeight() {
        return rectangle.getHeight();
    }

    @Override
    public void move(int x, int y) {
        rectangle.move(x, y);
    }

    @Override
    public boolean isInsideBounds(int x, int y) {
        // Проверяем, находится ли точка (x, y) внутри границ прямоугольника
        return x >= getX() && x <= getX() + getWidth() &&
                y >= getY() && y <= getY() + getHeight();
    }

    @Override
    public void select() {
        selected = true;
    }

    @Override
    public void unSelect() {
        selected = false;
    }

    @Override
    public boolean isSelected() {
        return selected;
    }

    @Override
    public void paint(Graphics graphics) {
        rectangle.draw(graphics);
        if (isSelected()) {
            graphics.setColor(Color.RED);
            graphics.drawRect(getX(), getY(), getWidth(), getHeight());
        }
    }
}
