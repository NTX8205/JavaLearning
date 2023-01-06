package 介面.unit5;

/*利用滑鼠 drag 可以繪製連續線條。*/
/*練習
1.增加線條厚度
2.加橡皮擦
3.加 clearRect*/
import java.awt.*;
import java.awt.event.*;

public class hw3 extends Frame implements ActionListener, MouseListener, MouseMotionListener {
    static hw3 frm = new hw3();
    static Button btnclose = new Button("關閉");

    public static void main(String[] args) {
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
        frm.setLayout(flow);
        frm.setSize(300, 300);
        frm.add(btnclose);
        frm.setVisible(true);
        btnclose.addActionListener(frm);
        frm.addMouseMotionListener(frm);
        frm.addMouseListener(frm);
    }

    int x1, x2, y1, y2;

    public void mouseDragged(MouseEvent e) {
        System.out.printf("x1 %d,y1 %d\n", x1, y1);
        x2 = e.getX();
        y2 = e.getY();
        Graphics g = getGraphics();
        g.setColor(Color.blue);
        g.drawLine(x1, y1, x2, y2);
        x1 = x2;
        y1 = y2;
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
    }

    public void actionPerformed(ActionEvent e) {
        System.exit(0);
    }
}