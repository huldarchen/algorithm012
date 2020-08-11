package util;

import java.util.Arrays;

/**
 * 打印二维数组
 *
 * @author huldar
 * @date 2020-08-11 23:21
 */
public class PrintArrays {

    public static void printIntArrays(int[][] dp) {
        for (int[] booleans : dp) {
            System.out.print(Arrays.toString(booleans));
            System.out.println();
        }
        System.out.println();
    }
}
