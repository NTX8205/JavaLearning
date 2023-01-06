package 介面.unit1;
/* AWT 的事件類別很多，依照課本及平時應用，常用的有ActionEvent，ItemEvent，
TextEvent，KeyEvent(鍵盤為主)，MouseEvent，WindowEvent等。
首先介紹最常見的:ActionEvent(最常用於button)，利用Frame建立視窗，
加入button事件處理程序，按button結束程式
練習：按了button之後會先print “button exit”, 然後再結束*/


import java.awt.*;
import java.awt.event.*;
public class hw3 {
    static Frame frame = new Frame("示範視窗事件處理程序!!!");
    static Label label = new Label("button事件基本");
    static Button button = new Button("close");
    static Button button1 = new Button("Print exit");

    public static void main(String[] args) {
        frame.setLocation(100, 100);
        frame.setSize(500, 130);
        frame.setLayout(null);
        button.setLocation(20, 30);
        button.setSize(80, 80);
        frame.add(button);
        /* 1.登記listener 為ActLis類別(按了Button會去執行的物件程式) */
        button.addActionListener(new ActLis());
        label.setLocation(200, 30);
        label.setSize(170, 50);
        frame.add(label);
        frame.setVisible(true);

        button1.setLocation(100, 30);
        button1.setSize(80, 80);
        frame.add(button1);

        button1.addActionListener(new ActLis());
    }

    /* 2.設計 ActLis類別，實作ActionListener(實作按了button會執行的處理程式) */
    static class ActLis implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Button btn = (Button) e.getSource();
            if (btn == button){
                
                System.exit(0);
            }
            else if(btn == button1){
                label.setText("exit");
            }
        }
    }

}
