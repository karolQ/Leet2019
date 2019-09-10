package codes;

import utils.TreeNode;

import java.util.Stack;

public class _230_KthSmallestElementinaBST {
    public int kthSmallest(TreeNode root, int k) {
        if(root == null) return -1;
        Stack<TreeNode> stack = new Stack<>();

        while(root != null || !stack.isEmpty()) {
            while(root != null) {
                stack.push(root);
                root = root.left;
            }

            root = stack.pop();
            if(--k == 0) break;
            root = root.right;
        }
        return root.val;
    }
}
