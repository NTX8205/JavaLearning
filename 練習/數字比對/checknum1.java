package 練習.數字比對;

/*
 * 數字比對
 * 輸入一個正整數n，再輸入n個整數，由小到大輸出有重複的整數值及其重複次數。
 */

import java.util.*;
public class checknum1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> array = new ArrayList<Integer>();
        TreeSet<Integer> ints = new TreeSet<Integer>();
        int num;
        int[] count = new int[10000];
        int[] countnum = new int[10000];
        for (int i = 0; i < count.length; i++) {
            count[i] = i;
        }
        for (int i = 0; i < n; i++) {
            num = sc.nextInt();
            if (num < 10000) {
                array.add(num);
            }

        }
        sc.close();
        Collections.sort(array);
        for (int i = 0; i < array.size(); i++) {
            ints.add(array.get(i));
            for (int j = 0; j < count.length; j++) {
                if (array.get(i) == count[j]) {
                    countnum[j]++;
                }
            }
        }

        Object[] arr = ints.toArray();

        for (int i = 0; i < arr.length; i++) {
            if (countnum[(int) arr[i]] > 1) {
                System.out.println(arr[i] + " " + countnum[(int) arr[i]]);
            }
        }
    }
}
