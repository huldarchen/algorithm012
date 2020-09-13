package day;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * @author huldar
 * @date 2020-09-11 10:13
 */
class PermuteTest {
    private final Permute permute = new Permute();

    @Test
    void permuteUnique() {
        List<List<Integer>> result = permute.permuteUnique(new int[]{1, 1, 2});

        List<List<Integer>> excepted = new ArrayList<>();
        List<Integer> one = Arrays.asList(1, 1, 2);
        List<Integer> two = Arrays.asList(1, 2, 1);
        List<Integer> three = Arrays.asList(2, 1, 1);
        excepted.add(one);
        excepted.add(two);
        excepted.add(three);

        assertIterableEquals(excepted, result);
    }

    @Test
    void permute() {

        List<List<Integer>> result = this.permute.permute(new int[]{1, 2, 3});
        for (List<Integer> list : result) {
            System.out.println(list);
        }

    }
}
