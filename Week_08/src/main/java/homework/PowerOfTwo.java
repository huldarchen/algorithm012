package homework;

/**
 * LeetCode:是否是2的幂次
 *
 * @author huldar
 * @date 2020-08-30 10:54
 */
public class PowerOfTwo {
    public boolean isPowerOfTwo(int n) {
        // 二的幂次 说明在整数中有且只有1个1
        return n != 0 && (n & (n - 1)) == 0;
    }
}
