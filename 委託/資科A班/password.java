package 委託.資科A班;

/*
 * 由隨機亂數產生一個介於2048~9999，四位數中的阿拉伯數字不可重複。然後讓使用者去猜，接著回應使用者猜的狀況。回應規則如下:
 * (1) 若所猜的四位數中的數字及位置，與正確的四位數中之數字及位置相同，則為A。
 * (2) 若所猜的四位數中的數字，與正確的四位數中之數字相同但位置不同，則為B。
 * (3) 最多讓使用者猜20次。猜對了顯示「恭喜您BINGO了」;否則20次後顯示「正確答案」。
 * 例如: 隨機亂數產生四位數為1234，若猜1243，則回應2A2B;若猜6512，則回應0A2B。
 * 演算法:
 * 步驟1:由亂數自動產生四位數(阿拉伯數字不可重複)。
 * 步驟2:使用者去猜，接著回應使用者猜的狀況。
 */

import java.util.*;
import java.security.*;

public class password {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int answer = randomnumber();

        int endgame = 0;//檢查遊戲是否20回合內結束

        System.out.println("猜數字遊戲(幾A幾B):被猜的四位數(2048~9999，數字不可重複)由亂數自動產生");

        //System.out.println("答案:"+answer);// 檢測用

        //顯示恭喜訊息
        String hint = "";

        for (int count = 1; count <= 20; count++) {

            System.out.println("輸入第" + count + "次要猜的四位數:");
            int number = input.nextInt();

            hint = checkanswer(number, answer);

            System.out.println(hint);

            if (hint.equals("恭喜您BINGO了")) {
                endgame = 1;
                break;
            }

        }
        if (endgame != 1) {
            System.out.print("正確答案:");
            System.out.print(answer);

        }
        input.close();
    }

    //重組
    public static int[] combination(int n) {
        int[] num = new int[4];
        String change = Integer.toString(n);
        for (int i = 0; i < 4; i++) {
            char c = change.charAt(i);
            int n1 = Character.getNumericValue(c);
            num[i] = n1;
        }
        return num;
    }

    //檢查輸入與答案相似程度
    public static String checkanswer(int input, int answer) {

        int countA = 0;
        int countB = 0;

        int[] in = combination(input);
        int[] out = combination(answer);

        for (int i = 0; i < 4; i++) {
            if (in[i] == out[i]) {
                countA++;
            } else {
                for (int j = 0; j < 4; j++) {
                    if (in[i] == out[j]) {
                        countB++;
                    }
                }
            }
        }
        if (countA == 4) {
            return "恭喜您BINGO了";
        } else {
            return countA + "A" + countB + "B";
        }

    }

    //產生亂數
    public static int randomnumber() {

        SecureRandom random = new SecureRandom();

        int answer = random.nextInt(7951) + 2048;

        int[] ans = new int[4];
        String checkans = Integer.toString(answer);

        //產生4碼不重複之數(ex:1234,1564...)
        while (true) {
            int[] num = new int[4];
            for (int i = 0; i < 4; i++) {
                char c = checkans.charAt(i);
                int n = Character.getNumericValue(c);
                num[i] = n;

            }
            if (num[0] != num[1] && num[0] != num[2] && num[0] != num[3] && num[1] != num[2] && num[1] != num[3]
                    && num[2] != num[3]) {
                for (int j = 0; j < num.length; j++) {
                    ans[j] = num[j];
                }
                break;
            } else {
                answer = random.nextInt(7951) + 2048;
                checkans = Integer.toString(answer);
            }
        }
        return answer;
    }

}
