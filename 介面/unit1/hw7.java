package 介面.unit1;

/* textfield 按下enter時與按下button 一樣，呼叫addActionListener， 並且執行actionPerformed，將
輸入的資料顯示在console
練習：1.增加系級(要增加一個label及textfield)*/
import java.awt.*;
import java.awt.event.*;

public class hw7 {
    static Frame frm = new Frame("Action Event");
    static Label label1 = new Label("姓名:");
    static TextField txf1 = new TextField(20);
    static Label label2 = new Label("學號:");
    static TextField txf2 = new TextField(20);
    static Button btnclose = new Button("離開");

    public static void main(String[] args) {
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER, 5, 10);
        frm.setLayout(flow);
        frm.setSize(250, 400);
        frm.add(label1);
        frm.add(txf1);
        frm.add(label2);
        frm.add(txf2);
        frm.add(btnclose);
        frm.setVisible(true);
        /* 登記listener 為ActLis1類別(按了btnclose會去執行的物件程式) */
        btnclose.addActionListener(new ActLis1());
        /* 登記listener 為ActLis2類別(textfield 按了enter會去執行的物件程式) */
        txf1.addActionListener(new ActLis2());
        txf2.addActionListener(new ActLis2());
    }

    static class ActLis1 implements ActionListener {
        /* 按button的處理程序 */
        public void actionPerformed(ActionEvent e) {
            Button btn = (Button) e.getSource();
            if (btn == btnclose)
                System.exit(0);
        }
    }

    static class ActLis2 implements ActionListener {
        /* textfield 按確定的處理程序 */
        public void actionPerformed(ActionEvent e) {
            TextField txf = (TextField) e.getSource();
            if (txf == txf1)
                System.out.println("姓名:" + txf1.getText() + "\n");
            else
                System.out.println("學號:" + txf2.getText() + "\n");
        }
    }
}