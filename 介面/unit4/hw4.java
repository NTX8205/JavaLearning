package 介面.unit4;

/* hw 4:設計一個使用者介面，使用者可以輸入input file name或output file name，
系統會將資料從input file讀入textarea，
或將目前Textarea的資料寫回指定的output file*/
import java.awt.*;
import java.util.*;
import java.awt.event.*;
import java.io.*;

public class hw4 {
    static Frame frm = new Frame("Action Event");
    static Label label1 = new Label("output name:");
    static TextField txf1 = new TextField(20);
    static Label label2 = new Label("input name");
    static TextField txf2 = new TextField(20);
    static TextArea txtarea1 = new TextArea("", 10, 30);
    static Button btnclose = new Button("close");
    static Button btnsave = new Button("save");
    static Button btnread = new Button("read");

    public static void main(String[] args) {
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER, 5, 10);
        frm.setLayout(flow);
        frm.setSize(250, 400);
        frm.add(label1);
        frm.add(txf1);
        frm.add(btnsave);
        frm.add(label2);
        frm.add(txf2);
        frm.add(btnread);
        frm.add(btnclose);
        frm.add(txtarea1);
        frm.setVisible(true);
        /* 登記listener 為ActLis1類別(按了btnsave, btnread會去執行的物件程式) */
        btnsave.addActionListener(new ActLis1());
        btnread.addActionListener(new ActLis1());
        /* 登記listener 為ActLis1類別(按了btnclose會去執行的物件程式) */
        btnclose.addActionListener(new ActLis1());
    }

    static class ActLis1 implements ActionListener {
        /* 按button的處理程序 */
        public void actionPerformed(ActionEvent e) {
            Button btn = (Button) e.getSource();
            try {
                if (btn == btnsave) {
                    PrintWriter out = new PrintWriter(new File(txf1.getText()));
                    out.println(txtarea1.getText());
                    out.close();
                    System.out.println(txtarea1.getText());
                } else if (btn == btnread) {
                    Scanner in = new Scanner(new File(txf2.getText()));
                    txtarea1.setText("");
                    while (in.hasNext())
                        txtarea1.append(in.nextLine() + "\n");
                    in.close();
                } else
                    System.exit(0);
            } catch (IOException ioe) {
                System.out.println("file error");
            }
        }
    }
}
