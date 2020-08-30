package homework;

/**
 * LeetCode: 位1
 *
 * @author huldar
 * @date 2020-08-30 10:31
 */
public class HammingWeight {
    /**
     * 使用位运算,x & (x - 1) 使最低位的1变为0
     */
    public int hammingWeight(int n) {
        // you need to treat n as an unsigned value
        int count = 0;
        while (n > 0) {
            count++;
            /*
             * n =         001101*
             * n - 1 =     001100
             * n & n - 1 = 001100*
             * n - 1 =     001011
             * n & n - 1 = 001000*
             */
            System.out.println("before" + Integer.toBinaryString(n));
            n = n & (n - 1);
            System.out.println("after" + Integer.toBinaryString(n));
        }
        return count;
    }
}
