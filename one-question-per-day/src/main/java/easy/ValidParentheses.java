package easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 * 有效括号
 *
 * @author huldar
 * @date 2020-09-23 09:39
 */
public class ValidParentheses {

    private final Map<Character, Character> allLeft = new HashMap<Character, Character>() {{
        put('(', ')');
        put('[', ']');
        put('{', '}');
    }};

    public boolean isValid(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }

        Stack<Character> stack = new Stack<>();
        for (char c : s.toCharArray()) {
            if (allLeft.containsKey(c)) {
                stack.push(allLeft.get(c));
            } else {
                if (stack.isEmpty() || stack.pop() != c) {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
}
