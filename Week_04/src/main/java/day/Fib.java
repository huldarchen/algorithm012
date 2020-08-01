package day;

/**
 * LeetCode-509: 斐波那契数
 *
 * @author huldar
 * @date 2020-07-28 08:56
 */
public class Fib {

    public int fib(int n) {
        if (n < 2) {
            return n;
        }
        int fn2 = 0, fn1 = 1, fn = 0;
        for (int i = 2; i <= n; i++) {
            fn = fn2 + fn1;
            fn2 = fn1;
            fn1 = fn;
        }
        return fn;
    }
}
