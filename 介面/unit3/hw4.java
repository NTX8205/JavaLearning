package 介面.unit3;

//Hw4
import java.awt.*;
import java.awt.event.*;

public class hw4 extends Frame implements ActionListener {
    static hw4 frm = new hw4();
    static Button btn1 = new Button("矩形"), btn2 = new Button("橢圓"), btnclose = new Button("關閉");

    public static void main(String[] args) {
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
        frm.setLayout(flow);
        frm.setSize(300, 300);
        frm.add(btn1);
        frm.add(btn2);
        frm.add(btnclose);
        frm.setVisible(true);
        btnclose.addActionListener(frm);
        btn1.addActionListener(frm);
        btn2.addActionListener(frm);
    }

    public void actionPerformed(ActionEvent e) {
        Button btn = (Button) e.getSource();
        Graphics g = getGraphics();
        if (btn == btn1) {
            g.setColor(Color.red);
            g.drawRect(100, 100, 50, 50);
        }
        if (btn == btn2) {
            g.setColor(Color.blue);
            g.fillOval(200, 200, 50, 50);
        }
        if (btn == btnclose)
            System.exit(0);
    }
}
