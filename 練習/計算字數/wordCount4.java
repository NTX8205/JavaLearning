package 練習.計算字數;
//計算數值中數字最多者有多少個
import java.util.*;
public class wordCount4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        int[] count = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };
        int max = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            for (int k = 0; k < num.length; k++) {
                if (c == num[k]) {
                    count[k]++;
                }
            }
        }
        for (int j = 0; j < count.length; j++) {
            if (count[j] >= max) {
                max = count[j];
            }
        }
        System.out.println(max);
        sc.close();
    }
}
