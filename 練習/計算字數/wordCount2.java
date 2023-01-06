package 練習.計算字數;

/*
 * 計算大小寫英文字數的數值
 * 將英文字母依序編號A = 1, B = 2, ……, Z = 26，
 * 將某個單字的各別字母轉換為前述的數字後相加便得到一個分數。
 */
import java.util.*;
public class wordCount2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int total = 0;
        boolean check = true;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isAlphabetic(c)) {
                if (c <= 'z' && c >= 'a') {
                    total += (int) c - 'a' + 1;
                } else if (c >= 'A' && c <= 'Z') {
                    total += (int) c - 'A' + 1;
                }
            } else {
                check = false;
                System.out.print("Fail");
                break;
            }
        }
        if (check) {
            System.out.print(total);
        }
        sc.close();
    }
}
