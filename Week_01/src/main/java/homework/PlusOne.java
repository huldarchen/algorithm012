package homework;

/**
 * LeetCode-66:加一
 * 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 *
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 *
 * 你可以假设除了整数 0 之外，这个整数不会以零开头
 *
 * @author bingjie.chen
 * @date 2020/7/10
 */
public class PlusOne {

    /**
     * 时间复杂度O(n)
     * 空间复杂度O(1)
     */
    public int[] plusOne(int[] digits) {
        //从后往前遍历,+1,如果是值为10将其置为0,否则直接返回
        for (int i = digits.length - 1; i >=0; i--) {
            if ( ++digits[i] % 10 != 0) {
                return digits;
            }
            digits[i] = 0;
        }

        int[] result = new int[digits.length + 1];
        result[0] = 1;
        return result;
    }
}
