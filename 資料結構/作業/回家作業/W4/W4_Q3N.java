package 資料結構.作業.回家作業.W4;

/**
 * 題目:圓括號對應Parenthesis Matching
 * 
 * 
 * 
 * 日期:2022.03.22
 */

import java.util.*;

public class W4_Q3N {

    public static void main(String[] args) {
        System.out.println("圓括號對應Parenthesis Matching");
        Scanner sc = new Scanner(System.in);

        System.out.print("輸入算式: ");
        String s = sc.next();
        sc.close();
        ArrayList<String> str = new ArrayList<String>();
        ArrayList<Integer> position = new ArrayList<Integer>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                str.add("(");
                position.add(i);
            } else if (c == ')') {
                str.add(")");
                position.add(i);
            }
        }

        int start = 0, end = 0;
        int sp = 0;
        while (str.size() > 1) {
            for (int i = 0; i < str.size(); i++) {

                if (str.get(i) == "(") {

                    start = position.get(i);
                    sp = i;
                } else if (str.get(i) == ")") {
                    end = position.get(i);

                    str.remove(i);
                    str.remove(sp);
                    position.remove(i);
                    position.remove(sp);

                    System.out.println(start + "," + end);
                    break;
                }
            }
        }

        if (str.size() == 1) {
            if (str.get(0) == "(") {
                System.out.println(position.get(0) + "," + "-1");
            } else if (str.get(0) == ")") {
                System.out.println("-1" + "," + position.get(0));
            }
        }

    }
}
