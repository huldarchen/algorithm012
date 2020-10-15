package easy;

/**
 * 有序数组的平方
 *
 * @author huldar
 * @date 2020-10-15 19:50
 */
public class SortedSquares {

    public int[] sortedSquares(int[] A) {
        int l = 0, r = A.length - 1, k = r;
        int[] result = new int[A.length];
        while (l <= r) {
            if (A[l] + A[r] > 0) {
                result[k--] = A[r] * A[r];
                r--;
            } else {
                result[k--] = A[l] * A[l];
                l++;
            }
        }
        return result;

    }

}
