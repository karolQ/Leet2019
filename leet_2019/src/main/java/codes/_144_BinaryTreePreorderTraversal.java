package codes;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _144_BinaryTreePreorderTraversal {

    // Iteration
    public List<Integer> preorderTraversalIteration(TreeNode root) {
        List<Integer> rs = new ArrayList<>();
        if(root == null) return rs;
        Stack<TreeNode> sk = new Stack<>();
        sk.push(root);
        TreeNode cur = root;
        while(!sk.isEmpty()) {
            cur = sk.pop();
            rs.add(cur.val);
            if(cur.right != null) sk.push(cur.right);
            if(cur.left != null) sk.push(cur.left);
        }
        return rs;
    }

    // Recursion
    public List<Integer> preorderTraversalRecursion(TreeNode root) {
        List<Integer> rs = new ArrayList<>();
        helper(rs, root);
        return rs;
    }

    private void helper(List<Integer> rs, TreeNode root) {
        if(root == null) return;
        rs.add(root.val);
        helper(rs, root.left);
        helper(rs, root.right);
    }
}
