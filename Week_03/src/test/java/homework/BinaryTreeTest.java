package homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * TODO
 *
 * @author bingjie.chen
 * @date 2020/7/25
 */
class BinaryTreeTest {

    private BinaryTree.TreeNode root = new BinaryTree.TreeNode(1);
    {
        root.left = new BinaryTree.TreeNode(1);
    }
    private final BinaryTree binaryTree = new BinaryTree();

    @Test
    void isValidBST() {
        assertFalse(binaryTree.isValidBSTUseInOrder(root));
    }
}
