package 介面.unit1;

/*單元一:hw11
依照類別加以排列，有些類別會自動調整。(參考書chapter 26)
可用的類別有：null, borderlayout, flowlayout, gridlayout, 等等
本範例示範grid(格子排列)
1.grid是依照物件加入之順序，設定格子的行列數(本範例是3*5, 間隔2)
2.分為二個panels, textfield放一個panel，其他buttons放一個panel
(請學會使用panel，可以使畫面變美觀)
練習
1.改變行列數目為5*3, 間隔5*/
import java.awt.*;

public class hw11 {
    static Frame frm = new Frame("小型計算機");
    static Panel panel1 = new Panel(), panel2 = new Panel();
    static TextField txf1 = new TextField(15);
    static Button btn0 = new Button(" 0 "), btn1 = new Button(" 1 "), btn2 = new Button(" 2 "),
            btn3 = new Button(" 3 "), btn4 = new Button(" 4 "), btn5 = new Button(" 5 "),
            btn6 = new Button(" 6 "), btn7 = new Button(" 7 "), btn8 = new Button(" 8 "),
            btn9 = new Button(" 9 "), btna = new Button(" + "), btnmi = new Button(" - "),
            btnmu = new Button(" * "), btnd = new Button(" / "), btne = new Button(" = ");

    public static void main(String[] args) {
        frm.setLayout(null);
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER, 5, 10);
        GridLayout grid = new GridLayout(3, 5, 2, 2);
        panel1.setLayout(flow);
        panel2.setLayout(grid);
        panel1.setBackground(Color.yellow);
        panel2.setBackground(Color.blue);
        frm.setSize(300, 350);
        panel1.setLocation(80, 50);
        panel1.setSize(150, 50);
        panel2.setLocation(80, 100);
        panel2.setSize(150, 250);
        panel1.add(txf1);
        panel2.add(btn0);
        panel2.add(btn1);
        panel2.add(btn2);
        panel2.add(btn3);
        panel2.add(btn4);
        panel2.add(btn5);
        panel2.add(btn6);
        panel2.add(btn7);
        panel2.add(btn8);
        panel2.add(btn9);
        panel2.add(btna);
        panel2.add(btnmi);
        panel2.add(btnmu);
        panel2.add(btnd);
        panel2.add(btne);
        frm.add(panel1);
        frm.add(panel2);
        frm.setVisible(true);
    }
}
