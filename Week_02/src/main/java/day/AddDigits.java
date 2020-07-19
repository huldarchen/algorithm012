package day;

/**
 * LeetCode
 *
 * @author bingjie.chen
 * @date 2020/7/17
 */
public class AddDigits {
    public int addDigitsUseLoop(int num) {
        if (num < 10) {
            return num;
        }
        int next = 0;
        while (num != 0) {
            next = next + num % 10;
            num /= 10;
        }
        return addDigitsUseLoop(next);
    }

}
