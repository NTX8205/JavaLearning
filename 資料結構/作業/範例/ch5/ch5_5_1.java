package 資料結構.作業.範例.ch5;

import java.util.*;


public class ch5_5_1 {
	public static void main(String args[]) {
		// int start_node = 1, end_node = 6;
		// String Sum_Node[] = { "head", "10", "null" };
		LinkedList<String> LL = new LinkedList<String>(); // 建立一個空的鏈結串列
		System.out.println("建立一個單一串列：");
		LL.add("10");
		System.out.print(LL.getFirst() + "->");
		System.out.print("null");
	}
}