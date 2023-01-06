package 委託.資科B班111期末;

/*
 * 題目 3: 2A2B 題目 (20%)
 * 說明: 輸入 4 個相異數值和內部設定的 4 位數, 進行比對， 若輸入的數值與位置皆相同則表示 A, 
 * 如果輸入數值數值相同但位置不同，則表示 B。比如內定 4 位數數值為 1234，若猜測值為 5678 則
 * 為 0A0B，若猜測值為 1243 則為 2A2B，若猜測值為 4321 則為 0A4B，若猜測值為 1234 則為
 * 4A0B(完全猜中,程式結束)，請附上你總共猜了幾次，如果不想玩了可以按 -1 離開 (exit)
 * ***請利用陣列來實作, 不可以用字串****
 */

import java.util.*;
import java.security.*;

public class Q3 {
    
    public static void main(String[] args) {
        System.out.println("2A2B 遊戲");
        int count = 0; //計算猜題次數
        int[] answer = new int[4];
        answer = generateAnswer(answer);//產生答案
        // System.out.println(Arrays.toString(answer));//顯示答案(檢測用)
        Scanner sc = new Scanner(System.in);

        while(true) {
            System.out.print("使用者請輸入一四位數(每位數字皆不重複，輸入 '-1' 為結束程式) :");
            int num = sc.nextInt();
            if (num == -1) {
                System.out.println("程式中止 ! 猜題總次數為:"+count);
                sc.close();
                break;
            }
            else {
                int[] input = new int[4];//將輸入的數字轉成陣列的形式
                for (int i = 0; i < input.length; i++) {
                    int n = num % 10;
                    input[3-i] = n;
                    num /= 10;
                }
                // System.out.println(Arrays.toString(input));// 顯示輸入陣列(檢測用)
                count ++;
                checkComplete(input, answer, count);
            }
            
        }
        
    }

    //產生隨機解答
    public static int[] generateAnswer(int[] number) {
        SecureRandom random = new SecureRandom();
        for (int i = 0; i < number.length; i++) {
            int rand = random.nextInt(10);
            number[i] = rand;
        }
        //確保每位數字不重複，重複就會重新產生新的四位數。
        if(checkRepeat(number)){
            generateAnswer(number);
        }
        return number;
    }

    //檢查答案裡的數字
    public static boolean checkRepeat(int[] number) {
        for (int i = 0; i < number.length; i++) {
            for (int j = 0; j < number.length; j++) {
                if (i != j) {
                    if (number[i] == number[j]) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //檢查輸入的數字是否與答案一樣
    public static void checkComplete(int[] input, int[] answer, int count) {
        int count_A = 0;
        int count_B = 0;

        // 輸入的數字在答案裡，且位數相同
        for (int i = 0; i < 4; i++) {
            if (input[i] == answer[i]) {
                count_A++;
            }
        }

        // 輸輸入的數字在答案裡，但位數不同
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i != j) {
                    if (input[i] == answer[j]) {
                        count_B++;
                    }
                }
            }
        }

        if (count_A == 4) {
            System.out.println("恭喜猜對，共猜了" + count + "次");
            System.exit(0);
        } else {
            System.out.print("第" + count + "次猜題結果 :");
            System.out.println(count_A + "A" + count_B + "B");
        }
    }
}
