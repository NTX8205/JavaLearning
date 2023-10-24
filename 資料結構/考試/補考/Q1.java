package 資料結構.考試.補考;

/**
 * 題目:乘法表 (使用三種不同迴圈)
 * 
 * 
 * 
 * 日期:2022.04.15
 */

public class Q1 {
    public static void main(String[] args) {
        System.out.println("乘法表 (使用三種不同迴圈)");
        forLoop();
        whileLoop();
        doWhile();

    }

    public static void forLoop() {
        System.out.println("\n使用forLoop方法\n");
        for (int i = 1; i <= 17; i += 2) {
            for (int j = 1; j <= 17; j += 2) {
                System.out.printf("%2d*%-2d=%3d ", i, j, i * j);
            }
            System.out.println();
        }
    }

    public static void whileLoop() {
        System.out.println("\n使用whileLoop方法\n");
        int i = 1;
        while (i <= 17) {
            int j = 1;
            while (j <= 17) {
                System.out.printf("%2d*%-2d=%3d ", i, j, i * j);
                j += 2;
            }
            System.out.println();
            i += 2;
        }
    }

    public static void doWhile() {
        System.out.println("\n使用do_while方法\n");
        int i = 1;

        do {
            int j = 1;

            do {
                System.out.printf("%2d*%-2d=%3d ", i, j, i * j);
                j += 2;
            } while (j <= 17);

            System.out.println();
            i += 2;
        } while (i <= 17);
    }
}