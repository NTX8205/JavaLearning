package 介面.unit1;

/*單元一:hw9
利用 LayoutManager(版面配置管理員)將元件(label, button, text,等)
依照類別加以排列，有些類別會自動調整。(參考 chapter 26 第 10 節)
可用的類別有：null, borderlayout, flowlayout, gridlayout, 等等
本範例示範 null，不會自動排列，程式設計師必須自行算好位置，
設計簡單計算器畫面(按鈕有 0, 1, .., 9, =, 離開
注意：本範例尚未加入事件處理程序
練習：
1.加入+, -, *, / button*/
import java.awt.*;

public class hw9 {
    static Frame frm = new Frame("小型計算機");
    static Label label = new Label(" ");
    static Button btn0 = new Button(" 0 "), btn1 = new Button(" 1 "), btn2 = new Button(" 2 "),
            btn3 = new Button(" 3 "), btn4 = new Button(" 4 "), btn5 = new Button(" 5 "),
            btn6 = new Button(" 6 "), btn7 = new Button(" 7 "), btn8 = new Button(" 8 "),
            btn9 = new Button(" 9 "), btne = new Button(" = ");
    static Button btnclose = new Button("離開");

    public static void main(String[] args) {
        frm.setLayout(null);
        frm.setSize(230, 380);
        frm.setLocation(30, 30);
        btn0.setSize(30, 50);
        btn1.setSize(30, 50);
        btn2.setSize(30, 50);
        btn3.setSize(30, 50);
        btn4.setSize(30, 50);
        btn5.setSize(30, 50);
        btn6.setSize(30, 50);
        btn7.setSize(30, 50);
        btn8.setSize(30, 50);
        btn9.setSize(30, 50);
        btne.setSize(80, 50);
        btnclose.setSize(180, 50);
        label.setSize(180, 30);
        label.setLocation(20, 50);
        label.setBackground(Color.pink);
        btn7.setLocation(20, 100);
        btn8.setLocation(70, 100);
        btn9.setLocation(120, 100);
        btn4.setLocation(20, 150);
        btn5.setLocation(70, 150);
        btn6.setLocation(120, 150);
        btn1.setLocation(20, 200);
        btn2.setLocation(70, 200);
        btn3.setLocation(120, 200);
        btn0.setLocation(20, 250);
        btne.setLocation(70, 250);
        btnclose.setLocation(20, 300);
        frm.add(label);
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
        frm.add(btne);
        frm.add(btnclose);
        frm.setVisible(true);
    }
}
