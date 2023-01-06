package 資料結構.作業.範例.ch6;

//
// 輸入 n 個正整數 ( 1 <= n <=15 )
//     將輸入的 n 個正整數依序儲存到一棵complete binary tree中
//     進行 reheapify 的處理來產生 Max Heap
//
// 日期：2015/01/05
// Author: Yu-Chen Hu

import java.io.*;


public class BinaryTreeConstruction_MaxHeapReheapify
{

   static int n = 9;
   static int MaxNo = 16;             // 輸入資料筆數最多為 n = 15
                                      // 儲存陣列表示法所需的儲存空間 MaxNo = 15+1

   // 輸入的正整數記錄在 data[] 中
   static int data[] = {8,15,14,9,12,16,19,23,18};

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

        // 將輸入的資料循序儲存到二元樹中
        // 樹根 MaxHeap[1]
        for(int i=0;i<n;i++)
           {
           	 MaxHeap[i+1] = data[i];
           }

        System.out.printf("\n利用 %d 筆資料建立 Max Heap，高度為%3d,利用陣列表示法需要 %d 格空間 ",n,h,tno);
        System.out.printf("\n原始 MaxHeap 的資料：   ");
        for(int i=0;i<=n;i++)
           {
             System.out.printf("%3d ",MaxHeap[i]);
           }
        System.out.printf("\n");
        // 進行 reheapify 的處理
        int index;          // 一開始記錄內部節點中，編號最大的

        for(index = n/2; index >= 1; index--)
          {
            int position = index;

            do
               {
            	 int LeftChild = 2*position;
          	     int RightChild = 2*position+1;

          	     // 左邊或右邊的孩子 比父親節點來的大
              	 if ( (MaxHeap[position] < MaxHeap[LeftChild] ) || (MaxHeap[position] < MaxHeap[RightChild] ) )
          	        {
          	         //  int max;
          	          int max_index;
          	          if ( MaxHeap[LeftChild] >= MaxHeap[RightChild] )
          	             {
          	               // max = MaxHeap[LeftChild];
          	               max_index = LeftChild;
          	             }
          	          else
          	             {
          	               // max = MaxHeap[RightChild];
          	               max_index = RightChild;
          	             }

          	          // 將 樹根 與 比較大的孩子互換
          	          int tmp = MaxHeap[position];
          	          MaxHeap[position] = MaxHeap[max_index];
          	          MaxHeap[max_index] = tmp;

          	          // 繼續往下一層檢查是否維持 叫大的數值在上面
          	          position = max_index;

          	        }
          	     else
          	        {
          	          position = n;
          	        }
          	   }
            while ( position <= n/2 );

            System.out.printf("\nReheapify %d 節點的結果：",index);
            for(int i=0;i<=n;i++)
               {
                 System.out.printf("%3d ",MaxHeap[i]);
               }

          }

      //   int position = 0;

        System.out.printf("\n\nMaxHeap 最後結果：      ");
        for(int i=0;i<MaxNo;i++)
           {
             System.out.printf("%3d ",MaxHeap[i]);
           }
        System.out.printf("\n\n");
    }

}
