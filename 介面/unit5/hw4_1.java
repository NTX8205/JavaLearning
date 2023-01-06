package 介面.unit5;

import java.awt.*;
import java.awt.event.*;

public class hw4_1 extends Frame implements ActionListener, MouseListener,
        MouseMotionListener {
    static hw4_1 frm = new hw4_1();
    static int painting = 0;
    static int[][] data = new int[10000][5];
    static int ptr = 0;
    static Button btn1=new Button("矩形"),btn2=new Button("橢圓"),btn3=new Button("線條"),btnclose=new Button("關閉");

    public static void main(String[] args) {
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
        frm.setLayout(flow);
        frm.setSize(300, 300);
        frm.add(btn1);
        frm.add(btn2);
        frm.add(btn3);
        frm.add(btnclose);
        frm.setVisible(true);
        btnclose.addActionListener(frm);
        btn1.addActionListener(frm);
        btn2.addActionListener(frm);
        btn3.addActionListener(frm);
        frm.addMouseListener(frm);
        frm.addMouseMotionListener(frm);
        for (int i = 0; i < 1000; i++)
            for (int j = 0; j < 5; j++)
                data[i][j] = 0;
    }

    int x1, x2, y1, y2;

    public void mouseDragged(MouseEvent e) {
        if (painting == 3) {
            x2 = e.getX();
            y2 = e.getY();
            Graphics g = getGraphics();
            g.drawLine(x1, y1, x2, y2);
            data[ptr][0] = 3;
            data[ptr][1] = x1;
            data[ptr][2] = y1;
            data[ptr][3] = x2;
            data[ptr][4] = y2;
            ptr++;
            x1 = x2;
            y1 = y2;
        }
    }

    public void mouseMoved(MouseEvent e) {
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void mousePressed(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();
    }

    public void mouseReleased(MouseEvent e) {
        x2 = e.getX();
        y2 = e.getY();
        Graphics g = getGraphics();
        switch (painting) {
            case 1:
                g.drawRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x1 -
                        x2), Math.abs(y1 - y2));
                data[ptr][0] = 1;
                data[ptr][1] = Math.min(x1, x2);
                data[ptr][2] = Math.min(y1, y2);
                data[ptr][3] = Math.abs(x1 - x2);
                data[ptr][4] = Math.abs(y1 - y2);
                ptr++;
                break;
            case 2:
                g.drawOval(x1, y1, Math.abs(x1 - x2), Math.abs(y1 - y2));
                data[ptr][0] = 2;
                data[ptr][1] = Math.min(x1, x2);
                data[ptr][2] = Math.min(y1, y2);
                data[ptr][3] = Math.abs(x1 - x2);
                data[ptr][4] = Math.abs(y1 - y2);
                ptr++;
                break;
            default:
        }
    }

    public void actionPerformed(ActionEvent e) {
        Button btn = (Button) e.getSource();
        if (btn == btn1)
            painting = 1;
        if (btn == btn2)
            painting = 2;
        if (btn == btn3)
            painting = 3;
        if (btn == btnclose)
            System.exit(0);
    }

    public void paint(Graphics g) {
        g.fillOval(MAXIMIZED_BOTH, y1, WIDTH, HEIGHT);
        for (int i = 0; i < ptr; i = i + 1) {
            switch (data[i][0]) {
                case 1:
                    g.drawRect(data[i][1], data[i][2], data[i][3], data[i][4]);
                    break;
                case 2:
                    g.drawOval(data[i][1], data[i][2], data[i][3], data[i][4]);
                    break;
                case 3:
                    g.drawLine(data[i][1], data[i][2], data[i][3], data[i][4]);
                    break;
                default:
            }
        }
    }
}
