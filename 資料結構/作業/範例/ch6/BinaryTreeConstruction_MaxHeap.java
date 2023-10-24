package 資料結構.作業.範例.ch6;

//
// 輸入 n 個正整數 ( 1 <= n <=15 )
//     利用輸入的正整數，一個一個循序的加入建立一棵 Max Heap
//
//
// 日期：2014/12/29
// Author: Yu-Chen Hu

import java.io.*;

public class BinaryTreeConstruction_MaxHeap
{

   static int n = 7;
   static int MaxNo = 16;             // 輸入資料筆數最多為 n = 15
                                      // 儲存陣列表示法所需的儲存空間 MaxNo = 15+1

   // 輸入的正整數記錄在 data[] 中
   static int data[] = {8,15,14,9,12,16,19};

   public static void main(String[] args)throws IOException
    {
    	int h=1;           // 記錄 Max Heap 的高度

        if ( n == 1 ) h = 1;
    	if ( ( n >= 2 ) && ( n <= 3 )  ) h = 2;
    	if ( ( n >= 4 ) && ( n <= 7 )  ) h = 3;
    	if ( ( n >= 8 ) && ( n <= 15 ) ) h = 4;

    	int tno=1;

    	for(int i=1;i<=h;i++)        // 計算陣列表示法所需的實際空間大小 tno = 2^h
    	   {
    	   	 tno*=2;
    	   }

        int MaxHeap[] = new int [MaxNo];
        for(int i=0;i<MaxNo;i++)
           {
           	 MaxHeap[i] = 0;
           }

        System.out.printf("\n利用 %d 筆資料建立 Max Heap，高度為%3d,利用陣列表示法需要 %d 格空間 ",n,h,tno);

        int size = 0;
        int position = 0;

        for(int i=0;i<n;i++)
           {
             // 加入前 MaxHeap 有 size 筆資料
             // 依序將每一筆料放到 MaxHeap 的 size+1 編號的節點
             //   ==> data[0] 放到 MaxHeap[1]
             //   ==> data[1] 放到 MaxHeap[2]
             position = ++size;
             MaxHeap[position] = data[i];

             if ( i >= 1 )       // 除了樹根不需調整之外，其他節點需檢查是否需要調整
                {
                  while ( position > 1 )  // 還沒回溯到樹根節點，樹根的編號為1
                    {
                      int parent = position/2;
                      if ( MaxHeap[position] > MaxHeap[parent] )
                         {
                      	   int temp = MaxHeap[position];
                      	   MaxHeap[position] = MaxHeap[parent];
                      	   MaxHeap[parent] = temp;
                         }
                      position = parent;
                    }
                }

             System.out.printf("\n目前處理%3d筆資料，數值為%3d | MaxHeap 內容：",(i+1),data[i]);
             for(int j=0;j<tno;j++)
                {
                  System.out.printf("%3d ",MaxHeap[j]);
                }
           }
        System.out.printf("\n\n");
    }

}
