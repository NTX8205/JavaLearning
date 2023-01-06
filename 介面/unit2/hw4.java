package 介面.unit2;

//Unit 2 hw4
/*練習menu相關類別(包含MenuBar, Menu, MenuItem)，MenuItem的item被select時使用ActionEvent，
利用addActionListener()註冊; implement並呼叫actionPerformed(ActionEvent e)
練習：
1.檔案menu增加一個menuitem:讀檔
2.增加一個menu:計算，此menu下增加二個menuitems:排序，平均*/
import java.awt.*;
import java.awt.event.*;

public class hw4 {
    static Frame frm = new Frame("示範Menu");
    static MenuBar menubar = new MenuBar();
    static Menu menu_1 = new Menu("檔案"), menu_2 = new Menu("異動"), menu_3 = new Menu("關閉");
    static MenuItem menuitem11 = new MenuItem("留言");
    static MenuItem menuitem12 = new MenuItem("存檔");
    static MenuItem menuitem13 = new MenuItem("列印");
    static MenuItem menuitem21 = new MenuItem("插入");
    static MenuItem menuitem22 = new MenuItem("刪除");
    static MenuItem menuitem31 = new MenuItem("離開系統");
    static TextArea textarea = new TextArea();

    public static void main(String[] args) {
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER, 50, 20);
        frm.setLayout(flow);
        frm.setSize(500, 300);
        menubar.add(menu_1);
        menubar.add(menu_2);
        menubar.add(menu_3);
        menu_1.add(menuitem11);
        menu_1.add(menuitem12);
        menu_1.add(menuitem13);
        menu_2.add(menuitem21);
        menu_2.add(menuitem22);
        menu_3.add(menuitem31);
        frm.setMenuBar(menubar);
        frm.setVisible(true);
        frm.add(textarea);
        ActLis act = new ActLis();
        menuitem11.addActionListener(act);
        menuitem12.addActionListener(act);
        menuitem13.addActionListener(act);
        menuitem21.addActionListener(act);
        menuitem22.addActionListener(act);
        menuitem31.addActionListener(act);
    }

    static class ActLis implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            MenuItem item = (MenuItem) e.getSource();
            if (item == menuitem11) {
                textarea.append("選擇留言\n");
            } else if (item == menuitem12) {
                textarea.append("選擇存檔\n");
            } else if (item == menuitem13) {
                textarea.append("選擇列印\n");
            } else if (item == menuitem21) {
                textarea.append("選擇插入\n");
            } else if (item == menuitem22) {
                textarea.append("選擇刪除\n");
            } else if (item == menuitem31) {
                System.exit(0);
            }
        }
    }
}