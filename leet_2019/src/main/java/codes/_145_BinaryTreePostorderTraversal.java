package codes;

import utils.TreeNode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class _145_BinaryTreePostorderTraversal {

    // Iteration
    public List<Integer> postorderTraversalIteration(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if(root == null) return res;
        TreeNode cur = root;
        Stack<TreeNode> st = new Stack<>();
        st.push(cur);
        while(!st.isEmpty()) {
            cur = st.pop();
            res.add(0, cur.val);
            if(cur.left != null) st.push(cur.left);
            if(cur.right != null) st.push(cur.right);
        }
        return res;
    }

    // Recursion
    public List<Integer> postorderTraversalRecrusion(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        helper(res, root);
        return res;
    }

    private void helper(List<Integer> res, TreeNode root) {
        if(root == null) return;

        helper(res, root.left);
        helper(res, root.right);
        res.add(root.val);
    }
}
