package 介面.unit1;

//單元一:hw8
/* textfield 按下enter，或按下確定按鈕時，會執行actionPerformed， 將輸入的資料顯示在
textarea，
練習：
1.若按下離開button ，除將輸入的資料顯示在console，也存入檔案。*/
import java.awt.*;
import java.awt.event.*;

public class hw8 {
    static Frame frm = new Frame("Action Event");
    static Label label1 = new Label("姓名:");
    static TextField txf1 = new TextField(20);
    static Label label2 = new Label("學號:");
    static TextField txf2 = new TextField(20);
    static TextArea txtarea1 = new TextArea("", 10, 20);
    static Button btnclose = new Button("離開");
    static Button btnok = new Button("確定");

    public static void main(String[] args) {
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER, 5, 10);
        frm.setLayout(flow);
        frm.setSize(250, 400);
        frm.add(label1);
        frm.add(txf1);
        frm.add(label2);
        frm.add(txf2);
        frm.add(btnok);
        frm.add(btnclose);
        frm.add(txtarea1);
        frm.setVisible(true);
        /* 登記listener 為ActLis2類別(按了btnok會去執行的物件程式) */
        btnok.addActionListener(new ActLis2());
        /* 登記listener 為ActLis2類別(textfield 按了enter會去執行的物件程式) */
        txf1.addActionListener(new ActLis2());
        txf2.addActionListener(new ActLis2());
        /* 登記listener 為ActLis1類別(按了btnclose會去執行的物件程式) */
        btnclose.addActionListener(new ActLis1());
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
        /* 按確定的處理程序 */
        public void actionPerformed(ActionEvent e) {
            txtarea1.setText("");
            txtarea1.append("姓名:" + txf1.getText() + "\n");
            txtarea1.append("學號:" + txf2.getText() + "\n");
        }
    }
}
