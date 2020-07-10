package leetcode;

/**
 * LeetCode-70:爬楼梯
 *  每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 * @author bingjie.chen
 * @date 2020/7/10
 */
public class ClimbStairs {
    /**
     * 时间复杂度O(n)
     * 空间复杂度O(1)
     */
    public int climbStairsUseLoop(int n) {
        //该问题可以分解为在前面的基础上,到n阶台阶的方法 上1阶 和 上2阶

        if (n <= 2) {
            return n;
        }
        //需要记录的3个值
        int fn1 = 1, fn2 = 2, fn3 = 3;
        // 从3开始循环
        for (int i = 3; i < n; i++) {
            fn3 = fn1 + fn2;
            fn1 = fn2;
            fn2 = fn3;
        }
        return fn3;
    }

    /**
     * 最原始的递归
     * 在n很大的时候,程序会超时
     * 时间复杂度O(2^n)
     * 空间复杂度O(n)??
     */
    public int climbStairsUseRecursive(int n) {
        //递归的出口,当n为负数的时候返回1
        if (n <= 1) {
            return 1;
        }
        if (n < 3) {
            return n;
        }
        return climbStairsUseRecursive(n - 1) + climbStairsUseRecursive(n-2);
    }

    //递归的优化-尾递归


}
