package 介面.unit7;

/* Thread -5 ：3個threads，共顯示2個會移動的球，第三個close
button*/
import java.awt.*;
import java.awt.event.*;

public class hw5 {
    public static Frame frm = new Frame();
    public static Button btn = new Button("close");

    public static class MultiThread1 extends Thread {
        public void run() {
            Graphics g = frm.getGraphics();
            g.setColor(Color.blue);
            while (true) {
                for (int i = 0; i <= 200; i = i + 20) {
                    g.fillOval(100 + i, 100, 50, 50);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                    }
                    g.clearRect(100 + i, 100, 50, 50);
                }
            }
        }
    }

    public static class MultiThread2 extends Thread {
        public void run() {
            Graphics g = frm.getGraphics();
            g.setColor(Color.red);
            while (true) {
                for (int i = 0; i <= 200; i = i + 20) {
                    g.fillOval(100 + i, 100 + i, 50, 50);
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                    }
                    g.clearRect(100 + i, 100 + i, 50, 50);
                }
            }
        }
    }

    public static class MultiThread3 extends Thread {
        static class ActLis implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }

        public void run() {
            btn.addActionListener(new ActLis());
        }
    }

    public static void main(String args[]) {
        frm.setLayout(null);
        frm.setSize(500, 500);
        btn.setLocation(50, 50);
        frm.add(btn);
        btn.setSize(50, 30);
        frm.setVisible(true);
        MultiThread1 t1 = new MultiThread1();
        MultiThread2 t2 = new MultiThread2();
        MultiThread3 t3 = new MultiThread3();
        t1.start();
        t2.start();
        t3.start();
    }
}
