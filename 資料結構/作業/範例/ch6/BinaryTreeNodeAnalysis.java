package 資料結構.作業.範例.ch6;

//
// 判斷利用陣列表示法輸入的二元樹有多少個內部節點＆多少個樹葉節點
//
// 假設這棵樹儲存的元素值為 正整數, 節點的值為 0 代表的是 null
//
// 日期：2014/12/20
// Author: Yu-Chen Hu

import java.io.*;

public class BinaryTreeNodeAnalysis {
   // h: 樹的高度
   // 三層的樹 n= 8, 四層的樹 n = 16
   // BinTree[0] = 0 保留
   //
   // 5 BinTree[1] = 5 樹根
   // 4 2 BinTree[2] = 4 and BinTree[3] = 2
   // x 6 1 x BinTree[4] = 0 在這裡 0 代表 null
   // BinTree[5] = 6 and BinTree[6] = 1
   // BinTree[7] = 0 在這裡 0 代表 null
   // ==================================================
   //
   // 第一組測試資料

   // static int h = 3;
   // static int n = 8;
   // static int BinTree[] = {0,5,4,2,0,6,1,0};

   // 第二組測試的資料
   static int h = 4;
   static int n = 16;
   static int BinTree[] = { 1, 5, 4, 2, 3, 15, 8, 9, 6, 7, 3, 4, 4, 9, 7, 11 };
   //
   //              5
   //         4        2
   //       3   15   8   9
   //      6 7 x  4 x 9 x 11
   //

   public static void main(String[] args) throws IOException {
      System.out.printf("\n判斷以陣列表示法儲存高度為 %d 的二元樹是不是正確的二元樹", h);
      System.out.printf("\n假設節點的數值為正整數，空的節點的數值為0");
      System.out.printf("\n高度是 %d 的二元樹，若為full binary tree會有 %3d 節點,再加上陣列保留編號0的位置，共計 %3d 筆資料", h, n - 1, n);
      System.out.printf("\n\n這棵二元樹的陣列表示法：");
      for (int i = 1; i < n; i++) {
         System.out.printf(" %3d", BinTree[i]);
      }

      int TotalNo = 0; // 記錄二元樹的節點總個數
      for (int i = 1; i < n; i++) {
         if (BinTree[i] != 0) // 遇到不為零的節點，數目加一
         {
            TotalNo++;
         }
      }
      System.out.printf("\n節點的總數為 %3d\n", TotalNo);

      int NoLeafNode = 0;
      int NoInternalNode = 0;
      System.out.printf("\n判斷個別節點是內部節點 or 樹葉節點");
      for (int i = 1; i < n; i++) {
         if (BinTree[i] != 0) {
            int value = IsLeaf(i);
            if (value == 1) {
               NoLeafNode++;
               System.out.printf("\n 節點編號 %3d | 數值為 %3d, 它是樹葉節點 (leaf node)", i, BinTree[i]);
            } else {
               NoInternalNode++;
               System.out.printf("\n 節點編號 %3d | 數值為 %3d, 它是內部節點 (internal node)", i, BinTree[i]);
            }
         }
      }
      System.out.printf("\n\t內部節點的個數為 %3d", NoInternalNode);
      System.out.printf("\n\t樹葉節點的個數為 %3d", NoLeafNode);
   }

   // 判斷編號為 no 的節點是不是樹葉節點
   // 如果是，傳回 1
   // 如果不是，傳回 0
   public static int IsLeaf(int no) {
      // 三層的二元樹，只有編號 1, 2, 3 的才有可能是內部節點
      // 編號 1, 2, 3 的節點還要再檢查是否有左邊的孩子或是右邊的孩子
      // ==> ( BinTree[2*i]!=0 || BinTree[2*i+1]!=0 ) 1 <= i <=3
      // 編號 4, 5, 6, 7 的一定是樹葉節點

      if (no < n / 2) {
         if ((BinTree[2 * no] != 0) || (BinTree[2 * no + 1] != 0)) {
            return (0);
         } else {
            return (1);
         }
      } else {
         return (1);
      }
   }
}