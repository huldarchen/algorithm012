package day;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO
 *
 * @author bingjie.chen
 * @date 2020/7/25
 */
class ThreeSumTest {

    private final ThreeSum threeSum = new ThreeSum();

    @Test
    void threeSum() {
        threeSum.threeSum(new int[]{-1,0,1,2,-1,-4});
    }
}
