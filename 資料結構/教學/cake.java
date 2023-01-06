package 資料結構.教學;

import java.util.Scanner;

public class cake {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int blank = 0;
        int cake_has_eaten = 0;
        /*
         * 宣告迷宮大小
         */
        int r = sc.nextInt();
        int c = sc.nextInt();

        char[][] map = new char[r][c];

        /*
         * 輸入迷宮地圖版面
         */
        String[] s = new String[r];
        for (int i = 0; i < r; i++) {
            s[i] = sc.next();
        }

        sc.close();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                map[i][j] = s[i].charAt(j);
            }
        }

        /*
         * 檢測橫切與直切是否會切到草莓
         */

        // 橫切
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (map[i][j] == 'S') {
                } else {
                    blank++;
                }
            }
            if (blank == c) {
                for (int j = 0; j < c; j++) {
                    map[i][j] = 'v';
                }
            }
            blank = 0;
        }

        // 直切
        for (int i = 0; i < c; i++) {
            for (int j = 0; j < r; j++) {
                if (map[j][i] == 'S') {
                } else {
                    blank++;
                }
            }
            if (blank == r) {
                for (int j = 0; j < r; j++) {
                    map[j][i] = 'v';
                }
            }
            blank = 0;
        }

        // 計算蛋糕有幾塊被吃
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if (map[i][j] == 'v') {
                    cake_has_eaten++;
                }
            }
        }

        System.out.println("the cake has been eaten :" + cake_has_eaten);

        // 檢測地圖版面是否正確
        System.out.println("result");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
    }
}
