package Example;


import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java.awt.geom.Point2D;

public class Car {
    private int xLeft;
    private int yTop;

    /**
     * 9 * Constructs a car with a given top left corner.
     * 10 *
     * 11 * @param x
     * 12 * the xcoordinate of the topleft corner
     * 13 * @param y
     * 14 * the ycoordinate of the topleft corner
     * 15
     */
    public Car(int x, int y) {
        xLeft = x;
        yTop = y;
    }

    /**
     * Draws the car.
     *
     * @param g2 the graphics context
     */
    public void draw(Graphics2D g2) {
        Rectangle body = new Rectangle(xLeft, yTop + 10, 60, 10);
        Ellipse2D.Double frontTire = new Ellipse2D.Double(xLeft + 10, yTop + 20,
                10, 10);
        Ellipse2D.Double rearTire = new Ellipse2D.Double(xLeft + 40, yTop + 20, 10, 10);

        // The bottom of the front windshield
        Point2D.Double r1 = new Point2D.Double(xLeft + 10, yTop + 10);
        // The front of the roof
        Point2D.Double r2 = new Point2D.Double(xLeft + 20, yTop);
        // The rear of the roof
        Point2D.Double r3 = new Point2D.Double(xLeft + 40, yTop);
        // The bottom of the rear windshield
        Point2D.Double r4 = new Point2D.Double(xLeft + 50, yTop + 10);

        Line2D.Double frontWindshield = new Line2D.Double(r1, r2);
        Line2D.Double roofTop = new Line2D.Double(r2, r3);
        Line2D.Double rearWindshield = new Line2D.Double(r3, r4);

        g2.draw(body);
        g2.draw(frontTire);
        g2.draw(rearTire);
        g2.draw(frontWindshield);
        g2.draw(roofTop);
        g2.draw(rearWindshield);
    }
}