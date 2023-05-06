package RanSanMoi;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class RanSanMoi extends JFrame {
    GameScreen game;
    public static ArrayList<User> users;// lưu thông tin người chơi game

    public RanSanMoi() {
        setSize(850, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        game = new GameScreen();
        add(game);
        users = new ArrayList<User>();

        docFile("data.txt");
        this.addKeyListener(new handler());

        setVisible(true);
    }


    public static void main(String[] args) {
        // TODO code application logic here
        RanSanMoi ranSanMoi = new RanSanMoi();
    }

    // chỉnh nút di chuyển cho rắn
    private class handler implements KeyListener {
        @Override
        public void keyTyped(KeyEvent e) {
        }

        @Override
        public void keyPressed(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_UP) {
                game.ran.setVector(ConRan.GO_UP);
            }
            else if(e.getKeyCode() == KeyEvent.VK_DOWN){
                game.ran.setVector(ConRan.GO_DOWN);
            }
            else if(e.getKeyCode() == KeyEvent.VK_LEFT){
                game.ran.setVector(ConRan.GO_LEFT);
            }
            else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
                game.ran.setVector(ConRan.GO_RIGHT);
            }
            else if(e.getKeyCode() == KeyEvent.VK_SPACE){
                GameScreen.isPlaying =! GameScreen.isPlaying;
                if(GameScreen.isGameOver){
                    GameScreen.isGameOver=false;
                    game.ran.resetGame();
                }
            }
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }

    }
    public static void docFile(String tenFile){
        try {
            FileReader fr = new FileReader(tenFile);
            BufferedReader br = new BufferedReader(fr);

            String line = null;

            while ((line=br.readLine()) != null) {
                String []str = line.split(" ");
                users.add(new User(str[0], str[1], str[2]));
            }

            br.close();
            fr.close();
        } catch (FileNotFoundException ex) {

        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public static void ghiFile(String tenFile){
        try {
            FileWriter fw = new FileWriter(tenFile);
            BufferedWriter bw = new BufferedWriter(fw);

            for (User user : users) {
                bw.write(user.getTen() + " " + user.getLevel() + " "+ user.getDiem());
                bw.newLine();
            }

            bw.close();
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(RanSanMoi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

