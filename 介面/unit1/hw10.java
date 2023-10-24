package 介面.unit1;

//單元一:hw10:/*利用LayoutManager(版面配置管理員)將元件(label, button, text,等)
/*依照類別加以排列，有些類別會自動調整。
(參考chapter 26 第10節)可用的類別有：null,borderlayout,flowlayout,gridlayout,等等 
本範例示範flow。flow是依照物件加入之順序排列，可以是靠左(LEFT)靠右(RIGHT)，置中(CENTER)，LEADING，TRAILING 
注意：本範例尚未加入事件處理程序 練習1.改變排列方式為：靠左(LEFT)(或CENTER,等等)2. 將物件之間左右行距設為25,上下行距設為25*/

import java.awt.*;

public class hw10 {
    static Frame frm = new Frame("小型計算機");
    static Label label = new Label("範例");
    static TextField txf1 = new TextField(15);
    static Button btn0 = new Button(" 0 "), btn1 = new Button(" 1 "), btn2 = new Button(" 2 "),
            btn3 = new Button(" 3"), btn4 = new Button(" 4 "), btn5 = new Button(" 5 "), btn6 = new Button(" 6 "),
            btn7 = new Button(" 7"), btn8 = new Button(" 8 "), btn9 = new Button(" 9 "), btna = new Button(" + "),
            btnmi = new Button(" -"), btnmu = new Button(" * "), btnd = new Button(" / "), btne = new Button(" = ");
    static Button btnclose = new Button("離開");

    public static void main(String[] args) {
        FlowLayout layout2 = new FlowLayout(FlowLayout.RIGHT, 5, 10);
        frm.setLayout(layout2);
        frm.setSize(300, 300);
        frm.add(label);
        frm.add(txf1);
        frm.add(btn0);
        frm.add(btn1);
        frm.add(btn2);
        frm.add(btn3);
        frm.add(btn4);
        frm.add(btn5);
        frm.add(btn6);
        frm.add(btn7);
        frm.add(btn8);
        frm.add(btn9);
        frm.add(btna);
        frm.add(btnmi);
        frm.add(btnmu);
        frm.add(btnd);
        frm.add(btne);
        frm.add(btnclose);
        frm.setVisible(true);
    }
}
