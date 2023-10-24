package 演算法.unit3;

import java.util.Scanner;

/*
 * 最短路徑演算法：
給定有向權重圖，將具權重之相鄰矩陣寫出，再找出任意二個頂點間的最短路徑
 */
public class ex3_4 {
    public static void main(String[] args) {
        int a[][] = new int[100][100];
        int i, j, k;
        Scanner in = new Scanner(System.in);
        for (i = 0; i <= 3; i++)
            for (j = 0; j <= 3; j++)
                a[i][j] = in.nextInt();
        System.out.println("The Shortest path for matrix:");
        showmatrix(a);
        for (k = 0; k <= 3; k++) {
            for (i = 0; i <= 3; i++) {
                for (j = 0; j <= 3; j++) {
                    a[i][j] = Math.min(a[i][j], a[i][k] + a[k][j]);
                }
            }
            System.out.println("D"+(k+1));
            showmatrix(a);
        }
        System.out.println("is: ");
        showmatrix(a);

    }
    
    public static void showmatrix(int a[][]) {
        int i, j;
        for (i = 0; i <= 3; i++) {
            for (j = 0; j <= 3; j++)
                System.out.print(" " + a[i][j]);
            System.out.println();
        }
    }
}
