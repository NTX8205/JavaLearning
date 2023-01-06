package 介面.unit6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class hw2 {
    static JFrame frame = new JFrame("demo Swing and image");
    static JLabel label = new JLabel();
    static JPanel panel = new JPanel();
    static JButton button = new JButton("close");

    public static void main(String[] args) {
        frame.setLocation(100, 100);
        frame.setSize(500, 500);
        frame.setLayout(new FlowLayout());
        panel.add(button);
        panel.add(label);
        frame.add(panel);
        frame.setVisible(true);
        ImageIcon img = new ImageIcon("D:\\fig1.jpg");
        label.setIcon(img);
        button.addActionListener(new ActLis());
    }

    static class ActLis implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JButton btn = (JButton) e.getSource();
            if (btn == button)
                System.exit(0);
        }
    }
}