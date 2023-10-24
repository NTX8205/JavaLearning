package 介面.unit7;

/*主要參考文獻：基本概念，
參考文獻：洪錦魁著，Java 入門邁向高手之路，深石數位科技，chapter
21，2018/5。*/
/*Thread-1 模擬物體移動(二個同時) :
虛擬平行(非真正平行)*/
import java.awt.*;
import javax.swing.*;

public class hw1 extends JFrame {
    static public hw1 frm = new hw1();

    public static void main(String args[]) {
        frm.setTitle("Java 繪圖練習");
        frm.setSize(800, 800);
        frm.setVisible(true);
    }

    public void paint(Graphics g) {
        for (int i = 0; i <= 500; i = i + 10) {
            g.setColor(Color.blue);
            g.fillOval(100, 100 + i, 50, 50);
            g.setColor(Color.red);
            g.fillOval(200, 100 + i / 2, 50, 50);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
            g.clearRect(100, 100 + i, 50, 50);
            g.clearRect(200, 100 + i / 2, 50, 50);
        }
    }
}
