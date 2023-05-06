package RanSanMoi;

import javax.swing.*;
import java.awt.*;

public class GameScreen extends JPanel implements Runnable {

    Thread thread;
    ConRan ran;

    static int[][] bg = new int[20][20];//tạo cột, dòng cho con rắn di chuyển
    static int padding = 10;
    static int WIDTH = 400;
    static int HEIGHT = 400;

    public static boolean isPlaying = false;// xem người chơi có đang chơi game hay ko
    static boolean textPlayGame = false;// xem người chơi có đang chơi game hay ko
    static boolean isGameOver = false;// xem đã thua hay chưa

    static int currentLevel = 1;
    static int diem =0;

    public GameScreen() {
        ran = new ConRan();
        bg[10][10] = 2;// cho xuất hiện con mồi đầu tiên
        thread = new Thread(this);
        thread.start();
    }

    public void paintBg(Graphics g) {
        g.setColor(Color.BLACK);
        g.fillRect(0, 0, WIDTH + padding * 2 + 400, HEIGHT + padding * 2);
        for (int i = 0; i < 20; i++) {
            for (int j = 0; j < 20; j++) {
                //g.fillRect(i*20, j*20, 18, 18);

                // vẽ con mồi
                if (bg[i][j] == 2) {
                    g.setColor(Color.yellow);
                    g.fillOval(i * 20 + GameScreen.padding, j * 20 + GameScreen.padding,
                            20, 20);
                    g.setColor(Color.gray);
                }
            }
        }
    }

    private void veKhung(Graphics g) {
        g.setColor(Color.ORANGE);
        g.drawRect(0, 0, WIDTH + padding * 2, HEIGHT + padding * 2);
        g.drawRect(1, 1, WIDTH + padding * 2 - 2, HEIGHT + padding * 2 - 2);
        g.drawRect(2, 2, WIDTH + padding * 2 - 4, HEIGHT + padding * 2 - 4);

        g.drawRect(0, 0, WIDTH + padding * 2 + 200, HEIGHT + padding * 2);
        g.drawRect(1, 1, WIDTH + padding * 2 - 2 + 200, HEIGHT + padding * 2 - 2);
        g.drawRect(2, 2, WIDTH + padding * 2 - 4 + 200, HEIGHT + padding * 2 - 4);

        g.drawRect(0, 0, WIDTH + padding * 2 + 400, HEIGHT + padding * 2);
        g.drawRect(1, 1, WIDTH + padding * 2 - 2 + 400, HEIGHT + padding * 2 - 2);
        g.drawRect(2, 2, WIDTH + padding * 2 - 4 + 400, HEIGHT + padding * 2 - 4);
    }

    public void paint(Graphics g) {
        paintBg(g);
        ran.veRan(g);
        veKhung(g);

        if (!isPlaying) {
            if (!textPlayGame) {
                g.setColor(Color.white);
                g.setFont(g.getFont().deriveFont(18.0f));
                g.drawString("Nhấn nút SPACE để chơi game!", 90, 180);
            }
        }

        if (isGameOver) {
            if (!textPlayGame) {
                g.setColor(Color.white);
                g.setFont(g.getFont().deriveFont(25.0f));
                g.drawString("GameOver!", 120, 220);
            }
        }

        g.setColor(Color.white);
        g.setFont(g.getFont().deriveFont(25.0f));
        g.drawString("LEVEL: "+currentLevel, 450, 100);


        g.setFont(g.getFont().deriveFont(18.0f));
        g.drawString("Diem: "+diem, 450, 130);

        g.setFont(g.getFont().deriveFont(18.0f));
        g.drawString("Thông tin người chơi", 630, 70);

        for (int i = 0; i < RanSanMoi.users.size(); i++) {
            g.drawString(RanSanMoi.users.get(i).toString(), 650, i*30+110);
        }
    }

    @Override
    public void run() {
        long t = 0;
        while (true) {
            if (System.currentTimeMillis() - t > 500) {
                textPlayGame = !textPlayGame;
                t = System.currentTimeMillis();
            }
            if (isPlaying) {
                ran.update();
            }

            repaint();
            try {
                thread.sleep(20);
            } catch (Exception e) {
            }
        }
    }
}

