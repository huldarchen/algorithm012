package medium;

/**
 * 搜索二维矩阵
 *
 * @author huldar
 * @date 2020-10-22 11:02
 */
public class SearchA2DMatrix {
    public boolean searchMatrix(int[][] matrix, int target) {
        if (matrix == null || matrix.length == 0) {
            return false;
        }
        int rowLength = matrix.length;
        int colLength = matrix[0].length;

        int left = 0, right = rowLength * colLength - 1, mid;

        while (left <= right) {
            mid = left + ((right - left) >>> 1);
            //TODO 这里是重点 理解行列的取值
            int current = matrix[mid / colLength][mid % colLength];
            if (current == target) {
                return true;
            } else if (current > target) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;

    }
}
