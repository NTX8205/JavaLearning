package 介面.unit2;

//Unit 2 hw3
/*練習choice，label，用較基本的方法。主要參考書ch28
choice被select時使用itemEvent，利用addItemListener()註冊;implement並呼叫
itemStateChanged(ItemEvent e)
練習：
1. 在team1增加一個item， 資院
2. 增加team2，含大一，大二，大三，大四*/
import java.awt.*;
import java.awt.event.*;

public class hw3 {
    static Frame frm = new Frame("Choice 事件處理");
    static Label label1 = new Label("choose a team");
    static Choice choice1 = new Choice();
    static String team1[] = { "離開", "資管", "資工", "資傳" };

    public static void main(String[] args) {
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER, 5, 10);
        frm.setLayout(flow);
        frm.setSize(200, 200);
        frm.add(label1);
        frm.add(choice1);
        for (int i = 0; i < team1.length; i++)
            choice1.add(team1[i]);
        frm.setVisible(true);
        choice1.addItemListener(new ItemLis1());
    }

    static class ItemLis1 implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            int selected = choice1.getSelectedIndex();
            if (selected == 0)
                System.exit(0);
            else
                label1.setText(team1[selected]);
        }
    }
}