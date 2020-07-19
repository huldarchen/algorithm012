package vo;

import java.util.List;

/**
 * N叉树
 *
 * @author bingjie.chen
 * @date 2020/7/19
 */
public class NTreeNode {

    public int val;

    public List<NTreeNode> children;

    public NTreeNode(int val, List<NTreeNode> children) {
        this.val = val;
        this.children = children;
    }
}
