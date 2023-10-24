package 演算法.unit1;

import java.util.Scanner;

/**
 * 1.2.1 循序搜尋法與二元搜尋法介紹及效能的比較
循序搜尋法：從陣列的第一個資料，按照順序逐一比對，一直到找到或比完最後一筆(沒找到)為
止。
二元搜尋法：
* (algorithm 1.5) Binary search(iterative) : 輸入 8 個從小排到大的整數,利用 binary search 輸入一個整
數,輸出此整數在此數列位置（不存在是 0),一共測三次 
 */
public class ex3 {
    public static int x;
    public static int data[] = new int[9];

    public static void main(String[] args) {
        int i, j, answer;
        int mid, low, high;
        Scanner in = new Scanner(System.in);
        System.out.println(" Please input 8 integers:");
        for (i = 1; i <= 8; i++)
            data[i] = in.nextInt();
        System.out.println("The data are:");
        for (i = 1; i <= 8; i++)
            System.out.print(" " + data[i]);
        System.out.println();
        for (j = 1; j <= 3; j++) {
            System.out.println(" Please input the " + j + " th target integer:");
            x = in.nextInt();
            low = 1;
            high = 8;
            answer = 0;
            while ((low <= high) && (answer == 0)) {
                mid = (low + high) / 2;
                if (x == data[mid]) {
                    answer = mid;
                    break;
                } else if (x < data[mid])
                    high = mid - 1;
                else
                    low = mid + 1;
            }
            System.out.println("The target " + x + " is in the " + answer + "th place");
        }
    }
}
