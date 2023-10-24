package 資料結構.作業.範例.ch1;

public class ch1_4a {
    public static void main(String[] args) {
        int C_Score, E_Score, Average;
        C_Score = 60;
        E_Score = 70;
        Average = (C_Score + E_Score) / 2;
        if (Average >= 60)
            System.out.println("及格");
        else
            System.out.println("不及格");
    }
}
