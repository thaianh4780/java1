package Example;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample {
    public static  void  BorderLayout(){
        JFrame jFrame = new JFrame();

        BorderLayout borderLayout = new BorderLayout();
        borderLayout.setHgap(50);
        borderLayout.setVgap(50);

        JButton b1 = new JButton("North");
        JButton b2 = new JButton("South");
        JButton b3 = new JButton("East");
        JButton b4 = new JButton("West");
        JButton b5 = new JButton("Center");


        jFrame.add(b1,BorderLayout.NORTH);
        jFrame.add(b2,BorderLayout.SOUTH);
        jFrame.add(b3,BorderLayout.EAST);
        jFrame.add(b4,BorderLayout.WEST);
        jFrame.add(b5,BorderLayout.CENTER);

        jFrame.setSize(400 , 300);
        jFrame.setVisible(true);

    }

    public static void main(String[] args) {
        BorderLayout();
    }
}
