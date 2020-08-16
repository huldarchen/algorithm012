package day;

import org.junit.jupiter.api.Test;

import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-07-28 09:04
 */
class FibTest {
    private final Fib fib = new Fib();
    @Test
    void fib() {
        assertEquals(3, fib.fib(4));
    }
}
