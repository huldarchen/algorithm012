package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-09-08 10:30
 */
class RobTest {

    private final Rob rob = new Rob();

    @Test
    void robEasy() {
        int result = rob.robEasy(new int[]{1, 2, 3, 1});
        assertEquals(4, result);
    }

    @Test
    void rob2() {
        int result = rob.rob2(new int[]{2, 3, 2});
        assertEquals(3, result);
    }
}
