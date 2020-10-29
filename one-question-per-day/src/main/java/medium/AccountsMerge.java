package medium;


import java.util.*;

/**
 * 账户合并
 *
 * @author huldar
 * @date 2020-10-26 13:47
 */
public class AccountsMerge {

    public List<List<String>> accountsMerge(List<List<String>> accounts) {
        Map<String, Integer> map = new HashMap<>();
        return null;

    }

    private class UnionFind {
        int[] bc;

        public UnionFind(int n) {
            bc = new int[n];
            init();
        }

        private void init() {
            for (int i = 0; i < bc.length; i++) {
                bc[i] = -1;
            }
        }

        public int find(int x) {
            if (bc[x] < 0) {
                return x;
            } else {
                bc[x] = find(bc[x]);
            }
            return bc[x];
        }

        public void combine(int x, int y) {
            int xx = find(x);
            int yy = find(y);
            if (xx != yy) {
                bc[yy] = xx;
            }
        }
    }
}
