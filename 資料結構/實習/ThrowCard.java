package 資料結構.實習;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class ThrowCard {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int CardAmount = sc.nextInt();
        DeckGame Deck = new DeckGame(CardAmount);

        while(Deck.isNotEmpty()){
            Deck.CallOutTheNumber();
            Deck.DiscardTheCard();
            Deck.PutTheCardOnTheBack();
        }
        sc.close();
    }
}

class DeckGame{

    Queue<Integer> Deck;

    public DeckGame(int CardAmount){
        Deck = new LinkedList<Integer>();
        AddCard(CardAmount);
    }

    void AddCard(int CardAmount){
        for (int i = 1; i <= CardAmount; i++) {
            Deck.offer(i);
        }
    }

    boolean isNotEmpty(){
        return !Deck.isEmpty();
    }

    void CallOutTheNumber(){
        if(isTheLastCard()){
            System.out.print(Deck.element());
        }
        else{
            System.out.print(Deck.element()+", ");
        }
    }

    boolean isTheLastCard(){
        return Deck.size()==1;
    }

    void DiscardTheCard(){
        Deck.poll();
    }

    void PutTheCardOnTheBack(){
        if(Deck.isEmpty()){
            return;
        }
        Deck.offer(Deck.poll());
    }
}
