package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-07-30 22:38
 */
class FindContentChildrenTest {

    private final FindContentChildren findContentChildren = new FindContentChildren();

    @Test
    void findContentChildren() {
        assertEquals(2, findContentChildren.findContentChildren(new int[]{1, 2}, new int[]{1, 2, 3}));
    }
}
