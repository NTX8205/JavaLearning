package 介面.learning_test;
import java.awt.*;
import java.awt.event.*;
public class frametest{
    static Frame frame=new Frame("demo unit 1-4");
    static Button button_scissors=new Button("scissors");
    static Button button_rock=new Button("rock");
    static Button button_paper=new Button("paper");
    static Label label=new Label("please select");
    static ActionLis act=new ActionLis();
    public static void main(String[] args) {
        frame.setLocation(100,100);
        frame.setSize(320,200);
        frame.setLayout(null);
        button_scissors.setLocation(50,50);
        button_scissors.setSize(50,30);
        frame.add(button_scissors);
        button_scissors.addActionListener(act);
        button_rock.setLocation(110,50);
        button_rock.setSize(50,30);
        frame.add(button_rock);
        button_rock.addActionListener(act);
        button_paper.setLocation(170,50);
        button_paper.setSize(50,30);
        frame.add(button_paper);
        button_paper.addActionListener(act);
        label.setLocation(60,100);
        label.setSize(100,50);
        frame.add(label);
        frame.setVisible(true);
    }
    static class ActionLis implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            Button btn=(Button) e.getSource();
            if (btn==button_scissors)System.exit(0);
            else if (btn==button_rock)
                label.setText("石頭");
            else label.setText("button two");
        }
    }

}