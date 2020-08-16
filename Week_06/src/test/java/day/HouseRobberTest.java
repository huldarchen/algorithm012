package day;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-08-12 22:13
 */
class HouseRobberTest {
    private final HouseRobber houseRobber = new HouseRobber();

    @Test
    void rob2() {
        assertEquals(4, houseRobber.rob2(new int[]{1, 2, 3, 1}));
        assertEquals(1, houseRobber.rob2(new int[]{1}));
        assertEquals(2, houseRobber.rob2(new int[]{1, 2}));
    }
}
