package codes;

import utils.TreeNode;

public class _104_MaximumDepthofBinaryTree {
    public int maxDepth(TreeNode root) {
        if(root == null) return 0;
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
