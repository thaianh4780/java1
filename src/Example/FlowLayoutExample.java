package Example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FlowLayoutExample {

    public static void FlowLayoutExample() {
        JFrame jFrame = new JFrame("FlowLayout Example");
        FlowLayout flowLayout = new FlowLayout();
        Container container = jFrame.getContentPane();
        JButton btnLeft = new JButton("Left");
        JButton btnCenter = new JButton("Center");
        JButton btnRight = new JButton("Right");
        container.add(btnLeft);
        container.add(btnCenter);
        container.add(btnRight);
        jFrame.setLayout(flowLayout);

        btnLeft.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flowLayout.setAlignment(FlowLayout.LEFT);
                flowLayout.layoutContainer(container);
            }
        });

        btnCenter.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flowLayout.setAlignment(FlowLayout.CENTER);
                flowLayout.layoutContainer(container);
            }
        });

        btnRight.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                flowLayout.setAlignment(FlowLayout.RIGHT);
                flowLayout.layoutContainer(container);
            }
        });

        jFrame.setSize(400, 10);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        FlowLayoutExample();
    }
}
