package 資料結構.考試.補考;

import java.util.Scanner;

/**
 * 題目:圓括號對應 Parenthesis Matching
 * 
 * 
 * 
 * 日期:2022.04.15
 */

public class Q5 {
    public static void main(String[] args) {

        System.out.println("圓括號對應 Parenthesis Matching");

        Scanner sc = new Scanner(System.in);

        System.out.print("輸入運算式: ");
        String str = sc.next();
        sc.close();

        int count = countParenthesis(str);
        char[] parenthesis = new char[count];
        int[] position = new int[count];
        int j = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(') {
                parenthesis[j] = c;
                position[j] = i;
                j++;

            } else if (c == ')') {
                parenthesis[j] = c;
                position[j] = i;
                j++;
            }
        }

        System.out.println("圓括弧的對應位置為: ");

        while (true) {
            int start = 0, end = 0;
            int countWord = 0;
            for (int k = 0; k < count; k++) {
                if (parenthesis[k] == '(') {
                    start = k;
                    countWord++;
                } else if (parenthesis[k] == ')') {
                    end = k;
                    parenthesis[start] = '0';
                    parenthesis[end] = '0';
                    System.out.print(position[start] + "," + position[end]);
                    System.out.println();
                    countWord++;
                    break;
                }
            }
            if (countWord == 1) {
                for (int l = 0; l < count; l++) {
                    if (parenthesis[l] == '(') {
                        System.out.print(position[l] + ",-1");
                        System.out.println();
                    } else if (parenthesis[l] == ')') {
                        System.out.print("-1," + position[l]);
                        System.out.println();
                    }
                }
                break;
            } else if (countWord == 0) {
                break;
            }

        }
    }

    public static int countParenthesis(String str) {

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '(' || c == ')') {
                count++;
            }

        }

        if (count > 0) {
            return count;
        } else {
            return 0;
        }
    }
}
