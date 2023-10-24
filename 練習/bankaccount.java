package 練習;

//銀行帳戶
import java.util.Scanner;
public class bankaccount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            String id = sc.next();
            String function = sc.next();
            int num = sc.nextInt();
            switch (function) {
                case "s":
                    bankAccount1 s = new savingAccount(id, function, num);
                    System.out.println(id + " " + s.calculateFee());
                    break;
                case "c":
                    bankAccount1 c = new checkingAccount(id, function, num);
                    System.out.println(id + " " + c.calculateFee());
                    break;

                default:
                    System.out.println("error");
                    break;
            }
        }
        sc.close();
    }
}

abstract class bankAccount1 {
    protected String accountID;
    protected String accountType;
    protected int numberWithdraw;

    public bankAccount1(String accountID, String accountType, int numberWithdraw) {
        this.accountID = accountID;
        this.accountType = accountType;
        this.numberWithdraw = numberWithdraw;
    }

    public int getNumberWithdraw() {
        return numberWithdraw;
    }

    abstract int calculateFee();
}

class savingAccount extends bankAccount1 {
    public savingAccount(String id, String type, int numWithdraw) {
        super(id, type, numWithdraw);
    }

    int calculateFee() {
        if (numberWithdraw <= 3) {
            return 0;
        } else {
            return (numberWithdraw - 3) * 8;
        }
    }
}

class checkingAccount extends bankAccount1 {
    public checkingAccount(String id, String type, int numWithdraw) {
        super(id, type, numWithdraw);
    }

    int calculateFee() {
        if (numberWithdraw <= 10) {
            return numberWithdraw * 50;
        } else {
            return (500 + (numberWithdraw - 10) * 30);
        }
    }
}