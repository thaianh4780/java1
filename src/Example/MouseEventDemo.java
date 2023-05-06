package Example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseEventDemo extends JFrame {
    private JPanel mousePanel;
    private JLabel statusBar;

    public MouseEventDemo() {
        super("Demonstrating Mouse Events");
        mousePanel = new JPanel();
        mousePanel.setBackground(Color.WHITE);
        add(mousePanel, BorderLayout.CENTER);
        statusBar = new JLabel("Mouse outside JPanel");
        add(statusBar, BorderLayout.SOUTH);
        // create and register listener for mouse and mouse motion events
        MouseHandler handler = new MouseHandler();
        mousePanel.addMouseListener(handler);
        mousePanel.addMouseMotionListener(handler);
    }

    private class MouseHandler implements MouseListener, MouseMotionListener {
        public void mouseClicked(MouseEvent event) {
            String buttonClick = "";
            if (event.getButton() == MouseEvent.NOBUTTON) {
                buttonClick = "No button clicked";
            } else if (event.getButton() == MouseEvent.BUTTON1) {
                buttonClick = "Button 1 clicked";
            } else if (event.getButton() == MouseEvent.BUTTON2) {
                buttonClick = "Button 2 clicked";
            } else if (event.getButton() == MouseEvent.BUTTON3) {
                buttonClick = "Button 3 clicked";
            }
            statusBar.setText(String.format(buttonClick + " at [%d, %d]",
                    event.getX(), event.getY()));
        }

        public void mousePressed(MouseEvent event) {
            statusBar.setText(String.format("Pressed at [%d, %d]", event.getX(),
                    event.getY()));
        }

        public void mouseReleased(MouseEvent event) {
            statusBar.setText(String.format("Released at [%d, %d]", event.getX(),
                    event.getY()));
        }

        public void mouseEntered(MouseEvent event) {
            statusBar.setText(String.format("Mouse entered at [%d, %d]", event.getX(),
                    event.getY()));
            mousePanel.setBackground(Color.YELLOW);
        }

        public void mouseExited(MouseEvent event) {
            statusBar.setText("Mouse outside JPanel");
            mousePanel.setBackground(Color.WHITE);
        }

        public void mouseDragged(MouseEvent event) {
            statusBar.setText(String.format("Dragged at [%d, %d]", event.getX(),
                    event.getY()));
        }

        public void mouseMoved(MouseEvent event) {
            statusBar.setText(String.format("Moved at [%d, %d]", event.getX(),
                    event.getY()));
        }
    }

    public static void main(String[] args) {
        MouseEventDemo mouseTrackerFrame = new MouseEventDemo();
        mouseTrackerFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        mouseTrackerFrame.setSize(300, 100);
        mouseTrackerFrame.setVisible(true);
    }
}


