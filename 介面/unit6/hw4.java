package 介面.unit6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*; /* 1. import swing*/

public class hw4 {
    static JFrame frm = new JFrame(); /* 設定frame內的物件 */
    static JMenuBar menubar = new JMenuBar();
    static JMenu menu_1 = new JMenu("檔案"), menu_3 = new JMenu("關閉");
static JMenuItem menuitem11=new JMenuItem("留言"),menuitem12=new JMenuItem("存檔"),menuitem31=new JMenuItem("離開系統");
    static TextArea textarea = new TextArea();
    static JDialog dialog = new JDialog(frm); /*
                                               * dialog之擁有者為frm, 設定dialog內的物
                                               * 件
                                               */
    static JTextField txf = new JTextField(20);
    static JLabel label = new JLabel();
    static ActLis act = new ActLis();
    static String str = "";

    public static void main(String[] args) {
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER, 50, 20);
        frm.setLayout(flow);
        frm.setSize(500, 300);
        menubar.add(menu_1);
        menubar.add(menu_3);
        menu_1.add(menuitem11);
        menu_1.add(menuitem12);
        menu_3.add(menuitem31);
        frm.setJMenuBar(menubar);
        frm.setVisible(true);
        frm.add(textarea);
        menuitem11.addActionListener(act);
        menuitem12.addActionListener(act);
        menuitem31.addActionListener(act);
        /* 設定dailog 內物件,尚未設定顯示 */
        dialog.setSize(300, 200);
        dialog.setLayout(flow);
        dialog.add(label);
        dialog.add(txf);
        txf.addActionListener(new ActLis1());
    }

    static class ActLis implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            JMenuItem item = (JMenuItem) e.getSource();
            if (item == menuitem11) {
                textarea.append("選擇留言\n");
                /**/ ImageIcon img1 = new ImageIcon("D:\\fig1.jpg");
                label.setIcon(img1);
                label.setText("請留言\n");
                str = "";
                txf.setText(str);
                dialog.setModal(true); /* dialog完成才可以回到frame */
                dialog.setVisible(true);/* 顯示dialog */
                textarea.append(str + "\n");
            } else if (item == menuitem12) {
                textarea.append("選擇存檔\n");
            } else if (item == menuitem31) {
                System.exit(0);
            }
        }
    }

    static class ActLis1 implements ActionListener {
        /* 在txf按enter的處理程序 */
        public void actionPerformed(ActionEvent e) {
            str = txf.getText();
            dialog.setVisible(false);/* 隱藏dialog */
        }
    }
}
