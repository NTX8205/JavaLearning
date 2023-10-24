package 資料結構.作業.回家作業.W1;

/**
 * 題目:Q5: 計算3個正整數的最大公因數&最小公倍數
 * 
 * 
 * 
 * 日期:2022.03.16
 */

import java.util.*;

public class W1_Q5N {

	public static void main(String[] args) {

		System.out.println("計算三個正整數的最大公因數&最小公倍數");

		Scanner sc = new Scanner(System.in);

		System.out.print("輸入3數:");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		sc.close();

		int i = 2;
		int gcd = 1;
		int lcm = 1;
		int a = x;
		int b = y;
		int c = z;
		while (x != 1 || y != 1 || z != 1) {
			if (x % i == 0 && y % i == 0 && z % i == 0) {
				gcd *= i;
				lcm *= i;
				x /= i;
				y /= i;
				z /= i;
			} else if (x % i == 0 && y % i == 0) {
				lcm *= i;
				x /= i;
				y /= i;
			} else if (y % i == 0 && z % i == 0) {
				lcm *= i;
				y /= i;
				z /= i;
			} else if (x % i == 0 && z % i == 0) {
				lcm *= i;
				x /= i;
				z /= i;
			} else if (x % i == 0) {
				lcm *= i;
				x /= i;
			} else if (y % i == 0) {
				lcm *= i;
				y /= i;
			} else if (z % i == 0) {
				lcm *= i;
				z /= i;
			} else {
				i++;
			}
		}
		System.out.println(a + "與" + b + "與" + c + "的最大公因數為" + gcd);
		System.out.println(a + "與" + b + "與" + c + "的最小公倍數為" + lcm);

	}
}
