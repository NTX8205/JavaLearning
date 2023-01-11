import java.awt.*;
import java.awt.event.*;

public class finalExam extends Frame implements ActionListener, MouseListener {
    static public finalExam frame = new finalExam();
    static Button btn1 = new Button("reset");
    static Button btn2 = new Button("exit");
    static Label label1 = new Label("贏:   0");
    static Label label2 = new Label("平手:   0");
    static Label label3 = new Label("輸:   0");
    static int[][] game = new int[3][3];
    static int win = 0;
    static int lose = 0;
    static int tie = 0;
    static int x1, y1;

    public static void main(String[] args) {
        frame.setTitle("Game");
        frame.setSize(500, 500);
        frame.setLocation(700, 250);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.addMouseListener(frame);
        btn1.setLocation(180, 420);
        btn1.setSize(50, 50);
        btn1.addActionListener(frame);
        frame.add(btn1);
        btn2.setLocation(240, 420);
        btn2.setSize(50, 50);
        btn2.addActionListener(frame);
        frame.add(btn2);
        label1.setBackground(Color.green);
        label1.setLocation(100, 50);
        label1.setSize(100, 20);
        frame.add(label1);
        label2.setBackground(Color.yellow);
        label2.setSize(100, 20);
        frame.add(label2);
        label2.setLocation(200, 50);
        label3.setBackground(Color.pink);
        label3.setSize(100, 20);
        label3.setLocation(300, 50);
        frame.add(label3);
    }

    // board 100-400 300*300
    public void paint(Graphics g) {
        g.drawLine(100, 100, 100, 400);
        g.drawLine(100, 100, 400, 100);
        g.drawLine(400, 100, 400, 400);
        g.drawLine(100, 400, 400, 400);
        g.drawLine(200, 100, 200, 400);
        g.drawLine(300, 100, 300, 400);
        g.drawLine(100, 200, 400, 200);
        g.drawLine(100, 300, 400, 300);
    }

    public void mousePressed(MouseEvent e) {
        x1 = e.getX();
        y1 = e.getY();
    }

    public void mouseReleased(MouseEvent e) {
        Graphics g = getGraphics();
        g.setColor(Color.BLUE);
        // 123
        if (x1 > 100 && x1 < 200 && y1 > 100 && y1 < 200) {
            if (!checkNumber(game, 0, 0)) {
                g.drawOval(110, 110, 80, 80);
                game[0][0] = 1;
                checkGame();
                computer();
            }
        } else if (x1 > 200 && x1 < 300 && y1 > 100 && y1 < 200) {
            if (!checkNumber(game, 0, 1)) {
                g.drawOval(210, 110, 80, 80);
                game[0][1] = 1;
                checkGame();
                computer();
            }
        } else if (x1 > 300 && x1 < 400 && y1 > 100 && y1 < 200) {
            if (!checkNumber(game, 0, 2)) {
                g.drawOval(310, 110, 80, 80);
                game[0][2] = 1;
                checkGame();
                computer();
            }
        }
        // 456
        else if (x1 > 100 && x1 < 200 && y1 > 200 && y1 < 300) {
            if (!checkNumber(game, 1, 0)) {
                g.drawOval(110, 210, 80, 80);
                game[1][0] = 1;
                checkGame();
                computer();
            }
        } else if (x1 > 200 && x1 < 300 && y1 > 200 && y1 < 300) {
            if (!checkNumber(game, 1, 1)) {
                g.drawOval(210, 210, 80, 80);
                game[1][1] = 1;
                checkGame();
                computer();
            }
        } else if (x1 > 300 && x1 < 400 && y1 > 200 && y1 < 300) {
            if (!checkNumber(game, 1, 2)) {
                g.drawOval(310, 210, 80, 80);
                game[1][2] = 1;
                checkGame();
                computer();
            }
        }
        // 789
        else if (x1 > 100 && x1 < 200 && y1 > 300 && y1 < 400) {
            if (!checkNumber(game, 2, 0)) {
                g.drawOval(110, 310, 80, 80);
                game[2][0] = 1;
                checkGame();
                computer();
            }
        } else if (x1 > 200 && x1 < 300 && y1 > 300 && y1 < 400) {
            if (!checkNumber(game, 2, 1)) {
                g.drawOval(210, 310, 80, 80);
                game[2][1] = 1;
                checkGame();
                computer();
            }
        } else if (x1 > 300 && x1 < 400 && y1 > 300 && y1 < 400) {
            if (!checkNumber(game, 2, 2)) {
                g.drawOval(310, 310, 80, 80);
                game[2][2] = 1;
                checkGame();
                computer();
            }
        }
        checkGame();
    }

    public void mouseClicked(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
    }

