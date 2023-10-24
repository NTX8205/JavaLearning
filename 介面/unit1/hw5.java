package 介面.unit1;

/*button事件處理(簡單計算)，利用button更動值，顯示在Label上
練習：
1.增加"平方功能的button"(較簡單)
2.增加"開根號功能的button"(要處理浮點數)較難，用Double.toString
*/
import java.awt.*;
import java.awt.event.*;

public class hw5 {
    static Frame frm = new Frame("schools");
    static Label label = new Label("0 ");
    static Button btnup = new Button(" 加 1 "), btndown = new Button(" 減 1 "),
            btnclear = new Button(" 重設 "), btnclose = new Button(" 關閉 ");
    static Button btnRoot = new Button("平方");
    static Button btnSqrt = new Button("開根號");
    static Button btnplus = new Button("乘2");
    static Button btnmins = new Button("除2");
    static double data = 0;
    static Action1Lis act = new Action1Lis();

    public static void main(String[] args) {
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
        frm.setLayout(flow);
        frm.setSize(500, 500);
        label.setSize(450, 100);
        frm.add(label);
        frm.add(btnup);
        frm.add(btndown);
        frm.add(btnclear);
        frm.add(btnRoot);
        frm.add(btnSqrt);
        frm.add(btnplus);
        frm.add(btnmins);
        frm.add(btnclose);
        frm.setVisible(true);
        label.setBackground(Color.yellow);
        btnclose.addActionListener(act);
        btnup.addActionListener(act);
        btndown.addActionListener(act);
        btnclear.addActionListener(act);
        btnRoot.addActionListener(act);
        btnSqrt.addActionListener(act);
        btnplus.addActionListener(act);
        btnmins.addActionListener(act);
    }

    static class Action1Lis implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Button btn = (Button) e.getSource();
            if (btn == btnup)
                data = data + 1;
            if (btn == btndown)
                data = data - 1;
            if (btn == btnclear)
                data = 0;
            if (btn == btnclose)
                System.exit(0);
            if (btn == btnRoot) {
                data = Math.pow(data, 2);
            }
            if (btn == btnSqrt) {
                data = Math.sqrt(data);
            }
            if (btn == btnplus) {
                data = data * 2;
            }
            if (btn == btnmins) {
                data = data / 2;
            }
            String str = Double.toString(data);
            label.setText(str);
        }
    }

}
