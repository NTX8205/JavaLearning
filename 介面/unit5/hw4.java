package 介面.unit5;

import java.awt.*;
import java.awt.event.*;

public class hw4 extends Frame implements ActionListener, MouseListener, MouseMotionListener {
    static hw4 frm = new hw4();
    static int paint_choice = 0;
    static Button btn1 = new Button("矩形"), btn2 = new Button("橢圓"), btn3 = new Button("線條"),
            btnclose = new Button("關閉");

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
    }

    int x1, x2, y1, y2;

    public void mouseDragged(MouseEvent e) {
        if (paint_choice == 3) {
            x2 = e.getX();
            y2 = e.getY();
            Graphics g = getGraphics();
            g.setColor(Color.blue);
            g.drawLine(x1, y1, x2, y2);
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
        g.setColor(Color.red);
        switch (paint_choice) {
            case 1:
                g.drawRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x1 - x2), Math.abs(y1 - y2));
                break;
            case 2:
                g.drawOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x1 - x2), Math.abs(y1 - y2));
                break;
            default:
        }
    }

    public void actionPerformed(ActionEvent e) {
        Button btn = (Button) e.getSource();
        if (btn == btn1)
            paint_choice = 1;
        if (btn == btn2)
            paint_choice = 2;
        if (btn == btn3)
            paint_choice = 3;
        if (btn == btnclose)
            System.exit(0);
    }
}