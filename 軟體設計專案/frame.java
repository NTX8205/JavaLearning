import java.awt.*;
import java.awt.event.*;

public class frame {
    static Frame frm = new Frame("賓果");
    static Panel panel1 = new Panel(), panel2 = new Panel(), panel3 = new Panel();
    static TextField txf1 = new TextField(2),
            txf2 = new TextField(2),
            txf3 = new TextField(2),
            txf4 = new TextField(2),
            txf5 = new TextField(2),
            txf6 = new TextField(2),
            txf7 = new TextField(2),
            txf8 = new TextField(2),
            txf9 = new TextField(2);
    static Button btnclose = new Button("關閉"),
            btnstart = new Button("開始遊戲");
    static Action1Lis act = new Action1Lis();
    static Label label = new Label("輸入數字1~9到下列的格子裡");
    static TextArea txtarea1 = new TextArea("", 12, 30);

    public static void main(String[] args) {
        frm.setLayout(null);
        FlowLayout flow = new FlowLayout(FlowLayout.CENTER, 5, 10);
        GridLayout grid = new GridLayout(3, 3, 1, 1);
        frm.setSize(700, 700);
        frm.setLocation(450, 250);
        label.setLocation(280, 50); /* 設定label的原點位置，相對位置? */
        label.setSize(200, 50);
        frm.add(label);
        panel1.setLayout(grid);
        panel1.setBackground(Color.blue);
        panel1.setLocation(300, 100);
        panel1.setSize(100, 100);
        panel1.add(txf1);
        panel1.add(txf2);
        panel1.add(txf3);
        panel1.add(txf4);
        panel1.add(txf5);
        panel1.add(txf6);
        panel1.add(txf7);
        panel1.add(txf8);
        panel1.add(txf9);
        panel2.setLayout(flow);
        panel2.setLocation(300, 200);
        panel2.setSize(100, 80);
        panel2.setBackground(Color.yellow);
        panel2.add(btnstart);
        panel2.add(btnclose);
        btnstart.addActionListener(act);
        btnclose.addActionListener(act);
        panel3.setLayout(flow);
        panel3.setSize(500, 300);
        panel3.setLocation(100, 300);
        panel3.add(txtarea1);
        frm.add(panel1);
        frm.add(panel2);
        frm.add(panel3);
        frm.setVisible(true);
    }
    
    static class Action1Lis implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            Button btn = (Button) e.getSource();
            if (btn == btnclose)
                System.exit(0);
            if(btn == btnstart){
                buildBingo b = new buildBingo();
                b.bingobox[0][0] = Integer.parseInt(txf1.getText()) ;
                b.bingobox[0][1] = Integer.parseInt(txf2.getText());
                b.bingobox[0][2] = Integer.parseInt(txf3.getText());
                b.bingobox[1][0] = Integer.parseInt(txf4.getText());
                b.bingobox[1][1] = Integer.parseInt(txf5.getText());
                b.bingobox[1][2] = Integer.parseInt(txf6.getText());
                b.bingobox[2][0] = Integer.parseInt(txf7.getText());
                b.bingobox[2][1] = Integer.parseInt(txf8.getText());
                b.bingobox[2][2] = Integer.parseInt(txf9.getText());
                txtarea1.setText("");
                txtarea1.append("使用者輸入完後Bingo格的結果:\n");
                txtarea1.append(b.showBingobox()+"\n");
                b.pickNum();
                txtarea1.append( b.showPn() + "\n");
                b.checkBingobox();
                txtarea1.append(b.showCheckBingobox() + "\n");
                txtarea1.append(b.checkBingo()+ "\n");
            }
        }
    }

}

class buildBingo {

    int bingobox[][] = new int[3][3];
    int computerNum[] = new int[5];

    public String showBingobox() {
        String str = "";
        for (int i = 0; i < bingobox.length; i++) {
            for (int j = 0; j < bingobox[0].length; j++) {
                if (bingobox[i][j] >= 1 && bingobox[i][j] <= 9) {
                    str+=bingobox[i][j] + " ";
                } else {
                    str += bingobox[i][j] + " ";
                }
            }
            System.out.println();
            str += "\n";
        }
        return str;
    }
    public void pickNum() {// 電腦篩選號碼
        int index = 0;
        while (true) {
            computerNum[index] = (int) (Math.random() * 9) + 1;
            if (index == 0) {
                index++;
            } else if (index != 0) {
                if (checkPn(index)) {
                    index++;
                } else {
                    continue;
                }
            }
            if (index == 5) {
                break;
            }
        }
    }
    public boolean checkPn(int index) {// 找重複
        for (int i = 0; i < index; i++) {
            if (computerNum[index] == computerNum[i]) {
                return false;
            }
        }
        return true;
    }
    public void checkBingobox() {// 電腦選的數比對使用者輸入的數是否相同
        for (int i = 0; i < computerNum.length; i++) {
            for (int j = 0; j < bingobox.length; j++) {
                for (int j2 = 0; j2 < bingobox.length; j2++) {
                    if(computerNum[i] == bingobox[j][j2]){
                        bingobox[j][j2] = 0;
                    }
                }
            }
        }
    }
    public String showPn() {
        String str = "";
        str += "電腦隨機抽數: ";
        for (int i : computerNum) {
            str+=i+ " ";
        }
        str+="\n";
        return str;
    }
    public String showCheckBingobox() {
        String str = "";
        str += "與電腦隨機抽的數比對後: \n";
        for (int i = 0; i < bingobox.length; i++) {
            for (int j = 0; j < bingobox[0].length; j++) {
                if (bingobox[i][j] >= 0 && bingobox[i][j] <= 9) {
                    str += bingobox[i][j] + " ";
                } else {
                    str += bingobox[i][j] + " ";
                }
            }
            str +="\n";
        }
        return str;
    }

    public String checkBingo() {// 判斷連線
        String str = "";
        boolean loss = true;
        boolean loss2 = true;
        int count = 0;
        for (int i = 0; i < bingobox.length; i++) {// 判斷各行
            if (bingobox[0][i] == 0 && bingobox[1][i] == 0 && bingobox[2][i] == 0) {
                loss = false;
                count++;
            }
        }
        for (int i = 0; i < bingobox.length; i++) {// 判斷各列
            if (bingobox[i][0] == 0 && bingobox[i][1] == 0 && bingobox[i][2] == 0) {
                loss2 = false;
                count++;
            }
        }
        if (bingobox[0][0] == 0 && bingobox[1][1] == 0 && bingobox[2][2] == 0) {// 判斷左斜線
            loss = false;
            loss2 = false;
            count++;
        }
        if (bingobox[0][2] == 0 && bingobox[1][1] == 0 && bingobox[2][0] == 0) {// 判斷右斜線
            loss = false;
            loss2 = false;
            count++;
        }
        if (loss && loss2) {
            str += "not connect any line\n";
        } else {
            str += "Bingo and you connect " + count + " line\n";
        }
        return str;
    }
}