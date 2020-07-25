package homework;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * N叉树的遍历
 *
 * @author bingjie.chen
 * @date 2020/7/25
 */
public class NTree {

    public List<List<Integer>> levelOrderUseRecursion(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root != null) {
            return recursion(result, root, 0);
        }
        return result;
    }

    private List<List<Integer>> recursion(List<List<Integer>> result, Node root, int layer) {
        //1.terminal
        if (root == null || root.children == null) {
            return result;
        }
        //2.current logic
        if (result.size() < layer) {
            result.add(new ArrayList<>());
        }
        result.get(layer).add(root.val);
        //3.drill down
        for (Node child : root.children) {
            recursion(result, child, layer + 1);
        }
        return result;
        // restore status
    }

    public List<List<Integer>> levelOrderUseLoop(Node root) {
        List<List<Integer>> result = new ArrayList<>();
        //边界条件判断
        if (root == null) {
            return result;
        }
        Queue<Node> levelNodes = new LinkedList<>();
        levelNodes.add(root);

        while (!levelNodes.isEmpty()) {
            List<Integer> levelVal = new ArrayList<>();
            int size = levelNodes.size();
            for (int i = 0; i < size; i++) {
                Node node = levelNodes.poll();
                if (node != null) {
                    levelVal.add(node.val);
                    levelNodes.addAll(node.children);
                }
            }
            result.add(levelVal);
        }
        return result;

    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, List<Node> children) {
            this.val = val;
            this.children = children;
        }
    }
}
