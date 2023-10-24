package 資料結構.實習;

import java.util.Stack;
public class pa {
    public static boolean isVaild(String s) {
        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
                st.push(s.charAt(i));
            } else {
                if (!st.isEmpty()) {
                    if (s.charAt(i) == ')') {
                        if ((char) st.peek() != '(') {
                            return false;
                        }
                        st.pop();
                    } else if (s.charAt(i) == '}') {
                        if ((char) st.peek() != '{') {
                            return false;
                        }
                        st.pop();
                    } else if (s.charAt(i) == ']') {
                        if ((char) st.peek() != '[') {
                            return false;
                        }
                        st.pop();
                    }
                } else {
                    return false;
                }
            }
        }
        if (!st.isEmpty()) {
            return false;
        } else {
            return true;
        }
    }

    boolean isVaildSimple(String s) {
        Stack<Character> st = new Stack<Character>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[') {
                st.push(ch);
            } else {
                if (s.isEmpty()) {
                    return false;
                } else {
                    char peek = st.pop();

                    if (ch == ')' && peek != '(') {
                        return false;
                    }
                    if (ch == '}' && peek != '{') {
                        return false;
                    }
                    if (ch == ']' && peek != '[') {
                        return false;
                    }
                }
            }
        }
        return s.isEmpty();
    }

    public static void parenttheses(String s) {
        if (isVaild(s)) {
            System.out.println("yes");
        }

    }

    public static void main(String[] args) {

        String s = "(123)";
        parenttheses(s);

    }
}
