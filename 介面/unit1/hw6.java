package 介面.unit1;

//(本part examples參考主要參考書ch11及ch26, 27)
//單元一hw6: button事件處理及系統時間
/*輸入秒數，按下"向上讀秒"按鈕後，label會出現0->1->2...->秒，
練習：1.時間改成有小數點, 2.改成(倒數讀秒)...5.0->4.0->...->0.0*/
import java.awt.*;
import java.awt.event.*;

public class hw6 {
    static Frame frm = new Frame("btn event & system time");
    static Label label = new Label(" ");
    static Button btnup = new Button("向上讀秒"), btnclose = new Button("關閉");
    static TextField txt = new TextField();
    static ActionLis act = new ActionLis();

    public static void main(String[] args) {
        Font font = new Font("細明體", Font.BOLD, 20);
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER);
        frm.setLayout(flow);
        frm.setSize(500, 300);
        frm.add(txt);
        frm.add(label);
        frm.add(btnup);
        frm.add(btnclose);
        frm.setVisible(true);
        label.setSize(200, 100);
        label.setBackground(Color.yellow);
        label.setFont(font);
        btnup.setFont(font);
        btnclose.setFont(font);
        btnclose.addActionListener(act);
        btnup.addActionListener(act);
    }

    static class ActionLis implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Button btn = (Button) e.getSource();
            long now_new, now_start;
            int interval = 0;
            if (btn == btnup) {
                interval = Integer.parseInt(txt.getText());
                now_start = System.currentTimeMillis();
                now_new = System.currentTimeMillis();
                while ((now_new - now_start) < (interval * 1000)) {
                    now_new = System.currentTimeMillis();
                    String str = Long.toString((now_new - now_start) / 1000);
                    label.setText(str);
                }
            }
            if (btn == btnclose)
                System.exit(0);
        }
    }
}