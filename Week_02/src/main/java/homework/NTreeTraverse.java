package homework;

import vo.singly.NTreeNode;

import java.util.*;

/**
 * N叉树的遍历
 *
 * @author bingjie.chen
 * @date 2020/7/19
 */
public class NTreeTraverse {

    /** N叉树的前序遍历 */
    public List<Integer> preorderTraversal(NTreeNode root) {
        List<Integer> res = new ArrayList<>();
        preorderTraversalLoop(root, res);
        return res;
    }

    private void preorderTraversalLoop(NTreeNode nTreeNode, List<Integer> res) {
        if (nTreeNode == null) {
            return;
        }
        res.add(nTreeNode.val);
        for (NTreeNode node : nTreeNode.children) {
            preorderTraversalLoop(node, res);
        }
    }

    /** N叉树的后序遍历 */
    public List<Integer> postOrderTraversal(NTreeNode root) {
        List<Integer> res = new ArrayList<>();
        postOrderTraversalLoop(root, res);
        return res;
    }

    private void postOrderTraversalLoop(NTreeNode nTreeNode, List<Integer> res) {
        if (nTreeNode == null) {
            return;
        }
        for (NTreeNode children : nTreeNode.children) {
            postOrderTraversalLoop(children, res);
        }
        res.add(nTreeNode.val);
    }

    /** N叉树的层级遍历 - 广度优先 */
    public List<List<Integer>> levelOrderTraversal(NTreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        Queue<NTreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            List<Integer> level = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                NTreeNode node = queue.remove();
                if (node != null) {
                    queue.addAll(node.children);
                    level.add(node.val);
                }
            }
            result.add(level);
        }
        return result;
    }

    /** 广度优先简化 */
    public List<List<Integer>> levelOrderTraversalSimplify(NTreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        List<NTreeNode> previousLayer = Collections.singletonList(root);

        while (!previousLayer.isEmpty()) {
            List<NTreeNode> currentLayer = new ArrayList<>();
            List<Integer> previousVals = new ArrayList<>();
            for (NTreeNode node : previousLayer) {
                currentLayer.addAll(node.children);
                previousVals.add(node.val);
            }
            previousLayer = currentLayer;
            result.add(previousVals);
        }
        return result;
    }

    public List<List<Integer>> levelOrderTraversalUseRecursive(NTreeNode root) {
        List<List<Integer>> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        recursiveNode(result, root, 0);
        return result;
    }

    private void recursiveNode(List<List<Integer>> result, NTreeNode node, int level) {
        if (result.size() <= level) {
            result.add(new ArrayList<>());
        }
        result.get(level).add(node.val);
        for (NTreeNode child : node.children) {
            recursiveNode(result, child, level + 1);
        }
    }

}
