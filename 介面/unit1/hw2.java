package 介面.unit1;
/*單元一 hw2
利用 Frame 建立視窗，包含一個 panel，並加入 button。
練習：請試著 1.增加一個 panel，並加入 button。*/

import java.awt.*;

public class hw2 {
    static Frame frame = new Frame("schools");
    static Panel panel = new Panel();
    static Panel panel2 = new Panel();
    /* 將 frame 及 panel 視為容器，可以放 label, button, text 等物件 */
    static Button button = new Button("names");
    static Button button2 = new Button("names2");

    public static void main(String[] args) {
        frame.setLocation(500, 100); /* 設定 frame 的原點座標 */
        frame.setSize(600, 600); /* 設定 frame 的大小 */
        frame.setLayout(null); /* 設定 frame 上其他物件的排列方式 */
        frame.setVisible(true); /* 設定 frame 是否顯示 */

        panel.setLocation(20, 50); /* 設定 panel 的原點座標 */
        panel.setSize(200, 200); /* 設定 panel 的大小 */
        panel.setLayout(null); /* 設定 panel 上其他物件的排列方式 */
        panel.setBackground(Color.yellow); /* 設定 panel 的背景顏色 */
        // frame.setTitle("test");
        button.setLocation(30, 50); /* 設定 button 的位置，大小，顏色，字型 */
        button.setSize(100, 50);
        button.setBackground(Color.green);
        button.setForeground(Color.red);
        button.setFont(new Font("細明體", Font.BOLD + Font.ITALIC, 20));
        panel.add(button); /* 將 button 加入 panel 中 */
        frame.add(panel); /* 將 panel 加入 frame 中 */

        /*
         * panel2
         */

        panel2.setBackground(Color.BLUE);
        panel2.setLayout(null);
        panel2.setLocation(20, 250);
        panel2.setSize(200, 200);
        frame.add(panel2);

        /*
         * button 2
         */

        button2.setLocation(10, 10);
        button2.setSize(60, 20);
        button2.setBackground(Color.PINK);
        panel2.add(button2);
    }
}
