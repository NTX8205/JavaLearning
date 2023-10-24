package 練習;
/*
 * 產品清單 計算國內外價格
 * 
 * 項目/價格 |  國內  |  國外  |
 * ---------------------------
 *    1   |  1000  |  1200  |
 *    2   |  2400  |  2500  |
 *    3   |  15000 |  15000 |
 *    4   |  5000  |  6000  |
 */

import java.util.*;
public class price {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] list = { { 1000, 1200 },
                { 5500, 5800 },
                { 2400, 2500 },
                { 15000, 15000 },
                { 5000, 6000 } };

        int n = sc.nextInt();
        int[] ids = new int[n];
        int totalin = 0;
        int totalout = 0;
        for (int i = 0; i < n; i++) {
            int id = sc.nextInt();
            ids[i] = id;
            totalin += list[id - 1][0];
            totalout += list[id - 1][1];
        }
        System.out.print("購買產品的ID為");
        for (int j = 0; j < ids.length; j++) {
            System.out.print(ids[j] + ",");
        }
        System.out.println("購買的產品國內價格加總=" + totalin + ",購買的產品國外價格加總=" + totalout);
        sc.close();
    }
}
