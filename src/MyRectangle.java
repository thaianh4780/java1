import java.awt.*;

public class MyRectangle extends MyShape implements Drawable {
    private int width, height;


    public MyRectangle(int x, int y, int width, int height) {
        super(x, y);
        this.width = width;
        this.height = height;
    }

    @Override
    public double caculateArea() {
        return width * height;
    }

    @Override
    public String toString() {
        return "this is a MyRectangle";
    }

    @Override
    public void draw(Graphics2D g2d) {
        Rectangle box = new Rectangle(x, y, width, height);
        g2d.draw(box);
        g2d.drawLine(x, y, x + width, y + height);
        g2d.drawLine(x, y + height, x + width, y);
    }
}
