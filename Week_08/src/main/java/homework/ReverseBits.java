package homework;

/**
 * LeetCode:颠倒二进制
 *
 * @author huldar
 * @date 2020-08-30 10:58
 */
public class ReverseBits {

    public int reverseBits(int n) {
        System.out.println("revers before: " + Integer.toBinaryString(n));
        // 32位
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result = (result << 1) + (n & 1);
            n >>= 1;
        }
        System.out.println("revers after: " + Integer.toBinaryString(result) + ", length is " + Integer.toBinaryString(result).length());
        return result;
    }
}
