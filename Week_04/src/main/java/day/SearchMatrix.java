package day;

/**
 * LeetCode-74: 搜索矩阵
 *
 * @author huldar
 * @date 2020-08-08 19:49
 */
public class SearchMatrix {

    public boolean searchMatrix(int[][] matrix, int target) {

        int rowLength = matrix.length;
        if (rowLength == 0) {
            return false;
        }

        int colLength = matrix[0].length;

        int left = 0, right = rowLength * colLength - 1;

        int mid, current;

        while (left <= right) {
            mid = left + ((right - left) >> 1);
            current = matrix[mid / colLength][mid % colLength];
            if (current == target) {
                return true;
            } else if (current < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return false;
    }
}
