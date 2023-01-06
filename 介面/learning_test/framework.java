package 介面.learning_test;

import java.awt.*;

public class framework extends Frame {
    static public framework frm = new framework();

    public static void main(String[] args) {
        frm.setTitle("繪圖練習");
        frm.setSize(900, 900);
        frm.setLocation(500, 100);
        frm.setVisible(true);
    }

    public void paint(Graphics g) {
        int x, y, width;
        g.setColor(Color.black);
        x = 200;
        y = 200;
        width = 20;
        // 左
        for (int i = 0; i <= 500; i += 10) {
            g.fillRect(x + i, y, width, width);
            if (i <= 480) {
                g.setColor(Color.white);
                g.fillRect(x + i, y + 20, width, width);
            }
            if (i <= 460) {
                g.setColor(Color.black);
                g.fillRect(x + i, y + 40, width, width);
            }
            if (i <= 440) {
                g.setColor(Color.white);
                g.fillRect(x + i, y + 60, width, width);
            }
            if (i <= 420) {
                g.setColor(Color.black);
                g.fillRect(x + i, y + 80, width, width);
            }
            g.setColor(Color.black);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
        // 下
        x += 500;
        for (int i = 0; i <= 500; i += 10) {
            g.fillRect(x, y + i, width, width);
            if (i <= 440) {
                g.setColor(Color.white);
                g.fillRect(x - 20, y + i + 20, width, width);
            }
            if (i <= 400) {
                g.setColor(Color.black);
                g.fillRect(x - 40, y + i + 40, width, width);
            }
            if (i <= 360) {
                g.setColor(Color.white);
                g.fillRect(x - 60, y + i + 60, width, width);
            }
            if (i <= 320) {
                g.setColor(Color.black);
                g.fillRect(x - 80, y + i + 80, width, width);
            }
            g.setColor(Color.black);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
        // 右
        y += 500;
        for (int i = 0; i <= 500; i += 10) {
            g.fillRect(x - i, y, width, width);
            if (i <= 440) {
                g.setColor(Color.white);
                g.fillRect(x - i - 20, y - 20, width, width);
            }
            if (i <= 400) {
                g.setColor(Color.black);
                g.fillRect(x - i - 40, y - 40, width, width);
            }
            if (i <= 360) {
                g.setColor(Color.white);
                g.fillRect(x - i - 60, y - 60, width, width);
            }
            if (i <= 320) {
                g.setColor(Color.black);
                g.fillRect(x - i - 80, y - 80, width, width);
            }
            g.setColor(Color.black);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
        // 上
        x -= 500;
        for (int i = 0; i <= 400; i += 10) {
            g.fillRect(x, y - i, width, width);
            if (i <= 360) {
                g.setColor(Color.white);
                g.fillRect(x + 20, y - i - 20, width, width);
            }
            if (i <= 320) {
                g.setColor(Color.black);
                g.fillRect(x + 40, y - i - 40, width, width);
            }
            if (i <= 280) {
                g.setColor(Color.white);
                g.fillRect(x + 60, y - i - 60, width, width);
            }
            if (i <= 240) {
                g.setColor(Color.black);
                g.fillRect(x + 80, y - i - 80, width, width);
            }
            g.setColor(Color.black);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
        // 左
        y -= 400;
        for (int i = 0; i <= 400; i += 10) {
            g.fillRect(x + i, y, width, width);
            if (i <= 360) {
                g.setColor(Color.white);
                g.fillRect(x + i + 20, y + 20, width, width);
            }
            if (i <= 320) {
                g.setColor(Color.black);
                g.fillRect(x + i + 40, y + 40, width, width);
            }
            if (i <= 280) {
                g.setColor(Color.white);
                g.fillRect(x + i + 60, y + 60, width, width);
            }
            if (i <= 240) {
                g.setColor(Color.black);
                g.fillRect(x + i + 80, y + 80, width, width);
            }
            g.setColor(Color.black);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
        // 下
        x += 400;
        for (int i = 0; i <= 300; i += 10) {
            g.fillRect(x, y + i, width, width);
            if (i <= 260) {
                g.setColor(Color.white);
                g.fillRect(x - 20, y + i + 20, width, width);
            }
            if (i <= 220) {
                g.setColor(Color.black);
                g.fillRect(x - 40, y + i + 40, width, width);
            }
            if (i <= 180) {
                g.setColor(Color.white);
                g.fillRect(x - 60, y + i + 60, width, width);
            }
            if (i <= 140) {
                g.setColor(Color.black);
                g.fillRect(x - 80, y + i + 80, width, width);
            }
            g.setColor(Color.black);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
        // 右
        y += 300;
        for (int i = 0; i <= 300; i += 10) {
            g.fillRect(x - i, y, width, width);
            if (i <= 260) {
                g.setColor(Color.white);
                g.fillRect(x - i - 20, y - 20, width, width);
            }
            if (i <= 220) {
                g.setColor(Color.black);
                g.fillRect(x - i - 40, y - 40, width, width);
            }
            if (i <= 180) {
                g.setColor(Color.white);
                g.fillRect(x - i - 60, y - 60, width, width);
            }
            if (i <= 140) {
                g.setColor(Color.black);
                g.fillRect(x - i - 80, y - 80, width, width);
            }
            g.setColor(Color.black);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
        // 上
        x -= 300;
        for (int i = 0; i <= 200; i += 10) {
            g.fillRect(x, y - i, width, width);
            if (i <= 160) {
                g.setColor(Color.white);
                g.fillRect(x + 20, y - i - 20, width, width);
            }
            if (i <= 120) {
                g.setColor(Color.black);
                g.fillRect(x + 40, y - i - 40, width, width);
            }
            if (i <= 80) {
                g.setColor(Color.white);
                g.fillRect(x + 60, y - i - 60, width, width);
            }
            if (i <= 40) {
                g.setColor(Color.black);
                g.fillRect(x + 80, y - i - 80, width, width);
            }
            g.setColor(Color.black);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
        // 左
        y -= 200;
        for (int i = 0; i <= 200; i += 10) {
            g.fillRect(x + i, y, width, width);
            if (i <= 160) {
                g.setColor(Color.white);
                g.fillRect(x + i + 20, y + 20, width, width);
            }
            if (i <= 120) {
                g.setColor(Color.black);
                g.fillRect(x + i + 40, y + 40, width, width);
            }
            if (i <= 80) {
                g.setColor(Color.white);
                g.fillRect(x + i + 60, y + 60, width, width);
            }
            if (i <= 40) {
                g.setColor(Color.black);
                g.fillRect(x + i + 80, y + 80, width, width);
            }
            g.setColor(Color.black);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
        // 下
        x += 200;
        for (int i = 0; i <= 100; i += 10) {
            g.fillRect(x, y + i, width, width);
            if (i <= 60) {
                g.setColor(Color.white);
                g.fillRect(x - 20, y + i + 20, width, width);
            }
            if (i <= 40) {
                g.setColor(Color.black);
                g.fillRect(x - 40, y + i + 40, width, width);
            }
            if (i <= 20) {
                g.setColor(Color.white);
                g.fillRect(x - 60, y + i + 60, width, width);
            }
            g.setColor(Color.black);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
        // 右
        y += 100;
        for (int i = 0; i <= 100; i += 10) {
            g.fillRect(x - i, y, width, width);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
            }
        }
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
