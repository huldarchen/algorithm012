package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-08-11 12:28
 */
class CoinChangeTest {
    private final CoinChange coinChange = new CoinChange();

    @Test
    void coinChangeUseDPUp2Down() {
        coinChange.coinChangeUseDPUp2Down(new int[]{1, 2, 5}, 11);
    }
}
