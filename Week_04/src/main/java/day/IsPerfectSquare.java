package day;

/**
 * LeetCode-367: 有效完全平方数
 *
 * @author huldar
 * @date 2020-08-01 17:35
 */
public class IsPerfectSquare {

    public boolean isPerfectSquare(int num) {
        if (num < 2) {
            return true;
        }
        long low = 0, high = num / 2, mid, result;
        while (low <= high) {
            mid = low + (high - low) / 2;
            result = mid * mid;
            System.out.println(result);
            if (result == num) {
                return true;
            }
            if (result > num) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return  false;
    }
}
