package 介面.unit6;

import java.awt.*;
import javax.swing.*;

public class hw7 {
    static JFrame frame = new JFrame();
static String name[]={"D:\\one.jpg","D:\\two.jpg","D:\\three.jpg","D:\\four.jpg","D:\\five.jpg","D:\\six.jpg","D:\\seven.jpg","D:\\eight.jpg","D:\\nine.jpg","D:\\ten.jpg"};
    static JLabel label = new JLabel();
    static ImageIcon img[] = new ImageIcon[name.length];
    static int index = 0;

    public static void main(String[] args) {
        frame.setLocation(100, 100);
        frame.setSize(500, 300);
        frame.setLayout(new FlowLayout());
        frame.add(label);
        frame.setVisible(true);
        for (int j = 0; j < name.length; j++)
            img[j] = new ImageIcon(name[j]);
        while (true) {
            for (int j = 0; j < name.length; j++) {
                label.setIcon(img[j]);
                try {
                    Thread.sleep(200);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}
