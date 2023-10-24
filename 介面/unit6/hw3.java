package 介面.unit6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*; /* 1. import swing*/

public class hw3 {
    static JFrame frame = new JFrame();
    static JLabel label = new JLabel();
    static JButton btn_next = new JButton("fig1");
    static JButton btn_prev = new JButton("fig2");
    static ImageIcon img = new ImageIcon("D:\\fig1.jpg");
    static ImageIcon img1 = new ImageIcon("D:\\fig2.jpg");

    public static void main(String[] args) {
        frame.setLocation(100, 100);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());
        frame.add(btn_next);
        frame.add(label);
        frame.add(btn_prev);
        btn_next.addActionListener(new ActLis());
        btn_prev.addActionListener(new ActLis());
        frame.setVisible(true);
        label.setIcon(img);
    }

    static class ActLis implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            if (btn == btn_prev)
                label.setIcon(img1);
            else
                label.setIcon(img);
        }
    }
}