    public void checkGame() {
        // ---
        // ...
        // ...
        if (game[0][0] + game[0][1] + game[0][2] == 3) {
            win(110, 150, 390, 150);
        }
        if (game[0][0] + game[0][1] + game[0][2] == -3) {
            lose(110, 150, 390, 150);
        }
        // ...
        // ---
        // ...
        if (game[1][0] + game[1][1] + game[1][2] == 3) {
            win(110, 250, 390, 250);
        }
        if (game[1][0] + game[1][1] + game[1][2] == -3) {
            lose(110, 250, 390, 250);
        }
        // ...
        // ...
        // ---
        if (game[2][0] + game[2][1] + game[2][2] == 3) {
            win(110, 350, 390, 350);
        }
        if (game[2][0] + game[2][1] + game[2][2] == -3) {
            lose(110, 350, 390, 350);
        }
        // |..
        // |..
        // |..
        if (game[0][0] + game[1][0] + game[2][0] == 3) {
            win(150, 110, 150, 390);
        }
        if (game[0][0] + game[1][0] + game[2][0] == -3) {
            lose(150, 110, 150, 390);
        }
        // .|.
        // .|.
        // .|.
        if (game[0][1] + game[1][1] + game[2][1] == 3) {
            win(250, 110, 250, 390);
        }
        if (game[0][1] + game[1][1] + game[2][1] == -3) {
            lose(250, 110, 250, 390);
        }
        // ..|
        // ..|
        // ..|
        if (game[0][2] + game[1][2] + game[2][2] == 3) {
            win(350, 110, 350, 390);
        }
        if (game[0][2] + game[1][2] + game[2][2] == -3) {
            lose(350, 110, 350, 390);
        }
        // |..
        // .|.
        // ..|
        if (game[0][0] + game[1][1] + game[2][2] == 3) {
            win(120, 120, 380, 380);
        }
        if (game[0][0] + game[1][1] + game[2][2] == -3) {
            lose(120, 120, 380, 380);
        }
        // ..|
        // .|.
        // |..
        if (game[0][2] + game[1][1] + game[2][0] == 3) {
            win(380, 120, 120, 380);
        }
        if (game[0][2] + game[1][1] + game[2][0] == -3) {
            lose(380, 120, 120, 380);
        }
        // ...
        // ...
        // ...
        if (!notFullBoard(game)) {
            tie();
        }
    }

    public void win(int x1, int y1, int x2, int y2) {
        Graphics g = getGraphics();
        g.setColor(Color.green);
        g.drawLine(x1, y1, x2, y2);
        win++;
        label1.setText("贏:   " + win);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clearBoard();
    }

    public void lose(int x1, int y1, int x2, int y2) {
        Graphics g = getGraphics();
        g.setColor(Color.pink);
        g.drawLine(x1, y1, x2, y2);
        lose++;
        label3.setText("輸:   " + lose);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clearBoard();
    }

    public void tie() {
        tie++;
        label2.setText("平手:   " + tie);
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clearBoard();
    }

    public void actionPerformed(ActionEvent e) {
        Button btn = (Button) e.getSource();
        if (btn == btn1) {
            clearBoard();
            win = 0;
            lose = 0;
            tie = 0;
            label1.setText("贏:   0");
            label2.setText("平手:   0");
            label3.setText("輸:   0");
        }
        if (btn == btn2) {
            System.exit(0);
        }
    }

    public void clearBoard() {
        Graphics g = getGraphics();
        g.setColor(Color.white);
        g.fillRect(0, 0, 500, 500);
        g.setColor(Color.black);
        paint(g);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                game[i][j] = 0;
            }
        }
    }

    public int[] computerChooseNumber() {
        int randomRow = (int) (Math.random() * 3);
        int randomCol = (int) (Math.random() * 3);
        while (true) {
            if (checkNumber(game, randomRow, randomCol)) {
                randomRow = (int) (Math.random() * 3);
                randomCol = (int) (Math.random() * 3);
            } else {
                break;
            }
        }
        int[] ary = { randomRow, randomCol };
        if (!notFullBoard(game)) {
            ary[0] = 3;
            ary[1] = 3;
        }
        return ary;
    }

    public boolean checkNumber(int num[][], int n, int m) {
        if (notFullBoard(num)) {
            if (num[n][m] != 0) {
                return true;
            }
        }
        return false;
    }

    public boolean notFullBoard(int num[][]) {
        int number = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (num[i][j] != 0) {
                    number++;
                }
            }
        }
        if (number == 9) {
            return false;
        }
        return true;
    }

    public void computer() {
        if (notFullBoard(game)) {
            int[] number = computerChooseNumber();
            int r = number[0];
            int c = number[1];
            if (r == 0 && c == 0) {
                drawCross(120, 120, 180, 180);
                game[0][0] = -1;
            } else if (r == 0 && c == 1) {
                drawCross(220, 120, 280, 180);
                game[0][1] = -1;
            } else if (r == 0 && c == 2) {
                drawCross(320, 120, 380, 180);
                game[0][2] = -1;
            } else if (r == 1 && c == 0) {
                drawCross(120, 220, 180, 280);
                game[1][0] = -1;
            } else if (r == 1 && c == 1) {
                drawCross(220, 220, 280, 280);
                game[1][1] = -1;
            } else if (r == 1 && c == 2) {
                drawCross(320, 220, 380, 280);
                game[1][2] = -1;
            } else if (r == 2 && c == 0) {
                drawCross(120, 320, 180, 380);
                game[2][0] = -1;
            } else if (r == 2 && c == 1) {
                drawCross(220, 320, 280, 380);
                game[2][1] = -1;
            } else if (r == 2 && c == 2) {
                drawCross(320, 320, 380, 380);
                game[2][2] = -1;
            }
        }
    }

    public void drawCross(int x1, int y1, int x2, int y2) {
        Graphics g = getGraphics();
        g.setColor(Color.red);
        g.drawLine(x1, y1, x2, y2);
        g.drawLine(x2, y1, x1, y2);
    }

}
