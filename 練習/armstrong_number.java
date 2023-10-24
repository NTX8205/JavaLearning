package 練習;

import java.util.*;
public class armstrong_number {
    public static void main(String[] args) {

        String[] numbers = new String[8];

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < numbers.length; i++) {// 輸入數字
            numbers[i] = sc.next();
        }
        for (int i = 0; i < numbers.length; i++) {// 檢查是阿姆斯壯數
            if (check(numbers[i])) {
                System.out.println("是阿姆斯壯數");
            } else {
                System.out.println("不是阿姆斯壯數");
            }
        }
        sc.close();
    }

    public static boolean check(String s) {
        int check = 0;
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int singlenumber = Integer.parseInt(String.valueOf(c));
            check += Math.pow(singlenumber, 3);
        }
        int num = Integer.parseInt(s);
        if (num == check) {
            return true;
        } else {
            return false;
        }
    }
}
