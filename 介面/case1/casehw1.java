package 介面.case1;


/*case study 1 hw1 (單元二)*/
import java.awt.*;
import java.awt.event.*;

public class casehw1 {
    static Frame frm = new Frame("Action Event");
    static Label label1 = new Label(" ");
    static List lst1 = new List();
    static String team1[] = { "exit", "單", "雙" };
    static Label label2 = new Label(" ");
    static List lst2 = new List();
    static String team2[] = { "1", "3", "5", "7", "9" };
    static Label label3 = new Label(" ");
    static List lst3 = new List();
    static String team3[] = { "0", "2", "4", "6", "8" };
    static Boolean even = false;

    static class ItemLis implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            int selected = lst1.getSelectedIndex();
            if (selected == 0)
                System.exit(0);
            else if (selected == 1) {
                even = false;
                lst2.setVisible(true);
                lst3.setVisible(false);
            } else {
                even = true;
                lst3.setVisible(true);
                lst2.setVisible(false);
            }
            label1.setText(team1[selected]);
        }
    }

    static class ItemLis1 implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            List lst = (List) e.getSource();
            int selected = lst.getSelectedIndex();
            if (even == true)
                label2.setText(team3[selected]);
            else
                label2.setText(team2[selected]);
        }
    }

    public static void main(String[] args) {
        frm.setLayout(null);
        frm.setSize(600, 200);
        label1.setLocation(50, 50);
        lst1.setLocation(100, 50);
        label1.setSize(50, 50);
        lst1.setSize(100, 50);
        frm.add(label1);
        frm.add(lst1);
        for (int i = 0; i < team1.length; i++)
            lst1.add(team1[i]);
        lst1.addItemListener(new ItemLis());
        label2.setLocation(250, 50);
        lst2.setLocation(300, 50);
        label2.setSize(50, 50);
        lst2.setSize(100, 50);
        frm.add(label2);
        frm.add(lst2);
        for (int i = 0; i < team2.length; i++)
            lst2.add(team2[i]);
        lst2.addItemListener(new ItemLis1());
        label3.setLocation(250, 50);
        lst3.setLocation(300, 50);
        label3.setSize(50, 50);
        lst3.setSize(100, 50);
        frm.add(label3);
        frm.add(lst3);
        for (int i = 0; i < team3.length; i++)
            lst3.add(team3[i]);
        lst3.addItemListener(new ItemLis1());
        frm.setVisible(true);
    }
}