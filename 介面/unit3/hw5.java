package 介面.unit3;

/*paint 會在視窗改變時自動重新繪圖
 僅利用 按 button 繪圖(無法利用滑鼠定座標*/
import java.awt.*;
import java.awt.event.*;

public class hw5 extends Frame implements ActionListener {
    static hw5 frm = new hw5();
    static boolean painting1 = false, painting2 = false;
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
        if (btn == btn1)
            painting1 = true;
        if (btn == btn2)
            painting2 = true;
        if (btn == btnclose)
            System.exit(0);
        paint(g);
    }

    public void paint(Graphics g) {
        if (painting1 == true)
            g.drawRect(100, 100, 80, 80);
        if (painting2 == true) {
            g.setColor(Color.blue);
            g.fillOval(200, 200, 80, 80);
        }
    }
}