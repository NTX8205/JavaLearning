package 資料結構.作業.範例.排序法;

import java.util.*;
import java.io.*;

public class quick_sort extends Object {
    
    int process = 0;
    int size;
    int data[] = new int[100001];

    public static void main(String[] args) {
        
        quick_sort sort = new quick_sort();

        System.out.print("請輸入陣列大小(100000以下) :");
        try {
            
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);
            sort.size=Integer.parseInt(br.readLine());
        } catch (Exception e) {
        }

        sort.inputarr();
        System.out.print("原始資料是:");
        sort.showdata();
        sort.quick(sort.data,sort.size-1,0,sort.size-1);
        System.out.print("\n排序結果:");
        sort.showdata();
    }

    void inputarr(){

        //以亂數輸入
        Random rand = new Random();
        for (int i=0;i<size-1;i++){
            data[i]=(Math.abs(rand.nextInt(100000)))+1;
        }
    }

    void showdata(){

        for (int i=0;i<size-1;i++){
            System.out.print(data[i]+" ");
        }
        System.out.println();
    }

    void quick(int d[],int size,int lf,int rg){
        
        int i,j,temp;
        int lf_idx;
        int rg_idx;
        if(lf<rg){ //1:第一筆鍵值為d[lf]

            lf_idx=lf+1;
            rg_idx=rg;

            //排序
            while(true){

                // System.out.print("[處理過程"+(process++)+"]=>");
                // for(t=0;t<size;t++){
                //     System.out.print("["+d[t]+"]");
                // }
                // System.out.println();

                for(i=lf+1;i<=rg;i++){ //2:由左向右找出一個最大鍵值大於d[lf]者
                    if(d[i]>=d[lf]){
                        lf_idx=i;
                        break;
                    }
                    lf_idx++;
                }

                for(j=rg;j>=lf+1;j--){  //3:由右向左找出一個鍵值小於d[lf]者
                    if(d[j]<=d[lf]){
                        rg_idx=j;
                        break;
                    }
                    rg_idx--;
                }

                if(lf_idx<rg_idx){  //4-1:若lf_idx<rg_idx

                    temp=d[lf_idx];
                    d[lf_idx]=d[rg_idx];    //則d[lf_idx]和d[rg_idx]互換
                    d[rg_idx]=temp; //然後繼續排序
                }
                else {
                    break;  //否則跳出排序過程
                }
            }

            //整理
            if(lf_idx>=rg_idx){ //5-1:若lf_idx大於rg_idx
                                //則將d[lf]和d[rg_idx]互換

                temp=d[lf];
                d[lf]=d[rg_idx];
                d[rg_idx]=temp;

                //5-2:並以rg_idx為基準點分成左右兩半
                quick(d, size-1, lf, rg_idx-1);   //以遞迴方式分別為左右兩半進行排序
                quick(d, size-1, rg_idx+1, rg);   //直至完成排序
            }

        }

    }
}
