package 資料結構.作業.回家作業.W4;

/**
 * 題目:三號出局
 * 
 * 
 * 
 * 日期:2022.03.22
 */

import java.util.*;

public class W4_Q1N {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Integer> num = new ArrayList<Integer>();

        System.out.println("三號出局");
        System.out.print("輸入人數: ");
        int n = sc.nextInt();
        sc.close();

        if (n >= 5) {

            for (int i = 0; i < n; i++) {
                num.add(i + 1);
            }
            int count = 1;
            while (num.size() > 1) {
                for (int i = 0; i < num.size(); i++) {
                    if (count == 3) {
                        num.remove(i);
                        count = 1;
                        i--;
                    } else {
                        count++;
                    }
                    if (i == num.indexOf(n)) {
                        break;
                    }
                }
            }
            System.out.println("最後一位編號:" + num.get(0));
        } else {
            System.out.println("人數少於5人，無法計算");
        }
    }
}
