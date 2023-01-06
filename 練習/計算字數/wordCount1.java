package 練習.計算字數;

//Catch Exceptions 計算整數和英文字數
import java.util.*;

public class wordCount1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] ary = new String[sc.nextInt()];
        int countint = 0, countString = 0;
        for (int i = 0; i < ary.length; i++) {
            ary[i] = sc.next();
            try {
                Integer.parseInt(ary[i]);
                countint++;
            } catch (NumberFormatException e) {
                countString++;
            }
        }
        sc.close();
        System.out.println(countint + " integers and " + countString + " strings.");
    }
}