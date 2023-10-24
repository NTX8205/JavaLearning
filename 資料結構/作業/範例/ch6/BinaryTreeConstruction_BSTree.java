package 資料結構.作業.範例.ch6;

//
// 輸入 n 個正整數 ( 1 <= n <= 10 )
//     利用輸入的正整數，一個一個循序的加入建立一棵 Binary Search Tree
//
//
// 日期：2015/01/05
// Author: Yu-Chen Hu

import java.io.*;

public class BinaryTreeConstruction_BSTree
{

   static int n = 10;
   static int MaxNo = 1024;             // 輸入資料筆數最多為 n = 10
                                      // 儲存陣列表示法所需的儲存空間 MaxNo = 2^10 = 1024

   // 輸入的正整數記錄在 data[] 中

   static int data[] = {8,15,14,4,2,5,12,18,19,20};

   public static void main(String[] args)throws IOException
    {

        int BSTree[] = new int [MaxNo];
        for(int i=0;i<MaxNo;i++)
           {
           	 BSTree[i] = 0;
           }

//        System.out.printf("\n利用 %d 筆資料建立 BS Tree，高度為%3d,利用陣列表示法需要 %d 格空間 ",n,h,tno);

        BSTree[1] = data[0];               //   ==> data[0] 放到 BSTree[1]
                                           // 產生樹根節點
        for(int i=1;i<n;i++)
           {
             // 依序將剩下的 (n-1) 筆資料 放到 BSTree 的 空的節點
             int element = data[i];        // 目前要加入 BSTree 的元素

             int position = 1;
             while ( BSTree[position] !=0 )
                {
                  if ( element <= BSTree[position] )
                     {
                       position = position*2;             // 往左子樹走
                     }
                  else
                     {
                       position = position*2+1;           // 往右子樹走
                     }
                }
             BSTree[position] = element;

             System.out.printf("\n目前處理%3d筆資料，數值為%3d | BSTree 內容：",(i+1),data[i]);
             for(int j=0; j<32; j++)
                {
                  System.out.printf("%2d ",BSTree[j]);
                }
           }
        System.out.printf("\n");

        int MaxIndex = 0;               // 紀錄二元搜尋樹中，編號最大的節點
        for(int i=MaxNo-1; i>=1; i--)
           {
           	 if ( BSTree[i] !=0 )
           	 {
           	   MaxIndex = i;
           	   break;
           	 }
           }
        System.out.printf("\n二元搜尋樹中，編號最大的節點=%3d",MaxIndex);

    	int h = 1;           // 記錄 BSTree 的高度
    	int no = 1;          // 2^0=1
        int totalno = 1;

        while ( totalno < MaxIndex )
           {
           	 no*=2;                    //      no = 1, 2, 4,  8
           	 totalno += no;            //       h = 1, 2, 3,  4
           	 h++;                      // totalno = 1, 3, 7, 15
           }
        System.out.printf("\n二元搜尋樹的高度=%3d",h);
        System.out.printf("\n");
    }

}
