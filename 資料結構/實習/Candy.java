package 資料結構.實習;

import java.util.Scanner;
import java.util.Stack;

public class Candy {

    static int NumberOfCandyFallen = 0;
    static Stack<Integer> tower = new Stack<Integer>();

    static boolean StillHaveCandy(int AmountOfCandy){
        return NumberOfCandyFallen < AmountOfCandy;
    }

    static boolean TowerIsEmpty(){
        return tower.isEmpty();
    }

    static boolean CandyNeedsToBeRemove(int Candy){
        if(TowerIsEmpty()){
            return false;
        }
        return tower.peek() == Candy;
    }

    static void RemoveTopCandy(){
        tower.pop();
    }

    static void StackTheCandy(int Candy){
        tower.push(Candy);
    }

    static void CandyFallen(){
        NumberOfCandyFallen++;
    }

    static void printCandyAmount(){
        int Amount = 0;
        while(!TowerIsEmpty()){
            Amount+=tower.pop();

        }
        System.out.println(Amount);
    }
    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int AmountOfCandy = sc.nextInt();
        while(StillHaveCandy(AmountOfCandy)){
            int Candy = sc.nextInt();
            if(CandyNeedsToBeRemove(Candy)){
                RemoveTopCandy();
            }
            else{
                StackTheCandy(Candy);
            }
            CandyFallen();
        }
        printCandyAmount();
        sc.close();
    }
}
