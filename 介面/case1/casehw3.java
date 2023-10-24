package 介面.case1;

/* case study 1, hw3 */
/*猜數字
系統先產生1到100間的任意整數，顯示在console(使用者先不要看答案)
使用者在text field猜數字，
系統會給使用者提示新的答案範圍，或顯示猜到了，或提醒使用者合理的數字範圍*/
import java.awt.*;
import java.awt.event.*;

public class casehw3 {
    static Frame frm = new Frame("猜數字");
    static Label label1 = new Label("你猜的號碼： ");
    static Label label2 = new Label(" ");
    static Button btnclose = new Button("關閉");
    static String str = "";
    static TextField txf1 = new TextField(5);
    static int answer = 0, low = 1, high = 100;

    public static void main(String[] args) {
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
        frm.setLayout(flow);
        frm.setSize(200, 200);
        frm.add(label1);
        frm.add(txf1);
        frm.add(label2);
        label1.setBackground(Color.blue);
        label2.setBackground(Color.yellow);
        frm.add(btnclose);
        frm.setVisible(true);
        txf1.addActionListener(new ActLis2());
        btnclose.addActionListener(new Action1Lis());
        answer = (int) (Math.random() * 100) + 1;
        System.out.println(answer);
        str = Integer.toString(answer);
        low = 1;
        high = 100;
    }

    static class ActLis2 implements ActionListener {
        public void actionPerformed(ActionEvent e){
            int number=Integer.parseInt(txf1.getText());
            label1.setText("你猜的號碼："+txf1.getText());
            txf1.setText("");
            if (number==answer) label1.setText("恭喜猜中："+txf1.getText());
            else if ((number>high)||(number<low)) label2.setText("重猜："+Integer.toString(low)+"與"+Integer.toString(high));
            else if (number>answer) {
                high=number-1;
                label2.setText("介於："+Integer.toString(low)+"與"+Integer.toString(high));
            }
            else {
                low=number+1;
                label2.setText("介於："+Integer.toString(low)+"與"+Integer.toString(high));
            }
        }
    }

    static class Action1Lis implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.exit(0);
        }
    }
}
