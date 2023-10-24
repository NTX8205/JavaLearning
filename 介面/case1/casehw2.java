package 介面.case1;

/* case study 1(hw2)
先在text field輸入一個整數(假設是a)， 按下enter後，會產生一任選的數(1到a間的亂數)
同時出現在label及console上
練習：產生第二個亂數(再增加一個label)*/
import java.util.*;
import java.awt.*;
import java.awt.event.*;

public class casehw2 {
    static Frame frm = new Frame("random number");
    static Label label = new Label("先輸入最大值");
    static Button btnclose = new Button("關閉");
    static TextField txf = new TextField(5);

    public static void main(String[] args) {
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
        frm.setLayout(flow);
        frm.setSize(200, 200);
        frm.add(label);
        label.setBackground(Color.pink);
        frm.add(txf);
        frm.add(btnclose);
        frm.setVisible(true);
        txf.addActionListener(new ActionLis1());
        btnclose.addActionListener(new ActionLis2());
    }

    static class ActionLis1 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Date today = new Date();
            String str = "";
            int max = Integer.parseInt(txf.getText());
            System.out.println(today);
            long now = System.currentTimeMillis();
            long now1 = System.currentTimeMillis();
            Random random = new Random();
            while ((now1 - now) < (500)) {
                now1 = System.currentTimeMillis();
                str = "任選的數" + Integer.toString(random.nextInt(max) + 1);
                label.setText(str);
            }
            System.out.println(str);
        }
    }

    static class ActionLis2 implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}
