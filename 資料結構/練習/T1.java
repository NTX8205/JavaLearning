package 資料結構.練習;

public class T1 {
    
    public static void main(String[] args) {
        System.out.println("九九乘法表 (使用三種不同迴圈)\n");
        forLoop();
        do_while();
        whileLoop();
    }

    public static void showTop() {
        System.out.print("     ");
        for (int i = 1; i <= 15; i+=2) {
            if(i<10){
                System.out.printf("%2d------- ", i);
            }
            else{
                System.out.printf("%2d------- ", i);
            }
        }
        System.out.println();
    }

    public static void forLoop() {
        System.out.println("使用for迴圈\n");
        showTop();

        for (int i = 1; i <= 15; i+=2) {

            System.out.printf("%2d | ", i);

            for (int j = 1; j <= 15; j+=2) {
                System.out.printf("%2d*%-2d=%3d ", i, j, i * j);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void do_while() {
        System.out.println("使用do_while迴圈\n");
        showTop();
        int i = 1;
        do {
            int j = 1;
            System.out.printf("%2d | ",i);
            do {
                System.out.printf("%2d*%-2d=%3d ", i, j, i * j);
                j+=2;
            } while (j <= 15);

            System.out.println();
            i+=2;

        } while (i <= 15);
        System.out.println();
    }

    public static void whileLoop() {
        System.out.println("使用while迴圈\n");
        showTop();
        int i = 1;
        while (i <= 15) {
            System.out.printf("%2d | ", i);
            int j = 1;

            while (j <= 15) {
                System.out.printf("%2d*%-2d=%3d ", i, j, i * j);
                j+=2;
            }
            System.out.println();
            i+=2;
        }
        System.out.println();
    }
}
