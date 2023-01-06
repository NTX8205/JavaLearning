package 練習;

//撲克牌比大小

import java.security.*;
public class card {
    
    public static void main(String[] args) {
        deckofcards mydDeckofcards = new deckofcards();
        mydDeckofcards.shuffle();
        String[] one = new String[26];
        String[] two = new String[26];

        System.out.printf("玩家1 手中有 26 張牌\n");

        for (int i = 1; i <= 26; i++) {

            one[i - 1] = mydDeckofcards.dealcard();
            System.out.printf("%-10s", one[i - 1]);

            if (i % 4 == 0) {
                System.out.println();
            }
        }

        System.out.println("\n");

        System.out.printf("玩家2 手中有 26 張牌\n");

        for (int i = 1; i <= 26; i++) {

            two[i - 1] = mydDeckofcards.dealcard();
            System.out.printf("%-10s", two[i - 1]);

            if (i % 4 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n\n隨機抽牌:");
        SecureRandom randomcard = new SecureRandom();
        int n = randomcard.nextInt(26);

        System.out.print("玩家1 :" + one[n] + "\n");
        System.out.print("玩家2 :" + two[n] + "\n");

        String p1 = one[n];
        String[] tokens1 = p1.split(" ");
        int p1num = Integer.parseInt(tokens1[0]);

        String p2 = two[n];
        String[] tokens2 = p2.split(" ");
        int p2num = Integer.parseInt(tokens2[0]);

        switch (tokens1[1]) {
            case "愛心":
                tokens1[1] = "3";
                break;
            case "菱形":
                tokens1[1] = "2";
                break;
            case "黑桃":
                tokens1[1] = "4";
                break;
            case "梅花":
                tokens1[1] = "1";
                break;
        }

        switch (tokens2[1]) {
            case "愛心":
                tokens2[1] = "3";
                break;
            case "菱形":
                tokens2[1] = "2";
                break;
            case "黑桃":
                tokens2[1] = "4";
                break;
            case "梅花":
                tokens2[1] = "1";
                break;
        }

        int p1flowernum = Integer.parseInt(tokens1[1]);
        int p2flowernum = Integer.parseInt(tokens2[1]);

        if (p1num > p2num) {
            System.out.println("玩家1 贏。");
        } else if (p1num < p2num) {
            System.out.println("玩家2 贏。");
        } else {
            if (tokens1[1] == tokens2[1]) {
                System.out.println("平手");
            } else if (p1flowernum > p2flowernum) {
                System.out.println("玩家1 贏。");
            } else {
                System.out.println("玩家2 贏。");
            }

        }
    }

}

class deckofcards {
    private static final SecureRandom randomnumbers = new SecureRandom();
    private static final int numbers_of_card = 52;

    private String[] deck = new String[numbers_of_card];
    private int cuurentcard = 0;

    public deckofcards() {
        String[] faces = { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13" };
        String[] suits = { "菱形", "梅花 ", "愛心 ", "黑桃" };
        for (int count = 0; count < deck.length; count++) {
            deck[count] = faces[count % 13] + " " + suits[count / 13];
        }
    }

    public void shuffle() {
        cuurentcard = 0;

        for (int first = 0; first < deck.length; first++) {
            int second = randomnumbers.nextInt(numbers_of_card);

            String temp = deck[first];
            deck[first] = deck[second];
            deck[second] = temp;
        }
    }

    public String dealcard() {
        if (cuurentcard < deck.length) {
            return deck[cuurentcard++];
        } else {
            return null;
        }
    }
}