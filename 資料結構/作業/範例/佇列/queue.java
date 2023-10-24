package 資料結構.作業.範例.佇列;

import java.io.*;

public class queue {
    
    public static int front = -1, rear = -1, val;
    public static int queue[] = new int[10];
    
    public static void main(String[] args) throws IOException {
        String strM;
        BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
        while(rear < 10 && val != -1) {
            System.out.print("請輸入一個值以存入佇列，欲取出值請輸入0。(結束輸入-1) :");
            strM = keyin.readLine();
            val = Integer.parseInt(strM);
            if(val == 0) {
                if(front == rear) {
                    System.out.print("[佇列已經空了]\n");
                    break;
                }
                front++;
                if(front == 10) {
                    front = 0;
                }
                System.out.print("取出佇列值 [" + queue[front] + "]\n");
                queue[front] = 0;
            }
            else if (val != -1 && rear < 10 ){
                if(rear + 1 == front || rear ==9 && front <= 0) {
                    System.out.print("[佇列已經滿了]\n");
                    break;
                }
                rear++;
                if(rear == 10){
                    rear = 0;
                }
                queue[rear] = val;
            }
        }
        System.out.print("\n佇列剩餘資料 : \n");
        if(front == rear){
            System.out.print("佇列以空 !");
        }
        else {
            while(front != rear) {
                front++;
                if(front == 10) {
                    front = 0;
                }
                System.out.print("[" + queue[front] + "]");
                queue[front] = 0;
            }
        }
        System.out.print("\n");
    }
}
