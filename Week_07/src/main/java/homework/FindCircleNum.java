package homework;

import java.util.Arrays;

/**
 * LeetCode:朋友圈[并查集]
 *
 * @author huldar
 * @date 2020-08-23 17:59
 */
public class FindCircleNum {
    public int findCircleNum(int[][] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }
        int rowLength = nums.length;
        int[] colLength = nums[0];

        int[] parent = new int[rowLength];
        Arrays.fill(parent, -1);

        for (int row = 0; row < rowLength; row++) {
            for (int col = 0; col < colLength.length; col++) {
                if (nums[row][col] == 1 && row != col) {
                    union(parent, row, col);
                }
            }
        }

        int count = 0;
        for (int value : parent) {
            if (value == -1) {
                count++;
            }
        }
        return count;
    }

    private void union(int[] parent, int row, int col) {
        int rowSet = find(parent, row);
        int colSet = find(parent, col);
        if (rowSet != colSet) {
            parent[rowSet] = colSet;
        }
    }

    private int find(int[] parent, int x) {
        if (parent[x] == -1) {
            return x;
        }

        return find(parent, parent[x]);
    }
}
