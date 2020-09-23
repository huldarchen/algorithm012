package homework;

import java.util.Arrays;

/**
 * 分发饼干
 *
 * @author huldar
 * @date 2020-09-13 22:43
 */
public class FindContentChildren {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int index = 0;
        // 遍历饼干
        for (int j : s) {
            if (index < g.length && j >= g[index]) {
                index++;
            }
        }
        return index;
    }
}
