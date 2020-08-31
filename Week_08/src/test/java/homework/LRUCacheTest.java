package homework;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-08-31 22:54
 */
class LRUCacheTest {
    private final LRUCache lruCache = new LRUCache(3);

    @BeforeEach
    void setUp() {
        lruCache.put(1, 2);
        lruCache.put(3, 2);
        lruCache.put(4, 2);
    }

    @Test
    void get() {
        assertEquals(-1, lruCache.get(2));
        assertEquals(2, lruCache.get(4));
    }

    @Test
    void put() {
        lruCache.put(2, 2);
        assertEquals(-1, lruCache.get(1));
    }
}
