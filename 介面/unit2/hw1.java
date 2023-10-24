package 介面.unit2;

//UNIT 2，Hw1
//練習Checkbox(單或複選)及CheckboxGroup(單選)，主要參考書的ch26, 27
/*練習chkbox，label，用較基本的方法。 checkbox被select時使用itemEvent，利用addItemListener()註冊;
implement並呼叫itemStateChanged(ItemEvent e) (非array implement)
練習：
1.增加一個checkbox 資院
2.增加一組checkgroup(年級)，包含大一，大二，大三，大四等選項
3.將系所改成複選(自行練習)(將CheckboxGroup移除)*/
import java.awt.*;
import java.awt.event.*;

public class hw1 {
    static Frame frm = new Frame("練習checkbox");
    static Label label1 = new Label("選擇系所");
    static Checkbox check11 = new Checkbox("資管"), check12 = new Checkbox("資工"),
            check13 = new Checkbox("資傳");
    static Button btn0 = new Button("離開");

    public static void main(String[] args) {
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER, 5, 10);
        frm.setLayout(flow);
        frm.setSize(350, 200);
        frm.add(label1);
        frm.add(check11);
        frm.add(check12);
        frm.add(check13);
        CheckboxGroup checkgroup1 = new CheckboxGroup(); /* 僅能多選一 */
        check11.setCheckboxGroup(checkgroup1);
        check12.setCheckboxGroup(checkgroup1);
        check13.setCheckboxGroup(checkgroup1);
        frm.add(btn0);
        frm.setVisible(true);
        ItemLis item = new ItemLis();
        check11.addItemListener(item);
        check12.addItemListener(item);
        check13.addItemListener(item);
        btn0.addActionListener(new ActLis());
    }

    static class ItemLis implements ItemListener {
        public void itemStateChanged(ItemEvent e) {
            Checkbox chk = (Checkbox) e.getSource();
            label1.setText(chk.getLabel());
        }
    }

    static class ActLis implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}
