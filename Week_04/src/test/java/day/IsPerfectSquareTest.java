package day;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-08-01 17:45
 */
class IsPerfectSquareTest {

    private  final  IsPerfectSquare isPerfectSquare = new IsPerfectSquare();

    @Test
    void isPerfectSquare() {
        assertTrue(isPerfectSquare.isPerfectSquare(808201));
    }
}
