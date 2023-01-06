package 介面.unit1;

/*利用Frame建立視窗，並加入數個buttons
按不同buttons，進入同一個ActionLis，但執行相異的程式片段
練習：增加一個button_three*/
import java.awt.*;
import java.awt.event.*;
public class hw4 {
    static Frame frame = new Frame("demo unit 1-4");
    static Button button_close = new Button("close");
    static Button button_one = new Button("one");
    static Button button_two = new Button("two");
    static Label label = new Label("please select");
    static ActionLis act = new ActionLis();

    public static void main(String[] args) {
        frame.setLocation(100, 100);
        frame.setSize(320, 200);
        frame.setLayout(null);
        button_close.setLocation(50, 50);
        button_close.setSize(50, 30);
        frame.add(button_close);
        button_close.addActionListener(act);
        button_one.setLocation(110, 50);
        button_one.setSize(50, 30);
        frame.add(button_one);
        button_one.addActionListener(act);
        button_two.setLocation(170, 50);
        button_two.setSize(50, 30);
        frame.add(button_two);
        button_two.addActionListener(act);
        label.setLocation(60, 100);
        label.setSize(100, 50);
        frame.add(label);
        frame.setVisible(true);
    }

    static class ActionLis implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Button btn = (Button) e.getSource();
            if (btn == button_close)
                System.exit(0);
            else if (btn == button_one)
                label.setText("button one");
            else
                label.setText("button two");
        }
    }
}
