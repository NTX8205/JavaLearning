package 資料結構.作業.範例.排序法;

public class sort {
    

    public static int num = 10000; // 宣告全域形變數
    public static int data[] = new int[num]; // 宣告全域形陣列

    public static void main(String[] args) {
        int choice;

        System.out.printf("隨機產生 %d 個正整數, 數值介於 1 到 %d 進行不同方法的排序!\n", num, 10 * num);
        System.out.printf("(1)使用氣泡排序\n"); // 算出資料交換的次數 (加分)
        System.out.printf("(2)使用選擇排序\n");
        System.out.printf("(3)使用插入排序\n"); // 算出資料交換的次數 (加分)
        System.out.printf("(4)使用快速排序\n");
        System.out.printf("(5)使用上述四種排序方法\n");
        System.out.printf("請輸入你的選項: ");

        // 改成使用者輸入
        choice = 1;

        // 隨機產生 num 個正整數
        randomnum();

        // 根據使用者輸入選項進行排序處理
        if (choice == 1) {
            bubble_sort();
        } else if (choice == 2) {
            selection_sort();
        } else if (choice == 3) {
            insertion_sort();
        } else if (choice == 4) {
            quick_sort();
        } else if (choice == 5) {
            bubble_sort();
            selection_sort();
            insertion_sort();
            quick_sort();
        } else {
            System.out.printf("\n輸入的選項 %d 錯誤!\n", choice);
        }
    }

    public static void randomnum() // 產生10個10-99的亂數值的副程式
    {
        for (int i = 0; i < num; i++) {
            data[i] = (int) (Math.random() * 100000) + 1;
        }

        System.out.printf("\nunsorted: ");
        for (int i = 0; i < num; i++) {
            System.out.printf("%7d ", data[i]);
        }
    }

    public static void selection_sort() {
        // System.out.printf("\nselection_sort() 施工中\n");
        long startTime = System.currentTimeMillis();// 獲取開始時間


        long endTime = System.currentTimeMillis(); // 獲取結束時間
        System.out.printf("\nbubble sort 程式執行時間=%.3fs", (double) (endTime - startTime) / 1000);
    }

    public static void insertion_sort() {
        // System.out.printf("\ninsertion_sort() 施工中\n");
        long startTime = System.currentTimeMillis();// 獲取開始時間



        long endTime = System.currentTimeMillis(); // 獲取結束時間
        System.out.printf("\nbubble sort 程式執行時間=%.3fs", (double) (endTime - startTime) / 1000);
    }

    public static void quick_sort() {
        // System.out.printf("\nquick_sort() 施工中\n");
        long startTime = System.currentTimeMillis();// 獲取開始時間


        
        long endTime = System.currentTimeMillis(); // 獲取結束時間
        System.out.printf("\nbubble sort 程式執行時間=%.3fs", (double) (endTime - startTime) / 1000);
    }

    public static void bubble_sort() // 氣泡排序法進行由小到大排序
    {
        long startTime = System.currentTimeMillis(); // 獲取開始時間

        int i, j, tmp;
        System.out.println("氣泡排序法: ");
        System.out.print("原始資料為:");
        for (i = 0; i < num; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();
        for (i = num-1; i > 0; i--) {
            for (j = 0; j < i; j++) {
                if (data[j] > data[j + 1]) {

                    tmp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = tmp;
                }
            }
            System.out.print("第" + (num - i) + "次排序的結果是: ");
            for (j = 0; j < num; j++) {
                System.out.print(data[j] + " ");
            }
            System.out.println();
        }

        System.out.println("排序後結果為: ");
        for (i = 0; i < num; i++) {
            System.out.print(data[i] + " ");
        }
        System.out.println();

        long endTime = System.currentTimeMillis(); // 獲取結束時間
        System.out.printf("\nbubble sort 程式執行時間=%.3fs", (double) (endTime - startTime) / 1000);
    }
}
