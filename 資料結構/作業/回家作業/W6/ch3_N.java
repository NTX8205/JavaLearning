package 資料結構.作業.回家作業.W6;

/**
 * 題目:遞迴函式實做
 * 
 * 
 * 
 * 日期:2022.03.21
 */
import java.util.Scanner;

public class ch3_N {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("遞迴函式實做");
        System.out.println("輸入選項");

        while (true) {
            System.out.println("(1) n階乘");
            System.out.println("(2) 費式數列");
            System.out.println("(3) 兩個正整數之最大公因數");
            System.out.println("(4) 河內塔");
            System.out.println("(0) 結束程式");
            int choice = sc.nextInt();

            if (choice == 0) {
                System.out.println("程式已結束 !");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.println("以選擇 n階乘");
                    System.out.println("輸入一整數 :");

                    int number = sc.nextInt();
                    long startTime = System.currentTimeMillis(); // 獲取開始時間
                    long result = fact(number);
                    long endTime = System.currentTimeMillis(); // 獲取結束時間

                    System.out.printf("n階乘 程式執行時間=%.3fs\n", (double) (endTime - startTime) / 1000);

                    System.out.println("1*2*...*" + number + "=" + result + "\n");
                    break;
                case 2:
                    System.out.println("以選擇 費式數列");
                    System.out.println("輸入一整數 :");
                    number = sc.nextInt();
                    startTime = System.currentTimeMillis(); // 獲取開始時間
                    result = Fib(number);
                    endTime = System.currentTimeMillis(); // 獲取結束時間

                    System.out.printf("費式數列 程式執行時間=%.3fs\n", (double) (endTime - startTime) / 1000);
                    System.out.println("計算結果為 :" + result + "\n");
                    break;
                case 3:
                    System.out.println("以選擇 兩個正整數之最大公因數");
                    System.out.println("輸入兩整數(以空白隔開) :");

                    int x = sc.nextInt();
                    int y = sc.nextInt();
                    startTime = System.currentTimeMillis(); // 獲取開始時間
                    result = GCD(x, y);
                    endTime = System.currentTimeMillis(); // 獲取結束時間

                    System.out.printf("兩個正整數之最大公因數 程式執行時間=%.3fs\n", (double) (endTime - startTime) / 1000);
                    System.out.println("最大公因數為 :" + result + "\n");
                    break;
                case 4:
                    System.out.println("以選擇 河內塔");
                    System.out.print("輸入盤子個數 :");
                    number = sc.nextInt();
                    startTime = System.currentTimeMillis(); // 獲取開始時間
                    Towers(number, 'A', 'B', 'C');
                    endTime = System.currentTimeMillis(); // 獲取結束時間
                    System.out.printf("河內塔 程式執行時間=%.3fs\n", (double) (endTime - startTime) / 1000);

                    System.out.println();
                    break;
                default:
                    System.out.println("選項輸入錯誤，請重新輸入");
                    break;
            }
            sc.close();
        }
    }

    static long fact(long n) // 遞迴函數名稱
    {
        if (n <= 1) // 遞迴函數的終值
            return 1;
        else {
            return n * fact(n - 1); // 函數自己又可以呼叫自己
        }
    }

    static int Fib(int n) // 函數名稱
    {

        if (n <= 2) // 遞迴函數的終值
            return 1;
        else {
            return Fib(n - 1) + Fib(n - 2); // 函數自己又可以呼叫自己
        }

    }

    static int GCD(int a, int b) // 函數名稱
    {
        int c;
        c = a % b; // 取餘數
        if (c == 0)
            return b;
        else
            return GCD(b, c); // 函數自己又可以呼叫自己
    }

    public static void Towers(int n, char from, char through, char to) {
        if (n > 0) {
            Towers(n - 1, from, to, through);
            System.out.println("將盤子 " + n + "從柱子 " + from + "移到柱子 " + to);
            Towers(n - 1, through, from, to);
        }
    }
}
