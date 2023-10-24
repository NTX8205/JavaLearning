package 委託.資科B班;
/*
5.	寫一個JAVA程式，模擬井字（OX）遊戲。

00 01 02 03 04
10 11 12 13 14 
20 21 22 23 24
30 31 32 33 34
40 41 42 43 44

00 xx 02 xx 04
xx xx xx xx xx
20 xx 22 xx 24
xx xx xx xx xx
40 xx 42 xx 44

0 1 2
*/

import java.util.*;

public class game {

    public static void main(String[] args) {
        System.out.println("模擬井字遊戲(第一個人以「 O 」為記號，第二個人以「 X 」為記號)");
        String[][] gameboard = create_board();
        Scanner input = new Scanner(System.in);
        int row, column;
        String row_column;
        boolean exit = true;
        while (exit) {
            String[] O_X = { "O", "X" };
            for (int i = 1; i <= 2; i++) {
                System.out.printf("請第%d個人輸入列座標(0~2)及行座標(0~2)，以空白隔開:", i);
                row_column = input.nextLine();
                String[] sp = row_column.split(" ");
                row = Integer.parseInt(sp[0]);
                column = Integer.parseInt(sp[1]);
                if (row == 1) {
                    if (column == 1) {
                        gameboard[row + 1][column + 1] = O_X[i - 1];
                    } else if (column == 2) {
                        gameboard[row + 1][column + 2] = O_X[i - 1];
                    } else {
                        gameboard[row + 1][column] = O_X[i - 1];
                    }

                } else if (row == 2) {
                    if (column == 1) {
                        gameboard[row + 2][column + 1] = O_X[i - 1];
                    } else if (column == 2) {
                        gameboard[row + 2][column + 2] = O_X[i - 1];
                    } else {
                        gameboard[row + 2][column] = O_X[i - 1];
                    }
                } else {
                    if (column == 1) {
                        gameboard[row][column + 1] = O_X[i - 1];
                    } else if (column == 2) {
                        gameboard[row][column + 2] = O_X[i - 1];
                    } else {
                        gameboard[row][column] = O_X[i - 1];
                    }
                }
                showboard(gameboard);
                int player = checkgame(gameboard);
                if (player == 1) {
                    System.out.println("第" + i + "個人贏了!");
                    exit = false;
                    break;
                } else if (player == 2) {
                    System.out.println("平局");
                    exit = false;
                    break;
                }

            }
        }
        input.close();
    }

    // 建立版面
    public static String[][] create_board() {
        String[][] gameboard = new String[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i != 0) {
                    if (i % 2 == 0) {
                        if (j % 2 != 0) {
                            gameboard[i][j] = "|";
                        } else {
                            gameboard[i][j] = " ";
                        }
                    } else {
                        gameboard[i][j] = "-";
                    }
                } else {
                    if (j % 2 != 0) {
                        gameboard[i][j] = "|";
                    } else {
                        gameboard[i][j] = " ";
                    }
                }
            }
        }
        return gameboard;
    }

    public static void showboard(String[][] board) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(board[i][j]);
            }
            System.out.println();
        }
    }

    public static int checkgame(String[][] board) {
        int count = 0;

        if (board[0][0].equals("O") && board[0][2].equals("O") && board[0][4].equals("O")) {
            return 1;
        } else if (board[0][0].equals("X") && board[0][2].equals("X") && board[0][4].equals("X")) {
            return 1;
        }

        else if (board[2][0].equals("O") && board[2][2].equals("O") && board[2][4].equals("O")) {
            return 1;
        } else if (board[2][0].equals("X") && board[2][2].equals("X") && board[2][4].equals("X")) {
            return 1;
        }

        else if (board[4][0].equals("O") && board[4][2].equals("O") && board[4][4].equals("O")) {
            return 1;
        } else if (board[4][0].equals("X") && board[4][2].equals("X") && board[4][4].equals("X")) {
            return 1;
        }

        else if (board[0][0].equals("O") && board[2][0].equals("O") && board[4][0].equals("O")) {
            return 1;
        } else if (board[0][0].equals("X") && board[2][0].equals("X") && board[4][0].equals("X")) {
            return 1;
        }

        else if (board[0][2].equals("O") && board[2][2].equals("O") && board[4][2].equals("O")) {
            return 1;
        } else if (board[0][2].equals("X") && board[2][2].equals("X") && board[4][2].equals("X")) {
            return 1;
        }

        else if (board[0][4].equals("O") && board[2][4].equals("O") && board[4][4].equals("O")) {
            return 1;
        } else if (board[0][4].equals("X") && board[2][4].equals("X") && board[4][4].equals("X")) {
            return 1;
        }

        else if (board[0][0].equals("O") && board[2][2].equals("O") && board[4][4].equals("O")) {
            return 1;
        } else if (board[0][0].equals("X") && board[2][2].equals("X") && board[4][4].equals("X")) {
            return 1;
        }

        else if (board[0][4].equals("O") && board[2][2].equals("O") && board[4][0].equals("O")) {
            return 1;
        } else if (board[0][4].equals("X") && board[2][2].equals("X") && board[4][0].equals("X")) {
            return 1;
        } else {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (board[i][j].equals("O") || board[i][j].equals("X")) {
                        count++;
                    }
                }
                if (count == 9) {
                    return 2;
                }
            }
            return 0;
        }
    }
}
