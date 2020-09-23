package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-09-13 22:45
 */
class FindContentChildrenTest {
    private final FindContentChildren findContentChildren = new FindContentChildren();

    @Test
    void findContentChildren() {
        assertEquals(1, findContentChildren.findContentChildren(new int[]{1, 2, 3}, new int[]{1, 1}));
        assertEquals(2, findContentChildren.findContentChildren(new int[]{10, 9, 8, 7}, new int[]{5, 6, 7, 8}));
    }
}
