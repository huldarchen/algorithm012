package homework;

import java.util.*;

/**
 * LeetCode-20: 有效括号
 *
 * @author bingjie.chen
 * @date 2020/7/13
 */
public class ValidParentheses {

    public boolean isValidUseStack(String s) {
        LinkedList<Character> list = new LinkedList<>();
        Map<Character, Character> map = new HashMap<Character, Character>(3) {{
            put('{', '}');
            put('(', ')');
            put('[', ']');
        }};
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                list.addLast(map.get(c));
            } else if (list.isEmpty() || c != list.removeLast()) {
                return false;
            }
        }
        return list.isEmpty();
    }

    public boolean isValidUseStackOption(String s) {
        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '{') {
                stack.push('}');
            } else if (c == '[') {
                stack.push(']');
            } else {
                if (stack.peek() != c) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
