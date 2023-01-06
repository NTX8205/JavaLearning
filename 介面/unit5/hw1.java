package 介面.unit5;

/*利用Frame建立視窗，並加入label, 示範mouse基本事件處理，
用addMouseListener註冊(動作包含mouseClicked, mouseEntered, mouseExited, mousePressed,
mouseReleased)，另外還有MouseMotionListener(包含mouseMoved, mouseDragged)
本單元參考部分：洪錦魁著，Java 入門邁向高手之路(30-7)，深石數位科技，2018/5。*/
import java.awt.*;
import java.awt.event.*;

public class hw1 {
    static Frame frame = new Frame("demo mouse listener!!");
    static Label label = new Label("mouse事件處理 ");
    static Button btn = new Button("exit");

    public static void main(String[] args) {
        frame.setLocation(100, 100);
        frame.setSize(300, 300);
        frame.setLayout(null);
        label.setLocation(30, 30);
        label.setSize(200, 200);
        label.setBackground(Color.green);
        frame.add(label);
        label.addMouseListener(new ActLis());
        btn.setLocation(30, 250);
        btn.setSize(50, 50);
        frame.add(btn);
        btn.addActionListener(new ActLis1());
        frame.setVisible(true);
    }

    static class ActLis1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }

    static class ActLis implements MouseListener {
        int x1, y1;

        public void mouseClicked(MouseEvent e) {
            x1 = e.getX();
            y1 = e.getY();
            label.setText("mouse clicked" + Integer.toString(x1) + " " + Integer.toString(y1));
        }

        public void mouseEntered(MouseEvent e) {
            x1 = e.getX();
            y1 = e.getY();
            label.setText("mouse entered" + Integer.toString(x1) + " " + Integer.toString(y1));
        }

        public void mouseExited(MouseEvent e) {
            x1 = e.getX();
            y1 = e.getY();
            label.setText("mouse exited" + Integer.toString(x1) + " " + Integer.toString(y1));
        }

        public void mousePressed(MouseEvent e) {
            x1 = e.getX();
            y1 = e.getY();
            label.setText("mouse pressed" + Integer.toString(x1) + " " + Integer.toString(y1));
        }

        public void mouseReleased(MouseEvent e) {
            x1 = e.getX();
            y1 = e.getY();
            label.setText("mouse released" + Integer.toString(x1) + " " + Integer.toString(y1));
            System.out.println("mouse released" + Integer.toString(x1) + " " + Integer.toString(y1));
        }
    }
}
