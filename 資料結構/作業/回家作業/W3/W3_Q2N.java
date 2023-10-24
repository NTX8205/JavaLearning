package 資料結構.作業.回家作業.W3;

/**
 * 題目:計算2個正整數的最大公因數&最小公倍數
 * 
 * 
 * 
 * 日期:2022.03.09
 */

import java.util.*;

public class W3_Q2N {

    public static void main(String[] args) {

        ArrayList<Integer> num_a = new ArrayList<Integer>();
        ArrayList<Integer> num_b = new ArrayList<Integer>();

        System.out.println("計算2個正整數的最大公因數&最小公倍數");
        Scanner sc = new Scanner(System.in);

        System.out.print("輸入兩個整數:");
        int a = sc.nextInt();
        int b = sc.nextInt();

        sc.close();

        String s = a + "與" + b;

        for (int i = 2; a != 1; i++) {
            int count = 0;
            num_a.add(i);
            while (a % i == 0) {
                count++;
                a /= i;
            }
            num_a.add(count);
        }

        for (int i = 2; b != 1; i++) {
            int count = 0;
            num_b.add(i);
            while (b % i == 0) {
                count++;
                b /= i;
            }
            num_b.add(count);
        }

        int gcd = 1;
        int lcm = 1;

        int gcd_size = Math.min(num_a.size(), num_b.size());
        int lcm_size = Math.max(num_a.size(), num_b.size());

        for (int i = 1; i < gcd_size; i += 2) {
            if (num_a.get(i - 1) == num_b.get(i - 1) && num_a.get(i) >= 1 && num_b.get(i) >= 1) {
                gcd *= num_a.get(i - 1);
            }
        }

        if (num_a.size() != lcm_size) {
            num_a.addAll(num_b.subList(gcd_size, num_b.size()));
            for (int i = gcd_size; i < num_a.size(); i += 2) {
                num_a.set(i + 1, 0);
            }

        } else if (num_b.size() != lcm_size) {
            num_b.addAll(num_a.subList(gcd_size, num_a.size()));
            for (int i = gcd_size; i < num_b.size(); i += 2) {
                num_b.set(i + 1, 0);
            }
        }

        for (int i = 1; i < lcm_size; i += 2) {
            if (num_a.get(i - 1) == num_b.get(i - 1) && num_a.get(i) >= 1 || num_b.get(i) >= 1) {
                int counter = Math.max(num_a.get(i), num_b.get(i));

                for (int j = 1; j <= counter; j++) {
                    lcm *= num_a.get(i - 1);
                }

            }

        }

        System.out.println(s + "的最大公因數為" + gcd);
        System.out.println(s + "的最小公倍數為" + lcm);
    }

}
