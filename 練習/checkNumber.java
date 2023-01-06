package 練習;

import java.util.*;
public class checkNumber {
    
    public static void main(String[] args) {
        int[] num = new int[9];
        Object array[] = new String[9];

        int x, y;
        boolean loop = true;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                x = sc.nextInt();
                y = sc.nextInt();
                num[sc.nextInt()] = sc.nextInt();
                System.out.println(x / y);
                checkpostive(sc.nextInt());
                array[0] = 2;
                loop = false;
                sc.close();
            } catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
                System.out.println("超出陣列儲存範圍");

            } catch (ArrayStoreException arrayStoreException) {
                System.out.println("儲存格式錯誤");

            } catch (IllegalArgumentException illegalArgumentException) {
                System.out.println("不是正數");

            } catch (ArithmeticException arithmeticException) {
                System.out.println("計算錯誤");

            }
        } while (loop);
    }

    static void checkpostive(int n) throws IllegalArgumentException {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
    }
}
