package 介面.unit6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class hw5 {
    static JFrame frame = new JFrame();
    static JLabel label = new JLabel();
    static JButton btn_next = new JButton();
    static JButton btn_prev = new JButton();
    static JButton btn_close = new JButton("CLOSE");
    static String name[] = { "D:\\fig1.jpg", "D:\\fig2.jpg", "D:\\fig3.jpg" };
    static ImageIcon img[] = new ImageIcon[name.length];
    static ImageIcon right = new ImageIcon("D:\\right_arrow.jpg");
    static ImageIcon left = new ImageIcon("D:\\left_arrow.jpg");
    static int index = 0;

    public static void main(String[] args) {
        frame.setLocation(100, 100);
        frame.setSize(800, 600);
        frame.setLayout(new FlowLayout());
        frame.add(btn_prev);
        frame.add(label);
        frame.add(btn_next);
        frame.add(btn_close);
        btn_next.addActionListener(new ActLis());
        btn_prev.addActionListener(new ActLis());
        btn_close.addActionListener(new ActLis());
        frame.setVisible(true);
        label.setBackground(Color.green);
        for (int j = 0; j < name.length; j++)
            img[j] = new ImageIcon(name[j]);
        label.setIcon(img[0]);
        btn_prev.setIcon(left);
        btn_next.setIcon(right);
    }

    static class ActLis implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            if (btn == btn_close)
                System.exit(0);
            if (btn == btn_next)
                index = (index + 1) % name.length;
            else
                index = (index + name.length - 1) % name.length;
            label.setIcon(img[index]);
        }

    }

}