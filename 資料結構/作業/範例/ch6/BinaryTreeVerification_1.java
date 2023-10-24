package 資料結構.作業.範例.ch6;

//
// 判斷利用陣列表示法輸入的二元樹是不是合法的
//     若有錯誤，需將有錯誤的節點輸出
//
//     判斷條件：如果該節點的數值為0, 則兩個子節點的值應該也要是0
//
// 假設這棵樹儲存的元素值為 正整數, 節點的值為 0 代表的是 null
//
// 日期：2014/12/20
// Author: Yu-Chen Hu

import java.io.*;

public class BinaryTreeVerification_1 {

   // h: 樹的高度
   // 三層的樹 n= 8, 四層的樹 n = 16
   // tree[0] = 0 保留
   //
   // 5 tree[1] = 5 樹根
   // 4 2 tree[2] = 4 and tree[3] = 2
   // x 6 1 x tree[4] = 0 在這裡 0 代表 null
   // tree[5] = 6 and tree[6] = 1
   // tree[7] = 0 在這裡 0 代表 null
   // 第一組測試資料

   static int h = 3;
   static int n = 8;

   // 正確的陣列表示法資料
   // static int BinTree[] = {0,5,4,2,0,6,1,0};

   // 修改後，有錯的陣列表示法資料
   static int BinTree[] = { 0, 0, 0, 0, 3, 6, 1, 0 };

   // 第二組測試的資料
   // static int h = 4;
   // static int n = 16;
   //
   // 5
   // 4 2
   // 3 x 8 9
   // 6 7 x x 1 x 10 11
   //
   // 正確的陣列表示法資料
   // static int BinTree[] = {0,5,4,2,3,0,8,9,6,7,0,0,1,0,10,11};

   public static void main(String[] args) throws IOException {

      System.out.printf("\n判斷以陣列表示法儲存高度為 %d 的二元樹是不是正確的二元樹", h);
      System.out.printf("\n假設節點的數值為正整數，空的節點的數值為0");
      System.out.printf("\n高度是 %d 的二元樹，若為full binary tree會有 %3d 節點,再加上陣列保留編號0的位置，共計 %3d 筆資料", h, n - 1, n);

      System.out.printf("\n\n這棵二元樹的陣列表示法（不包含索引值為0）：");
      for (int i = 1; i < n; i++) {
         System.out.printf(" %3d", BinTree[i]);
      }

      int ErrorNo = 0; // 儲存出錯的節點個數

      // 檢查所有可能的內部的節點，編號為1,2,..., (n-1)/2
      // 三層的樹最多 7 (2^3-1)的節點，只需檢查前兩層 1,2,3
      // 四層的樹最多15 (2^4-1)的節點，只需檢查前三層 1,2,3, ...,7
      for (int i = 1; i <= (n - 1) / 2; i++) {
         int LeftChild = 2 * i;
         int RightChild = 2 * i + 1;

         // 判斷條件：如果該節點的數值為0, 則兩個子節點的值應該也要是0
         int no = 0;
         if (BinTree[i] == 0) {
            if (BinTree[LeftChild] != 0) {
               System.out.printf("\n樹葉節點 %d 發生錯誤:有左子節點，數值為 %d ", i, BinTree[LeftChild]);
               no++;
            }

            if (BinTree[RightChild] != 0) {
               System.out.printf("\n樹葉節點 %d 發生錯誤:有右子節點，數值為 %d ", i, BinTree[RightChild]);
               no++;
            }

            if (no != 0) {
               ErrorNo++; // 錯誤的節點個數加一
            }
         }
      }

      if (ErrorNo != 0) {
         System.out.printf("\n\n以陣列表示法輸入的二元樹有 %3d 個節點有錯\n", ErrorNo);
      } else {
         System.out.printf("\n\n以陣列表示法輸入的二元樹是正確的\n");
      }
   }
}
