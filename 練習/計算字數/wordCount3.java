package 練習.計算字數;
//計算數值中數字最多者有多少個
import java.util.Arrays;
import java.util.Scanner;

public class wordCount3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();//

        int[] data = new int[10];
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                data[str.charAt(i) - '0']++;
            }
        }
        Arrays.sort(data);
        System.out.println(data[data.length - 1]);
        sc.close();
    }
}
