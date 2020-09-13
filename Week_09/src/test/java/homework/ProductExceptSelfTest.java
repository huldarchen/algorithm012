package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-09-12 23:29
 */
class ProductExceptSelfTest {
    private final ProductExceptSelf productExceptSelf = new ProductExceptSelf();

    @Test
    void productExceptSelf2() {
        assertArrayEquals(new int[]{24,12,8,6}, productExceptSelf.productExceptSelf2(new int[]{1, 2, 3, 4}));
    }
}
