package 資料結構.實習;

import java.util.Scanner;
import java.util.Stack;

public class stackmenu {
    
    public static void main(String[] args) {
        
        Scanner sc =new Scanner(System.in);
        System.out.println("歡迎使用 Stack Menu!");

        Stack<String> stack = new Stack<String>();

        while (true) {
            System.out.println("請輸入你將要使用的操作");
            System.out.println("1.將數值推入堆疊 2.將數值推出堆疊 3.檢查堆疊最後輸入的數值 4.檢查堆疊是否為0 0.跳出操作");

            int inputSelection = sc.nextInt();

            if(inputSelection==0){
                break;
            }

            switch(inputSelection){

                case 1:
                    System.out.println("請輸入你要推入堆疊的數值");
                    String input = sc.next();
                    System.out.println("將"+input+"推入堆疊");
                    stack.push(input);
                    break;
                case 2:
                    if(stack.isEmpty()){
                        System.out.println("堆疊為空，不可推出");
                        break;
                    }
                    System.out.println("將"+stack.pop()+"推出堆疊");
                    break;
                case 3:
                    if(stack.isEmpty()){
                        System.out.println("堆疊為空，不可檢查");
                        break;
                    }
                    System.out.println("最上層堆疊為: "+stack.peek());
                    break;
                case 4:
                    if(stack.isEmpty()){
                        System.out.println("堆疊為空");

                    }
                    else{
                        System.out.println("堆疊不為空");
                        
                    }
                    break;
                default:
                    System.out.println("無此項操作，請重新輸入");
                    break;

            }
        }
        sc.close();
    }

}
