package 介面.unit2;

//Unit 2 hw5
/*練習對話方塊(dialog)相關類別)主要 參考書ch28
1. dialog 也是window的一種，因此使用方式和frame類似
2. dialog 必須設定擁有者
3. dialog 設定是否為modal(執行完成才回到擁有者視窗)
練習：將dialog內容改為一個button,按了button回到原來視窗
*/
import java.awt.*;
import java.awt.event.*;

public class hw5 {
    static Frame frm = new Frame("軟體設計與開發課程示範Menu"); /* 設定frame內的物件 */
    static MenuBar menubar = new MenuBar();
    static Menu menu_1 = new Menu("檔案"), menu_3 = new Menu("關閉");
    static MenuItem menuitem11 = new MenuItem("留言"), menuitem12 = new MenuItem("存檔"), menuitem31 = new MenuItem("離開系統");
    static TextArea textarea = new TextArea();
    static Dialog dialog = new Dialog(frm); /* dialog之擁有者為frm, 設定dialog內的物件 */
    static TextField txf = new TextField(20);
    static Label label = new Label("Please Input Name:");
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
        frm.setMenuBar(menubar);
        frm.setVisible(true);
        frm.add(textarea);
        menuitem11.addActionListener(act);
        menuitem12.addActionListener(act);
        menuitem31.addActionListener(act);
        /* 設定dailog 內物件,尚未設定顯示 */
        dialog.setSize(200, 150);
        dialog.setLayout(flow);
        dialog.add(label);
        dialog.add(txf);
        txf.addActionListener(new ActLis1());
    }

    static class ActLis implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            MenuItem item = (MenuItem) e.getSource();
            if (item == menuitem11) {
                textarea.append("選擇留言\n");
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