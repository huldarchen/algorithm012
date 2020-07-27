package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * 全排列测试
 *
 * @author bingjie.chen
 * @date 2020/7/26
 */
class PermuteTest {

    private final Permute permute = new Permute();

    @Test
    void permute() {
        permute.permute(new int[]{1, 2, 3, 4});
    }
}
