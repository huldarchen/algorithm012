package day;

import java.util.Stack;

/**
 * LeetCode-1021:删除最外层括号
 * <p>
 * 1.使用指针
 * 2.使用栈
 *
 * @author bingjie.chen
 * @date 2020/7/14
 */
public class RemoveOuterParentheses {
    /**
     * 使用栈,当时左括号开始入栈,并记录入栈的指针start.当时右括号就出栈,当栈为空的时候 拼接[start + 1, end)
     */
    public String  removeOuterParenthesesUseStack(String s) {
            StringBuilder builder = new StringBuilder();
            Stack<Character> stack = new Stack<>();
            int start = 0;
            //起始位置标记
            boolean flag = false;
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                if (c == '(') {
                    stack.push(c);
                    if (!flag) {
                        start = i;
                        flag = true;
                    }
                }
                if (c == ')') {
                    stack.pop();
                    if (stack.isEmpty()) {
                        builder.append(s.substring(start + 1, i));
                        flag = false;
                    }
                }
            }
            return builder.toString();
        }

        /**
         * 巧妙的使用计数器 正负
         */
        public String removeOuterParenthesesUseCounter(String s) {
            StringBuilder result = new StringBuilder();
            int count = 0;
            for (char c : s.toCharArray()) {
            if (c == ')') --count;
            if (count > 0) result.append(c);
            if (c == '(') ++count;
        }
        return result.toString();
    }
}
