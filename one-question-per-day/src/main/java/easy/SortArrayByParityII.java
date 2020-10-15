package easy;

/**
 * 按照奇数偶数排序二
 *
 * @author huldar
 * @date 2020-10-15 19:36
 */
public class SortArrayByParityII {

    public int[] sortArrayByParityIIEasy(int[] A) {
        int ans[] = new int[A.length];
        int n = A.length;
        int i = 0, j = n - 1, k = 0;

        while (k < n) {
            if ((A[k] & 1) == 0) {
                ans[i] = A[k];
                i += 2;
            } else {
                ans[j] = A[k];
                j -= 2;
            }
            k++;
        }
        return ans;
    }

    public int[] sortArrayByParityII(int[] A) {
        int n = A.length;
        int i = 0, j = n - 1;

        while (i < n - 1) {
            if ((A[i] & 1) == 0) {
                i += 2;
            } else if ((A[j] & 1) != 0) {
                j -= 2;
            } else {
                int temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        return A;
    }

    private void swap(int[] A, int i, int j) {
        int temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
}
