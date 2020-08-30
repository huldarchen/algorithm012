package day;

/**
 * @author huldar
 * @date 2020-08-26 19:29
 */
public class JudgeSquareSum {
    public boolean judgeSquareSum(int c) {
        if (c < 0) {
            return false;
        }
        int start = 0, end = (int) Math.sqrt(c);
        while (start <= end) {
            int curr = start * start + end * end;
            if (curr == c) {
                return true;
            } else if (curr > c) {
                end--;
            } else {
                start ++;
            }
        }
        return false;
    }
}
