package 介面.unit6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class hw6 extends Frame implements ActionListener, MouseListener,
        MouseMotionListener {
    static hw6 frm = new hw6();
    static int painting = 0;
    static int paint_color = 0;
    static Button btn_green = new Button("Green"), btn_blue = new Button("blue"), btn_red = new Button("red");
    static Button btn1=new Button("矩形"),btn2=new Button("橢圓"),btn3=new Button("線條"),btn4=new Button("換圖"),btnclose=new Button("關閉");
    static JLabel label1 = new JLabel();
    static int fig = 1;
    static ImageIcon img1 = new ImageIcon("D:\\fig1.jpg");
    static ImageIcon img2 = new ImageIcon("D:\\fig2.jpg");

    public static void main(String[] args) {
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
        frm.setLayout(flow);
        frm.setSize(500, 500);
        frm.add(btn_red);
        frm.add(btn_green);
        frm.add(btn_blue);
        frm.add(btn1);
        btn_red.setBackground(Color.red);
        btn_green.setBackground(Color.green);
        btn_blue.setBackground(Color.blue);
        frm.add(btn2);
        frm.add(btn3);
        frm.add(btn4);
        frm.add(btnclose);
        label1.setIcon(img1);
        frm.add(label1);
        frm.setVisible(true);
        btnclose.addActionListener(frm);
        btn1.addActionListener(frm);
        btn_green.addActionListener(frm);
        btn_red.addActionListener(frm);
        btn_blue.addActionListener(frm);
        btn2.addActionListener(frm);
        btn3.addActionListener(frm);
        btn4.addActionListener(frm);
        frm.addMouseListener(frm);
        frm.addMouseMotionListener(frm);
    }

    int x1, x2, y1, y2;

    public void mouseDragged(MouseEvent e) {
        if (painting == 3) {
            x2 = e.getX();
            y2 = e.getY();
            Graphics g = getGraphics();
            switch (paint_color) {
                case 1:
                    g.setColor(Color.red);
                    break;
                case 2:
                    g.setColor(Color.green);
                    break;
                case 3:
                    g.setColor(Color.blue);
                    break;
                default:
                    g.setColor(Color.black);
            }
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
        switch (paint_color) {
            case 1:
                g.setColor(Color.red);
                break;
            case 2:
                g.setColor(Color.green);
                break;
            case 3:
                g.setColor(Color.blue);
                break;
            default:
                g.setColor(Color.black);
        }
        switch (painting) {
            case 1:
                g.drawRect(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x1 -
                        x2), Math.abs(y1 - y2));
                break;
            case 2:
                g.drawOval(Math.min(x1, x2), Math.min(y1, y2), Math.abs(x1 -
                        x2), Math.abs(y1 - y2));
                break;
            default:
        }
    }

    public void actionPerformed(ActionEvent e) {
        Button btn = (Button) e.getSource();
        if (btn == btn1)
            painting = 1;
        else if (btn == btn2)
            painting = 2;
        else if (btn == btn3)
            painting = 3;
        else if (btn == btn_red)
            paint_color = 1;
        else if (btn == btn_green)
            paint_color = 2;
        else if (btn == btn_blue)
            paint_color = 3;
        else if (btn == btn4) {
            if (fig == 1) {
                fig = 2;
                label1.setIcon(img2);
            } else {
                fig = 1;
                label1.setIcon(img1);
            }
        }
        if (btn == btnclose)
            System.exit(0);
    }
}