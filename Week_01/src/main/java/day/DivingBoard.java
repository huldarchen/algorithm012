package day;

/**
 * 每日一题:跳水板问题
 * 你正在使用一堆木板建造跳水板。有两种类型的木板，其中长度较短的木板长度为shorter，长度较长的木板长度为longer。你必须正好使用k块木板。编写一个方法，生成跳水板所有可能的长度。
 *
 * @author bingjie.chen
 * @date 2020/7/8
 */
public class DivingBoard {
    /**
     * 时间复杂度O(n)
     * 空间复杂度O(1)
     */
    public int[] divingBoardByDiff(int shorter, int longer, int k) {
        //边界条件
        if (k == 0) {
            return new int[0];
        }
        //特殊情况
        if (shorter == longer) {
            return new int[]{longer * k};
        }

        int diff = longer - shorter;
        int[] result = new int[k + 1];
        for (int i = 0; i <= k; i++) {
            result[i] = shorter * k + diff * i;
        }
        return result;
    }
}
