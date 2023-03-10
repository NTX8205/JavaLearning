package 演算法.unit2;

/*
 * 2.1 二元搜尋法(divide and conquer 方式解)
     利用 iterative 方式，請參考第一章 1.2.1 (algorithm 1.5) Binary search(iterative) :
     利用遞迴法(recursive)，演算法：完成程式練習 algorithm 2.1：Binary Search(recursion)
 */
/* (algorithm 2.1 (binary search)) Binary 
Search(recursion) : 輸入 8 個從小排到大的整
數,利用 binary search 輸入一個整數,輸出此整
數在此數列位置（不存在是 0),一共測三次 */
import java.util.Scanner;

public class ex2_1 {
    public static int x;
    public static int data[] = new int[9];

    public static void main(String[] args) {
        int i, j, answer;
        Scanner in = new Scanner(System.in);
        System.out.println(" Please input 8 integers:");
        for (i = 1; i <= 8; i++)
            data[i] = in.nextInt();
        System.out.println("The data are:");
        for (i = 1; i <= 8; i++)
            System.out.print(" " + data[i]);
        System.out.println();
        for (j = 1; j <= 3; j++) {
            System.out.println("Input the " + j + "th target:");
            x = in.nextInt();
            answer = location(1, 8);
            System.out.println("Target " + x + " is the " + answer + "th");
        }
    }

    /* 以上主程式不可變動 */
    static int location(int low, int high) {
        int mid;
        mid = (low + high) / 2;
        System.out.println("L=" + low + ",M=" + mid + ",H=" + high);
        if (low > high)
            return 0;
        else {
            if (x == data[mid])
                return mid;
            else if (x < data[mid])
                return location(low, mid - 1);
            else
                return location(mid + 1, high);
        }

    }
}
