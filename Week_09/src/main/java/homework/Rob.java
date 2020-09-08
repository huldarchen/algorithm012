package homework;

/**
 * 打家劫舍
 *
 * @author huldar
 * @date 2020-09-07 20:13
 */
public class Rob {

    /**
     * 你是一个专业的小偷，计划偷窃沿街的房屋。每间房内都藏有一定的现金，影响你偷窃的唯一制约因素就是相邻的房屋装有相互连通的防盗系统，
     * 如果两间相邻的房屋在同一晚上被小偷闯入，系统会自动报警。
     * <p>
     * 给定一个代表每个房屋存放金额的非负整数数组，计算你 不触动警报装置的情况下 ，一夜之内能够偷窃到的最高金额。
     */
    public int robEasy(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int pre = 0, curr = 0;
        for (int num : nums) {
            int tmp = curr;
            curr = Math.max(curr, pre + num);
            pre = tmp;
        }
        return curr;
    }
    /** 房屋围成一圈 */
    public int rob2(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int length = nums.length;
        if (length == 1) {
            return nums[0];
        }
        // 首位相连那么就有2中情况,要么偷首 要么偷尾
        return Math.max(helper1(nums, 0, length - 1), helper1(nums, 1, length));
    }

    private int helper1(int[] nums, int start, int end) {
        int pre = 0, curr = 0;
        for (int i = start; i < end; i++) {
            int tmp = curr;
            curr = Math.max(curr, pre + nums[start]);
            pre = tmp;
        }
        return curr;
    }
    /** 房屋是一棵树 */
    public int rob3(TreeNode root) {
        int[] result = robInternal(root);
        return Math.max(result[0], result[1]);
    }

    private int[] robInternal(TreeNode node) {
        if (node == null) {
            return new int[2];
        }
        int[] result = new int[2];

        int[] left = robInternal(node.left);
        int[] right = robInternal(node.right);

        result[0] = Math.max(left[0], left[1]) + Math.max(right[0], right[1]);
        result[1] = left[0] + right[0] + node.val;

        return result;
    }


    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        public TreeNode(int val) {
            this.val = val;
        }
    }

}
