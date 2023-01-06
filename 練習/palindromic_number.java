package 練習;

/*
 * 計算數字正反相加幾次為迴文數
 * Write a program that inputs an integer N. This integer number N is then added with its reversed number, 
 * when the added result is not palindrome, this means that the digits from left to right and from right to left are not the same, 
 * then you need to repeat the above computation until the sum of the result is a palindrome.
 * For example, let takes an input N is 195: 195 + 591 = 786 + 687 = 1473 + 3741 = 5214 + 4125 = 9339 which is a palindrome. 
 * Therefore, the output are 4 and 9339, where 4 means it adds four times and 9339 is the sum of the result.
 */
import java.util.*;

public class palindromic_number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            palindrome(0, sc.nextInt());
        }
        sc.close();
    }

    public static int palindrome(int count, int n) {
        int r, sum = 0, temp;
        temp = n;
        while (n > 0) {
            r = n % 10;
            sum = (sum * 10) + r;
            n = n / 10;
        }
        if (temp == sum) {
            System.out.print(count + " " + sum + "\n");
            return 0;
        } else {
            return palindrome(count + 1, temp + sum);
        }
    }
}
