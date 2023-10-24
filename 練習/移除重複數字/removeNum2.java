package 練習.移除重複數字;

import java.util.*;
public class removeNum2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        TreeSet<Integer> ints = new TreeSet<Integer>();// 建立一個空的樹子集

        for (int i = 0; i < array.length; i++) {

            int n = sc.nextInt();
            if (n >= 10 && n <= 100) {
                array[i] = n;
            } else {
                array[i] = -1;
            }

        }
        // 將array的資料放進ints
        for (int i = 0; i < array.length; i++) {
            ints.add(array[i]);
        }
        // 列出ints裡的資料
        for (int i = 0; i < ints.size(); i++) {
            if (i != -1) {
                System.out.print(i + " ");
            }

        }
        sc.close();
    }
}
