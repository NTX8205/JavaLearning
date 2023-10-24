package 委託.資科B班;
/* 
4.	寫一個JAVA程式，模擬將52張牌發給4位玩家，
    每位玩家13張牌，發牌順序為1>2>3>4……..>4。
    （花色圖示:'♠', '♥', '♦', '♣'）
*/

//撲克牌比大小

import java.security.*;

public class card {

    public static void main(String[] args) {
        deckofcards mydDeckofcards = new deckofcards();
        mydDeckofcards.shuffle();
        String[] one = new String[13];
        String[] two = new String[13];
        String[] three = new String[13];
        String[] four = new String[13];

        System.out.printf("第一位玩家手牌\n");

        for (int i = 1; i <= 13; i++) {

            one[i - 1] = mydDeckofcards.dealcard();
            System.out.printf("%-5s", one[i - 1]);

        }

        System.out.println("\n");

        System.out.printf("第二位玩家手牌\n");

        for (int i = 1; i <= 13; i++) {

            two[i - 1] = mydDeckofcards.dealcard();
            System.out.printf("%-5s", two[i - 1]);

        }
        System.out.println("\n");

        System.out.printf("第三位玩家手牌\n");

        for (int i = 1; i <= 13; i++) {

            three[i - 1] = mydDeckofcards.dealcard();
            System.out.printf("%-5s", three[i - 1]);

        }
        System.out.println("\n");

        System.out.printf("第四位玩家手牌\n");

        for (int i = 1; i <= 13; i++) {

            four[i - 1] = mydDeckofcards.dealcard();
            System.out.printf("%-5s", four[i - 1]);

        }



        
    }

}

class deckofcards {
    private static final SecureRandom randomnumbers = new SecureRandom();
    private static final int numbers_of_card = 52;

    private String[] deck = new String[numbers_of_card];
    private int cuurentcard = 0;

    public deckofcards() {
        String[] faces = { "A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };
        String[] suits = { "梅花", "菱形", "愛心", "黑桃" };
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
