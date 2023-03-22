import javax.swing.*;
import java.awt.*;

public class Chuong8 extends JComponent{
    public static void main(String[] args) {

        MyRectangle mr1 = new MyRectangle(10,20,100,100);
        JFrame frame = new JFrame();
        frame.setSize(300,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Rectangle rectangle = new Rectangle();
//        frame.add(rectangle);

//        Rectangle box = new Rectangle(x, y, width, height);
        System.out.println(mr1.caculateArea());
        System.out.println(mr1.toString());
//        System.out.println(mr1.draw(););
    }



    @Override
    public void paint(Graphics g) {
        super.paint(g);

    }
}
