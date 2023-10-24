package 介面.unit3.answer;

import java.awt.*;

public class answer2 extends Frame {
    static public answer2 frm = new answer2();

    public static void main(String args[]) {
        frm.setTitle("Java 繪圖練習");
        frm.setSize(600, 400);
        frm.setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.red);
        g.drawRect(100, 100, 400, 200);
        g.setColor(Color.blue);
        g.drawArc(100, 100, 200, 200, 45, 270);
        g.setColor(Color.green);
        g.drawArc(300, 100, 200, 200, 225, 270);
        g.setColor(Color.black);
        int[] x_coor = { 300, 400, 300, 200 };
        int[] y_coor = { 100, 200, 300, 200 };
        g.drawPolygon(x_coor, y_coor, 4);
    }
}
