package 資料結構.作業.範例.ch1;

public class ch1_2b {
    static int NUM = 5;

    public static void main(String[] args) {
        float Average = 0;
        int sum = 0, i;
        int[] Score = new int[] { 60, 70, 80, 85, 90 }; // 宣告「陣列」資料結構
        for (i = 0; i < NUM; i++) // 使用FOR迴圈的演算法
            sum += Score[i];
        Average = (float) (sum / NUM);
        System.out.println("平均成績" + Average);
    }
}
