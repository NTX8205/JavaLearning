package 資料結構.作業.範例.ch1;

public class ch1_2b_time {
    static int NUM = 5;

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis(); // 獲取開始時間

        float Average = 0;
        int sum = 0, i;
        int[] Score = new int[] { 60, 70, 80, 85, 90 }; // 宣告「陣列」資料結構

        for (i = 0; i < NUM; i++) // 使用FOR迴圈的演算法
            sum += Score[i];

        Average = (float) (sum / NUM);

        System.out.println("平均成績：" + Average);

        long endTime = System.currentTimeMillis(); // 獲取結束時間

        System.out.println("程式執行時間：" + (double) (endTime - startTime) / 1000 + "s");
    }
}