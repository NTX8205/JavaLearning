package 練習.移除重複數字;

import java.util.Arrays;
import java.util.Scanner;
public class removeNum1 {
    public static int removeDuplicateElements(int arr[], int n) {
        if (n == 0 || n == 1) {
            return n;
        }
        int[] temp = new int[n];

        int j = 0;

        for (int i = 0; i < n - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                temp[j++] = arr[i];
            }
        }
        temp[j++] = arr[n - 1];

        for (int i = 0; i < j; i++) {
            arr[i] = temp[i];
        }
        return j;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {

            int n = sc.nextInt();
            if (n >= 10 && n <= 100) {
                array[i] = n;
            } else {
                array[i] = -1;
            }

        }
        sc.close();
        Arrays.sort(array);// sorting array
        int length = array.length;
        length = removeDuplicateElements(array, length);
        for (int i = 0; i < length; i++) {
            if (array[i] != -1) {
                System.out.print(array[i] + " ");
            }
        }

    }
}
