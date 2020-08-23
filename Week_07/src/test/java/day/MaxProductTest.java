package day;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * @author huldar
 * @date 2020-08-20 12:29
 */
class MaxProductTest {
    private final MaxProduct maxProduct = new MaxProduct();

    @Test
    void maxProductDpOrigin() {
        assertEquals(6, maxProduct.maxProductDpOrigin(new int[]{2, 3, -2, 4}));
        assertEquals(0, maxProduct.maxProductDpOrigin(null));
        assertEquals(-1, maxProduct.maxProductDpOrigin(new int[]{-1}));
    }

    @Test
    void maxProductDpOption() {
        assertEquals(6, maxProduct.maxProductDpOption(new int[]{2, 3, -2, 4}));
        assertEquals(0, maxProduct.maxProductDpOption(null));
        assertEquals(-1, maxProduct.maxProductDpOption(new int[]{-1}));
    }
}
