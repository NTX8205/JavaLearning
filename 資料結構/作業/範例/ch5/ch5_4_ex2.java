package 資料結構.作業.範例.ch5;


import java.util.LinkedList;

public class ch5_4_ex2 {
	public static void main(String args[]) {
		// int start_node = 1, end_node = 6;

		// String Sum_Node[] = { "head", "10", "null" };
		LinkedList<String> LL = new LinkedList<String>(); // 建立一個空的鏈結串列

		System.out.println("建立一個單一串列：");
		LL.add("10");
		LL.addFirst("20");
		LL.add("30");
		LL.addFirst("40");
		LL.add("null");

		while (LL.getFirst() != "null") {
			System.out.print(LL.getFirst() + "->");
			LL.removeFirst();
		}
		System.out.print("null");

	}
}