package homework;

/**
 * 树的遍历
 *
 * @author huldar
 * @date 2020-09-13 13:31
 */
public class TreeOrder {

    public static void main(String[] args) {
        TreeNode root = new TreeNode("A");

        TreeNode leftRoot = new TreeNode("B");
        TreeNode c = new TreeNode("C");
        leftRoot.left = c;
        c.left = new TreeNode("D");
        root.left = leftRoot;

        TreeNode f = new TreeNode("F");
        f.left = new TreeNode("G");

        TreeNode rightRoot = new TreeNode("E");
        rightRoot.left = f;
        rightRoot.right = new TreeNode("H");
        root.right = rightRoot;

        preOrder(root);
        System.out.println();
        inOrder(root);
        System.out.println();
        afterOrder(root);


    }

    public static void preOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val);
        preOrder(root.left);
        preOrder(root.right);
    }
    public static void inOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        preOrder(root.left);
        System.out.print(root.val);
        preOrder(root.right);
    }

    public static void afterOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        preOrder(root.left);
        preOrder(root.right);
        System.out.print(root.val);
    }

    static class TreeNode {
        String val;
        TreeNode left;
        TreeNode right;

        public TreeNode(String val) {
            this.val = val;
        }

        @Override
        public String toString() {
            return val;
        }
    }
}
