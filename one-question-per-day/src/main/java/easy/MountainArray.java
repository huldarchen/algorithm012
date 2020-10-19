package easy;

/**
 * 山脉数组的峰值索引
 *
 * @author huldar
 * @date 2020-10-16 11:31
 */
public class MountainArray {
    public int peakIndexInMountainArray(int[] arr) {
        if (arr == null || arr.length < 3) {
            return -1;
        }
        int index = 0;
        while (index < arr.length) {
            if (arr[index] > arr[index + 1]) {
                break;
            }
            index++;
        }
        return index;
    }
}
