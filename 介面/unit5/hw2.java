package 介面.unit5;

/*mouse 事件和繪圖結合
/*練習：增加一個填滿矩形*/
import java.awt.*;
import java.awt.event.*;

public class hw2 extends Frame implements ActionListener, MouseListener {
    static hw2 frm = new hw2();
    static int paint_choice = 0;
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
        frm.addMouseListener(frm);
    }

    int x1, x2, y1, y2;

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
        if (btn == btnclose)
            System.exit(0);
    }
}
