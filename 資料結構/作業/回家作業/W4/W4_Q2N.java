package 資料結構.作業.回家作業.W4;

/**
 * 題目:前段和與後段和
 * 
 * 
 * 
 * 日期:2022.03.21
 */
import java.util.*;

public class W4_Q2N {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("前段和與後段和");
        System.out.print("輸入項數:");
        int n = sc.nextInt();
        sc.close();
        int[] num = new int[n];

        System.out.println("輸入" + n + "個數");
        for (int i = 0; i < n; i++) {
            num[i] = sc.nextInt();
        }

        int[] front = new int[n];
        int[] back = new int[n];
        for (int i = 0; i < num.length; i++) {
            if (i == 0) {
                front[i] = num[i] + front[i];
                back[i] = num[(n - 1) - i] + back[i];
            } else {
                front[i] = num[i] + front[i - 1];
                back[i] = num[(n - 1) - i] + back[i - 1];
            }

        }

        Arrays.sort(front);
        Arrays.sort(back);

        int count = 0;
        for (int j = 0; j < num.length; j++) {
            for (int k = 0; k < num.length; k++) {
                if (front[j] == back[k]) {
                    count++;
                    break;
                }
            }
        }
        System.out.println("共有" + count + "組相同的前段和與後段和");
    }
}
