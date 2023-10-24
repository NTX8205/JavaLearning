package 委託.資科B班111期末;

/*
 * 題目 4: 隨機重新排列(Permutation) (20%)
 * 說明: 將 10 個格子內的數值隨機重新排列 (需附上執行時間 NanoTime)
 * (Hint:可參考課本樂透不重複選號技巧)
 * 原本排列:(Before)
 * 10 20 30 40 50 60 70 80 90 100
 * 隨機排列:(After)
 * 60 20 90 100 50 40 70 10 80 30
 */

import java.util.*;
public class Q4 {
    public static void main(String[] args) {
        long startTime = System.nanoTime(); //起始時間
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
        System.out.println("隨機排列前的陣列 :" + Arrays.toString(array));
        //隨機轉換陣列裡的數字位置
        for (int i = 0; i < array.length; i++) {
            int random = (int) (Math.random() * 10);//選擇要交換的位置
            //目前循序到的數字和指定位置的數字進行交換
            int temp = array[i];
            array[i] = array[random];
            array[random] = temp;
        }
        System.out.println("隨機排列後的陣列 :" + Arrays.toString(array));
        long endTime = System.nanoTime();//結束時間
        double duringTime = (double) (endTime - startTime) / 1000000000; //換算成秒
        System.out.println("此程式執行時間 : "+ duringTime +"秒");
    }
}
