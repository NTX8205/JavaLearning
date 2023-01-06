package 介面.learning_test;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class test5 extends JFrame implements ActionListener {

	JButton scissors, rock, paper, clear;
	JPanel panel2, panel1;
	JLabel label, labe2,labe3,labe4;
	int lose, win ,tie;

	public static void main(String[] args) {
		test5 frame = new test5();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}

	public test5() {
		setTitle("剪刀石頭布游戲");
		setLocation(250, 250);
		setSize(300, 300);

		panel1 = new JPanel();
		panel1.setBackground(Color.yellow);
		scissors = new JButton("剪刀");
		rock = new JButton("石頭");
		paper = new JButton("布");
		clear = new JButton("清空");
		panel2 = new JPanel();
		panel2.setBackground(Color.green);
		label = new JLabel("選擇剪刀, 石頭, 布開始游戲");
		labe2 = new JLabel("目前平局 : " + tie + "次");
		labe3 = new JLabel("目前贏 : " + win + "次");
		labe4 = new JLabel("目前輸 : " + lose + "次");

		rock.addActionListener(this);
		scissors.addActionListener(this);
		paper.addActionListener(this);
		clear.addActionListener(this);

		panel1.add(scissors);
		panel1.add(rock);
		panel1.add(paper);
		panel1.add(clear);
		panel2.add(label);
		panel2.add(labe2);
		panel2.add(labe3);
		panel2.add(labe4);
		add(panel1, BorderLayout.NORTH);
		add(panel2, BorderLayout.CENTER);

		panel2.setLayout(null);
		label.setBounds(40, 0, 300, 20);
		labe2.setBounds(40, 50, 200, 100);
		labe3.setBounds(40, 70, 200, 100);
		labe4.setBounds(40, 90, 200, 100);

	}

	public void actionPerformed(ActionEvent e) {
		JButton Jbtn = (JButton) e.getSource();

		if (Jbtn == scissors) {
			game(0);
		} else if (Jbtn == rock) {
			game(1);
		} else if (Jbtn == paper) {
			game(2);
		} else if (Jbtn == clear) {
			label.setText("重新開始游戲！");
			lose=0;
			win=0;
			tie=0;
			labe2.setText("目前平局 : " + tie + "次");
			labe3.setText("目前贏 : " + win + "次");
			labe4.setText("目前輸 : " + lose + "次");

		}
	}

	public void game(int choice) {
		int i = (int)(Math.random() * 3);
		String[] name = {"剪刀","石頭", "布"};
		int judge = choice - i;
		if(judge == 0) {
			tie++;
			label.setText("你出"+name[choice] +"，電腦出"+name[i] +"，平局！");
			labe2.setText("目前平局 : " + tie + "次");
		}
		else if(judge == -2 || judge == 1) {
			win++;
			label.setText("你出"+name[choice] +"，電腦出"+name[i] +"，恭喜你贏了！");
			labe3.setText("目前贏 : " + win + "次");
		}			
		else if(judge == -1 || judge == 2) {
			lose++;
			label.setText("你出"+name[choice] +"，電腦出"+name[i] +"，很遺憾你輸了！");
			labe4.setText("目前輸 : " + lose + "次");
		}
	}
}
