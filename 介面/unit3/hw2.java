package 介面.unit3;

/* 矩形，圓(移動，大小固定)
練習：
1.可以改變圖形，例如圓，多邊形等。
2.改變路徑，走其他幾何圖形，例如圓形軌跡等*/
import java.awt.*;

public class hw2 extends Frame {
    static public hw2 frm = new hw2();

    public static void main(String args[]) {
        frm.setTitle("Java 繪圖練習");
        frm.setSize(600, 600);
        frm.setVisible(true);
    }

    public void paint(Graphics g) {
        int x, y, width;
        x = 200;
        y = 200;
        width = 30;
        for (int i = 0; i <= 300; i = i + 50) {
            g.drawRect(x + i, y, width, width);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
            }
        }
        x = 200;
        y = 200;
        g.setColor(Color.blue);
        x = 200;
        y = 200; /* 軌跡的圓心 */
        int radius = 100;/* 軌跡的半徑 */
        for (double i = 0; i < 6.28; i = i + 0.628) {
            int cur_x = (int) (x + radius * Math.cos(i));
            /*
             * cur_x=200+100*cos(i), i: 0...pi/2...pi...pi*3/2...2*pi,
             * cos(i)的值1 0 -1 0 1,
             * cur_x的值300 200 100 200 300
             */
            int cur_y = (int) (y + radius * Math.sin(i));
            /*
             * cur_y=200+100*sin(i), i: 0...pi/2...pi...pi*3/2...2*pi,
             * sin(i)的值0 1 0 -1 0
             * cur_y的值200 300 200 100 200
             */
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
            }
            g.drawOval(cur_x, cur_y, 50, 50);
            g.drawRect(cur_x, cur_y, 2, 2);
            System.out.printf("%d %d %f %f\n", cur_x, cur_y, Math.cos(i), Math.sin(i));
        }
    }
}