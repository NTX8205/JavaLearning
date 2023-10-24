package 委託.資科A班;

/*
 * 模擬樂透彩簽注與兌獎(提示:購買者自行輸入六碼，然後由電腦產生一組六個號碼進行比對)。
 */

import java.util.*;
import java.security.*;

public class lotto {
    
    public static void main(String[] args) {
        System.out.println("購買者自行輸入6個樂透彩號碼:");

        Scanner input=new Scanner(System.in);

        int []number=new int[6];
        
        ArrayList<Integer>randomnumber=new ArrayList<Integer>();

        for(int i =0;i<6;i++){
            System.out.print("輸入第"+(i+1)+"個樂透彩號碼:");
            number[i]=input.nextInt();
        }
        // 電腦產生一組六個號碼+特別獎 7個數字
        SecureRandom randomnumbers = new SecureRandom();

        for(int i =0;i<7;i++){
            int ran=randomnumbers.nextInt(49)+1;
            if(randomnumber.contains(ran)){
                i-=1;
                continue;
            }
            else{
                randomnumber.add(ran);
            }
            
        }
        System.out.print("電腦亂數產生7個樂透彩號碼:");
        for(int i=0;i<6;i++){
            System.out.print(randomnumber.get(i));
            System.out.print(" ");
        }
        System.out.print("特別號:"+randomnumber.get(6)+"\n");


        // 比對購買者與電腦號碼是否有相同
        int count=0;
        
        for(int i =0;i<6;i++){
            for(int j=0;j<7;j++){
                if(number[i]==randomnumber.get(j)){
                    count++;
                }
            }
        }
        if(count>0){
            System.out.println("有中獎");
        }
        else{
            System.out.println("沒中獎");
        }
        input.close();
    }
}
