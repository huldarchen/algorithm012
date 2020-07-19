package homework;

import vo.BinaryTreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 树的遍历
 *
 * @author bingjie.chen
 * @date 2020/7/19
 */
public class TreeTraverse {
    /** 中序遍历 */
    public List<Integer> inorderTraversal(BinaryTreeNode root) {
        List<Integer> result = new ArrayList<>();
        if (root == null) {
            return result;
        }
        inorderTraversalLoop(root, result);
        return result;
    }

    private void inorderTraversalLoop(BinaryTreeNode treeNode, List<Integer> res) {
        if (treeNode == null) {
            return;
        }
        inorderTraversalLoop(treeNode.left, res);
        res.add(treeNode.val);
        inorderTraversalLoop(treeNode.right, res);
    }

    public List<Integer> preorderTraversal(BinaryTreeNode root) {
        List<Integer> result = new ArrayList<>();
        preorderTraversalLoop(root, result);
        return result;
    }

    private void preorderTraversalLoop(BinaryTreeNode treeNode, List<Integer> result) {
        if (treeNode == null) {
            return;
        }
        result.add(treeNode.val);
        preorderTraversalLoop(treeNode.left, result);
        preorderTraversalLoop(treeNode.right, result);
    }

    public List<Integer> postOrderTraversal(BinaryTreeNode root) {
        List<Integer> result = new ArrayList<>();
        postOrderTraversalLoop(root, result);
        return result;
    }

    private void postOrderTraversalLoop(BinaryTreeNode treeNode, List<Integer> result) {
        if (treeNode == null) {
            return;
        }
        postOrderTraversalLoop(treeNode.left, result);
        postOrderTraversalLoop(treeNode.right, result);
        result.add(treeNode.val);
    }
}
