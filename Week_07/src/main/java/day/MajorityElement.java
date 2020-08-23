package day;

/**
 * leetcode:众数
 *
 * @author huldar
 * @date 2020-08-17 21:35
 */
public class MajorityElement {
    public int majorityElement(int[] nums) {
        int count = 0;
        Integer candidate = null;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (candidate == num) ? 1 : -1;
        }
        return candidate;
    }
}
