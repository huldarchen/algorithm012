package homework;

/**
 * leetCode-283:
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 * Note:
 * 1. 必须在原数组上操作,不能拷贝额外的数组
 * 2. 尽量减少操作次数
 *
 * @author bingjie.chen
 * @date 2020/7/8
 */
public class MoveZeros {
    /**
     * 使用一个指针来表示0的位置,通过一次遍历得解
     * 时间复杂度是O(n)
     * 空间复杂度是O(1)
     */
    public void moveZeroesUseIndex(int[] nums) {
        //鲁棒性
        if (nums == null || nums.length <= 1) {
            return;
        }
        //0的位置
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) {
                    nums[i] = 0;
                }
                j++;
            }
        }
    }

    /**
     * 两次遍历,第一次遍历把非零的都赋值值j,第二次遍历从j开始赋值为0
     * 时间复杂度 O(n)
     * 空间复杂度 O(1)
     */
    public void moveZeroesUseTowLoop(int[] nums) {
        //鲁棒性
        if (nums == null || nums.length <= 1) {
            return;
        }
        //第一次遍历,将非零的元素从0开始赋值给nums[j]
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j++] = nums[i];
            }
        }
        //第二次遍历,从j开始赋值为0
        for (int i = j; i < nums.length; i++) {
            nums[i] = 0;
        }
    }
}
