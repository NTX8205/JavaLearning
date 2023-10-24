package 介面.unit6;

/*利用Swing 建立視窗，將image加入label, (參考Java 入門邁向高手之路:ch29)*/
/*要有D:\\fig1.jpg及D:\\fig2.jpg*/
import java.awt.*;
import javax.swing.*; /* 1. import swing*/

public class hw1 {
    static JFrame frame = new JFrame("demo 7-1 Swing!"); /* 2. 改成JFrame, JLabel */
    static JLabel label1 = new JLabel();
    static JLabel label2 = new JLabel();
    static JPanel p1 = new JPanel(); /* frame 包含2個panel */
    static JPanel p2 = new JPanel();

    public static void main(String[] args) {
        frame.setLocation(100, 100);
        frame.setSize(500, 600);
        frame.setLayout(new FlowLayout());
        p1.add(label1);
        p2.add(label2);
        frame.add(p1);
        frame.add(p2);
        frame.setVisible(true);
        label1.setText("fig1");
        label1.setHorizontalTextPosition(JLabel.CENTER);
        label1.setVerticalTextPosition(JLabel.TOP);
        ImageIcon img1 = new ImageIcon("D:\\fig1.jpg"); /*
                                                         * 3.image 來源,注意image
                                                         * size不可太大
                                                         */
        label1.setIcon(img1); /* 4.將image 設定成label icon */
        label2.setText("fig2");
        label2.setHorizontalTextPosition(JLabel.CENTER);
        label2.setVerticalTextPosition(JLabel.TOP);
        ImageIcon img2 = new ImageIcon("D:\\fig2.jpg"); /* 5.另一個image */
        label2.setIcon(img2);
    }
}