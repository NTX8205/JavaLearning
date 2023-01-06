import java.util.Scanner;

class buildBingo1 {

    int bingobox[][] = new int[3][3];
    int computerNum[] = new int[5];

    public void inputNum() {// 輸入測資
        Scanner sc = new Scanner(System.in);

        System.out.printf("請使用者輸入資料到(3*3)的Bingo裡(數字1~9): ");
        System.out.println();

        for (int i = 0; i < bingobox.length; i++) {
            System.out.println("-----第" + (i + 1) + "列-----");
            for (int j = 0; j < bingobox[0].length; j++) {
                System.out.printf("第" + (j + 1) + "個數為:");
                bingobox[i][j] = sc.nextInt();
                while (true) {
                    if(checkRepeat(bingobox[i][j], bingobox)){
                        System.out.print("數字已重複，請重新輸入 :");
                        bingobox[i][j] =sc.nextInt();
                    }
                    else {
                        // break;
                    }
                }
            }
        }
    }
    public boolean checkRepeat(int num,int bingobox[][]){
        int count = 0;
        for (int k = 0; k < bingobox.length; k++) {
            for (int l = 0; l < bingobox.length; l++) {
                if (num == bingobox[k][l]) {
                    count++;
                }
            }
        }
        if(count > 1){
            return true;
        }
        else {
            return false;
        }
    }

    public void showBingobox() {
        System.out.println();
        System.out.printf("使用者輸入完後Bingo格的結果:");
        System.out.println();

        for (int i = 0; i < bingobox.length; i++) {
            for (int j = 0; j < bingobox[0].length; j++) {
                if (bingobox[i][j] >= 1 && bingobox[i][j] <= 9) {
                    System.out.printf("%d  ", bingobox[i][j]);
                } else {
                    System.out.printf("%d ", bingobox[i][j]);
                }
            }
            System.out.println();
        }
    }

    public void pickNum() {// 電腦篩選號碼

        int index = 0;

        while (true) {
            computerNum[index] = (int) (Math.random() * 9) + 1;

            if (index == 0) {
                index++;
            } else if (index != 0) {
                if (checkPn(index)) {
                    index++;
                } else {
                    continue;
                }
            }

            if (index == 5) {
                break;
            }
        }
    }

    public boolean checkPn(int index) {// 找重複

        for (int i = 0; i < index; i++) {
            if (computerNum[index] == computerNum[i]) {
                return false;
            }
        }
        return true;
    }

    public void checkBingobox() {// 電腦選的數比對使用者輸入的數是否相同
        for (int i = 0; i < bingobox.length; i++) {
            int x = 0;
            for (int j = 0; j < bingobox[0].length; j++) {
                if (bingobox[i][j] == computerNum[x]) {
                    bingobox[i][j] = 0;
                    x = 0;
                    continue;
                } else {
                    if (x < 4) {
                        j--;
                        x++;
                    }
                }
            }
        }
    }

    public void showPn() {

        System.out.println();
        System.out.printf("電腦隨機抽數: ");
        System.out.println();

        for (int i : computerNum) {
            System.out.printf("%d ", i);
        }

        System.out.println();
    }

    public void showCheckBingobox() {
        System.out.println();
        System.out.println("與電腦隨機抽的數比對後:");

        for (int i = 0; i < bingobox.length; i++) {
            for (int j = 0; j < bingobox[0].length; j++) {
                if (bingobox[i][j] >= 0 && bingobox[i][j] <= 9) {
                    System.out.printf("%d  ", bingobox[i][j]);
                } else {
                    System.out.printf("%d ", bingobox[i][j]);
                }
            }
            System.out.println();
        }
    }

    public void checkBingo() {// 判斷連線

        boolean loss = true;
        boolean loss2 = true;
        int count = 0;

        for (int i = 0; i < bingobox.length; i++) {// 判斷各行
            if (bingobox[0][i] == 0 && bingobox[1][i] == 0 && bingobox[2][i] == 0) {
                loss = false;
                count++;
            }
        }

        for (int i = 0; i < bingobox.length; i++) {// 判斷各列
            if (bingobox[i][0] == 0 && bingobox[i][1] == 0 && bingobox[i][2] == 0) {
                loss2 = false;
                count++;
            }
        }

        if (bingobox[0][0] == 0 && bingobox[1][1] == 0 && bingobox[2][2] == 0) {// 判斷左斜線
            loss = false;
            loss2 = false;
            count++;
        }

        if (bingobox[0][2] == 0 && bingobox[1][1] == 0 && bingobox[2][0] == 0) {// 判斷右斜線
            loss = false;
            loss2 = false;
            count++;
        }

        System.out.println();

        if (loss && loss2) {
            System.out.println("not connect any line");
        } else {
            System.out.println("Bingo and you connect " + count + " line");
        }
    }
}

public class Bingo {
    public static void main(String[] args) {

        buildBingo1 b = new buildBingo1();

        b.inputNum();
        b.showBingobox();
        b.pickNum();
        b.showPn();
        b.checkBingobox();
        b.showCheckBingobox();
        b.checkBingo();
    }
}
