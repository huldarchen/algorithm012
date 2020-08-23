package day;

/**
 * LeetCode:搜索矩阵
 *
 * @author huldar
 * @date 2020-08-17 12:24
 */
public class SearchMatrix {

    public boolean searchMatrixI(int[][] matrix, int target) {
        int rowLength = matrix.length;
        if (rowLength == 0) {
            return false;
        }
        int colLength = matrix[0].length;
        int left = 0, right = rowLength * colLength - 1, mid;
        while (left <= right) {
            mid = left + ((right - left) >>> 1);
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

    /**
     * 双指针
     **/
    public boolean searchMatrixUseBinarySearch(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }

        int row = 0, col = matrix[0].length - 1;
        while (row <= matrix.length - 1 && col >= 0) {
            if (target > matrix[row][col]) {
                row++;
            } else if (target < matrix[row][col]) {
                col--;
            } else {
                return true;
            }
        }
        return false;
    }


    /**
     * 二分查找的思想: 目标值和中点值进行比较,然后可以丢弃一半的元素
     * 这个问题就可以转换成 如何进行丢弃
     **/
    public boolean searchMatrixUseBinarySearch2(int[][] matrix, int target) {
        if (matrix.length == 0 || matrix[0].length == 0) {
            return false;
        }
        return searchMatrixHelper(matrix, 0, 0, matrix.length - 1, matrix[0].length - 1, matrix.length - 1, matrix[0].length - 1, target);
    }

    private boolean searchMatrixHelper(int[][] matrix, int row1, int col1, int row2, int col2, int rowLength, int colLength, int target) {
        // 递归的出口
        if (col1 > colLength || row1 > rowLength) {
            return false;
        }
        if (row1 == row2 && col1 == col2) {
            return matrix[row1][col1] == target;
        }

        int rowMid = (row2 + row1) >>> 1;
        int colMid = (col2 + col1) >>> 1;

        if (matrix[rowMid][colMid] == target) {
            return true;
        } else if (matrix[rowMid][colMid] < target) {
            // 中间值小于 target 则从右上 左下 右下三个矩阵中获取
            return searchMatrixHelper(matrix, row1, colMid + 1, rowMid, col2, row2, col2, target) ||
                    searchMatrixHelper(matrix, rowMid + 1, col1, row2, colMid, row2, col2, target) ||
                    searchMatrixHelper(matrix, rowMid + 1, colMid + 1, row2, col2, row2, col2, target);
        } else {
            return searchMatrixHelper(matrix, row1, colMid + 1, rowMid, col2, row2, col2, target) ||
                    searchMatrixHelper(matrix, rowMid + 1, col1, row2, colMid, row2, col2, target) ||
                    searchMatrixHelper(matrix, row1, col1, rowMid, colMid, row2, col2, target);
        }
    }


}
