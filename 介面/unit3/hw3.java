package 介面.unit3;

/* 模擬物體移動 :
練習：
1.可以改變圖形形狀或大小，例如圓形等
2.如何改變路徑，速度，精細度等
*/
import java.awt.*;

public class hw3 extends Frame {
    static public hw3 frm = new hw3();

    public static void main(String args[]) {
        frm.setTitle("Java 繪圖練習");
        frm.setSize(800, 800);
        frm.setVisible(true);
    }

    public void paint(Graphics g) {
        int x, y, width;
        g.setColor(Color.blue);
        x = 200;
        y = 200;
        width = 30;
        for (int i = 0; i <= 300; i = i + 5) {
            g.fillRect(x + i, y, width, width);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
            g.clearRect(x + i, y, width, width);
        }
        x = 200;
        y = 200;
        width = 50;
        g.setColor(Color.pink);
        x = 200;
        y = 200;
        int radius = 100;
        for (double i = 0; i <= 6.28318; i = i + 0.0314159) {
            int cur_x = (int) (x + radius * Math.cos(i));
            int cur_y = (int) (y + radius * Math.sin(i));
            g.fillOval(cur_x, cur_y, 50, 50);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
            }
            g.clearRect(cur_x, cur_y, 50, 50);
            System.out.printf("%d %d %f %f\n", cur_x, cur_y, Math.cos(i), Math.sin(i));
        }
    }
}