package homework;


import java.util.Arrays;

/**
 * LeetCode-455:分发饼干
 *
 * @author huldar
 * @date 2020-07-30 22:36
 */
public class FindContentChildren {


    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int index1 = 0, index2 = 0;
        while (index1 < g.length && index2 < s.length) {
            if (s[index2] >= g[index1]) {
                index1++;
            }
            index2++;
        }
        return index1;
    }
}
