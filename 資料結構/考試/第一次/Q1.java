package 資料結構.考試.第一次;

// Q1：九九乘法表(使用三種不同迴圈)

// 
// 
// 

public class Q1 {
    public static void main(String[] args) {
        System.out.println("九九乘法表 (使用三種不同迴圈)\n");
        forLoop();
        do_while();
        whileLoop();
    }

    public static void showTop() {
        System.out.print("    ");
        for (int i = 0; i < 9; i++) {
            System.out.print((i + 1) + "----- ");
        }
        System.out.println();
    }

    public static void forLoop() {
        System.out.println("使用for迴圈\n");
        showTop();

        for (int i = 1; i <= 9; i++) {

            System.out.print(i + " | ");

            for (int j = 1; j <= 9; j++) {
                System.out.printf("%d*%d=%2d ", i, j, i * j);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void do_while() {
        System.out.println("使用do_while迴圈\n");
        showTop();
        int n = 1;
        do {
            int m = 1;
            System.out.print(n + " | ");
            do {
                System.out.printf("%d*%d=%2d ", n, m, n * m);
                m++;
            } while (m <= 9);

            System.out.println();
            n++;

        } while (n <= 9);
        System.out.println();
    }

    public static void whileLoop() {
        System.out.println("使用while迴圈\n");
        showTop();
        int k = 1;
        while (k <= 9) {
            System.out.print(k + " | ");
            int l = 1;

            while (l <= 9) {
                System.out.printf("%d*%d=%2d ", k, l, k * l);
                l++;
            }
            System.out.println();
            k++;
        }
        System.out.println();
    }
}