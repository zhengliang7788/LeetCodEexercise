package algorithm;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串 s ，判断字符串是否有效。
 * <p>
 * 有效字符串需满足：
 * <p>
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 每个右括号都有一个对应的相同类型的左括号。
 */
public class Main20 {

    public static boolean isValid(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);

            if (stack.isEmpty()) {
                stack.push(c);
            } else {
                Character peek = stack.peek();

                String str = String.valueOf(peek) + String.valueOf(c);

                if ("()".equals(str) || "{}".equals(str) || "[]".equals(str)) {
                    stack.pop();
                } else {
                    stack.push(c);
                }
            }

        }
        return stack.isEmpty();
    }


    public static boolean isValid2(String s) {
        if (s.length() % 2 != 0) {
            return false;
        }

        List<Character> list = new Stack<>();

        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);

            if (list.isEmpty())
            {
                list.add(c);
            }
            else
            {
                Character peek = list.get(list.size() - 1);

                String str = String.valueOf(peek) + String.valueOf(c);

                if ("()".equals(str) || "{}".equals(str) || "[]".equals(str)) {
                    list.remove(list.size() - 1);
                } else {
                    list.add(c);
                }
            }

        }
        return list.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(Main20.isValid("({[)"));

    }
}
