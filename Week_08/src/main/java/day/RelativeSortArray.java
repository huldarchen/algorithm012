package day;

import java.util.HashMap;
import java.util.Map;

/**
 * LeetCode:排序
 *
 * @author huldar
 * @date 2020-08-29 23:55
 */
public class RelativeSortArray {
    private Map<Integer, Integer> record;

    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        record = new HashMap<>(arr2.length);
        for (int i = 0; i < arr2.length; i++) {
            record.put(arr2[i], i);
        }
        quickSort(arr1, 0, arr1.length - 1);
        return arr1;
    }

    public void quickSort(int[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int j = partition(arr, lo, hi);
        quickSort(arr, lo, j - 1);
        quickSort(arr, j + 1, hi);
    }

    public int partition(int[] arr, int lo, int hi) {
        int temp = arr[hi];
        int j = lo;
        for (int i = lo; i < hi; i++) {
            if (less(arr[i], temp)) {
                swap(arr, i, j++);
            }
        }
        swap(arr, j, hi);
        return j;
    }

    public void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public boolean less(int num1, int num2) {
        if (record.containsKey(num1) && record.containsKey(num2)) {
            return record.get(num1) < record.get(num2);
        } else if (record.containsKey(num1)) {
            return true;
        } else if (record.containsKey(num2)) {
            return false;
        } else {
            return num1 < num2;
        }

    }

}
