package RanSanMoi;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class ConRan {

    private int doDai;
    private int[] x; //Toạ độ rắn di chuyển
    private int[] y; //Toạ độ rắn di chuyển

    private int vector;
    public static int GO_UP = 1;
    public static int GO_DOWN = -1;
    public static int GO_LEFT = 2;
    public static int GO_RIGHT = -2;

    long t = 0;
    int tocDo = 200;
    int doDaiToiDa = 8;
    boolean upadateChange = false;

    public int getDoDai() {
        return doDai;
    }

    public void setDoDai(int doDai) {
        this.doDai = doDai;
    }

    public int[] getX() {
        return x;
    }

    public void setX(int[] x) {
        this.x = x;
    }

    public int[] getY() {
        return y;
    }

    public void setY(int[] y) {
        this.y = y;
    }

    public int getVector() {
        return vector;
    }

    public void setVector(int vector) {
        if (this.vector != -vector && upadateChange) {
            this.vector = vector;
            upadateChange = false;
        }

    }

    public ConRan() {
        x = new int[100];
        y = new int[100];

        x[0] = 5;
        y[0] = 5;
        x[1] = 5;
        y[1] = 4;
        x[2] = 5;
        y[2] = 3;

        vector = ConRan.GO_DOWN;
        doDai = 3;
    }

    public void resetGame() {
        x = new int[100];
        y = new int[100];

        x[0] = 5;
        y[0] = 5;
        x[1] = 5;
        y[1] = 4;
        x[2] = 5;
        y[2] = 3;

        vector = ConRan.GO_DOWN;
        doDai = 3;
    }

    public boolean toaDoNamTrongThanRan(int x1, int y1) {
        for (int i = 0; i < doDai; i++) {
            if (x[i] == x1 && y[i] == y1) {
                return true;
            }
        }
        return false;
    }

    //Xuất hiện mồi mới
    public Point layToaDo() {
        Point p;
        Random r = new Random();
        int x;
        int y;
        do {
            x = r.nextInt(19);//từ 0 -> 19
            y = r.nextInt(19);
        } while (toaDoNamTrongThanRan(x, y));

        p = new Point(x, y);
        return p;

    }

    public int tinhSpeedChuyenLevel() {
        int speedChuyenlevel = tocDo;
        for (int i = 1; i < GameScreen.currentLevel; i++) {
            speedChuyenlevel *= 0.9;
        }
        return speedChuyenlevel;
    }

    public void chuyenLevel() {
        if (doDai == doDaiToiDa) {
            resetGame();
            GameScreen.isPlaying = false;
            GameScreen.currentLevel++;
            tocDo = tinhSpeedChuyenLevel();
            doDaiToiDa += 2;
        }
    }

    public void gameOver() {
        for (int i = 1; i < doDai; i++) {
            if (x[0] == x[i] && y[0] == y[i]) {
                String name = JOptionPane.showInputDialog("Nhap ten: ");
                RanSanMoi.users.add(new User(name, String.valueOf(GameScreen.currentLevel),
                        String.valueOf(GameScreen.diem)));
                RanSanMoi.ghiFile("data.txt");

                GameScreen.isPlaying = false;
                GameScreen.isGameOver = true;
                GameScreen.currentLevel = 1;
                GameScreen.diem = 0;
            }
        }
    }

    public void anMoi() {
        if (GameScreen.bg[x[0]][y[0]] == 2) {
            doDai++;
            GameScreen.diem += 100;
            GameScreen.bg[x[0]][y[0]] = 0;
            //xuất hiện mồi mới
            GameScreen.bg[layToaDo().x][layToaDo().y] = 2;
        }
    }

    public void update() {
        //Chuyển level
        chuyenLevel();

        //GameOver đầu rắn đụng phải thân rắn
        gameOver();

        if (System.currentTimeMillis() - t > tocDo) {
            upadateChange = true;
            //rắn đụng phải mồi
            anMoi();

            //phần đuôi với phần đầu di chuyển đều với nhau
            for (int i = doDai - 1; i > 0; i--) {
                x[i] = x[i - 1];
                y[i] = y[i - 1];
            }

            // chỉnh hướng của con rắn
            if (vector == ConRan.GO_UP) {
                y[0]--;
            } else if (vector == ConRan.GO_DOWN) {
                y[0]++;
            } else if (vector == ConRan.GO_LEFT) {
                x[0]--;
            } else {
                x[0]++;
            }

            // để cho con rắn nó xuất hiện sau khi đụng tường
            if (x[0] < 0) {
                x[0] = 19;
            } else if (x[0] > 19) {
                x[0] = 0;
            } else if (y[0] < 0) {
                y[0] = 19;
            } else if (y[0] > 19) {
                y[0] = 0;
            }

            t = System.currentTimeMillis();
        }
    }

    public void veRan(Graphics g) {

        for (int i = 0; i < doDai; i++) {
            g.setColor(Color.magenta);
            if (i == 0) {
                g.setColor(Color.red);
                g.fillRect(x[i] * 20 + GameScreen.padding, y[i] * 20 + GameScreen.padding, 20, 18);
            } else {
                //g.fillRect(x[i] * 20 + GameScreen.padding, y[i] * 20 + GameScreen.padding, 20, 20);
//                Ellipse2D.Double frontTire = new Ellipse2D.Double(x[i] * 20 + GameScreen.padding + 10, y[i] * 20 + GameScreen.padding,
//                        20, 20);
                g.fillOval(x[i] * 20 + GameScreen.padding, y[i] * 20 + GameScreen.padding,
                        20, 18);
            }
        }
    }
}