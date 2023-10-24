package 介面.unit3.answer;

import java.awt.*;

public class answer1 extends Frame {
    static public answer1 frm = new answer1();

    public static void main(String args[]) {
        frm.setTitle("Java 繪圖練習");
        frm.setSize(800, 800);
        frm.setVisible(true);
    }

    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawRect(200, 200, 200, 200);
        g.drawOval(0, 0, 400, 400);
        g.drawOval(200, 0, 400, 400);
        g.drawOval(0, 200, 400, 400);
        g.drawOval(200, 200, 400, 400);

        g.setColor(Color.pink);
        g.drawRect(200, 200, 200, 200);
        g.drawArc(0, 0, 400, 400, 270, 90);
        g.drawArc(200, 0, 400, 400, 180, 90);
        g.drawArc(0, 200, 400, 400, 0, 90);
        g.drawArc(200, 200, 400, 400, 90, 90);
    }
}
