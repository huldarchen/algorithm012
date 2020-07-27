package day;

/**
 * LeetCode-17.09: 第k个数
 * <p>
 * 1. 三指针 类似丑数
 * 2. 动态规划 //TODO
 *
 * @author bingjie.chen
 * @date 2020/7/26
 */
public class MagicNumber {
    public int getKthMagicNumber(int k) {
        int[] magic = new int[k];

        //三指针,三因子
        int index3 = 3, index5 = 5, index7 = 7;
        int factor3 = 3, factor5 = 5, factor7 = 7;
        for (int i = 0; i < k; i++) {
            magic[i] = Math.min(Math.min(factor3, factor5), factor7);
            if (magic[i] == factor3) {
                factor3 = 3 * magic[++index3];
            }
            if (magic[i] == factor5) {
                factor5 = 5 * magic[++index5];
            }
            if (magic[i] == factor7) {
                factor7 = 7 * magic[++index7];
            }
        }
        return magic[k - 1];
    }
}
