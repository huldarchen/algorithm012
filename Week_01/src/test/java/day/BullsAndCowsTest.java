package day;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 *
 *
 * @author bingjie.chen
 * @date 2020/7/11
 */
class BullsAndCowsTest {

    String secret = "1234523";
    String guess = "1345126";
    BullsAndCows bullsAndCows = new BullsAndCows();
    @Test
    void getHintUseTwoLoop() {
       assertEquals("2A3B", bullsAndCows.getHintUseTwoLoop(secret, guess));
    }

    @Test
    void getHintUseTwoLoopOptimization() {
        assertEquals("2A3B", bullsAndCows.getHintUseTwoLoopOptimization(secret, guess));
        assertNotEquals("1A2B", bullsAndCows.getHintUseTwoLoopOptimization(secret, guess));
    }

    @Test
    void getHintUseOneLoop() {
        assertEquals("2A3B", bullsAndCows.getHintUseOneLoop(secret, guess));
    }
}
