package 委託.資科B班111期末;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 題目 2: 5 號出局 (20%)
 * 說明: 有 n 個人圍成一圈，順序排號（從 1 號編到 n 號）。從第一個人開始報數（從 1 到 5 報數），
 * 凡報到 5 的人出局退出圈子，問最後留下的是第幾號 ?
 */

public class Q2 {
    public static void main(String[] args) {
        System.out.println("5號出局");
        Scanner sc = new Scanner(System.in);
        System.out.print("輸入總人數 :");
        int n = sc.nextInt();
        int[] people = new int[n]; //總人數號碼
        for (int i = 0; i < people.length; i++) {
            people[i] = i + 1;
        }
        int count = 1; //報數 1~5
        while (true) {
            //剩一人時離開迴圈
            if(n == 1) {
                break;
            }
            //每數到第5個時，將該數去掉(變成0)，並重新報數，遇到號碼0時跳過，直到剩一個人。
            for (int i = 0; i < people.length; i++) {
                if(people[i] == 0) {
                    continue;
                }
                else if (count == 5) {
                    people[i] = 0;
                    count =1;
                    n--; 
                }
                else {
                    count++;
                }
            }
        }
        //將最後留下的號碼利用排序放在最後在印出。
        Arrays.sort(people);
        System.out.println("最後留下來的號碼 :" + people[people.length-1]);
        sc.close();
    }
}
