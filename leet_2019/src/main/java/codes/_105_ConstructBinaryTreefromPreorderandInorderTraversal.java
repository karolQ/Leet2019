package codes;

import utils.TreeNode;

public class _105_ConstructBinaryTreefromPreorderandInorderTraversal {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        return helper(0, 0, inorder.length-1, preorder, inorder);
    }

    private TreeNode helper(int preStart, int inStart, int inEnd, int[] preorder, int[] inorder) {
        if(preStart > preorder.length-1 || inStart > inEnd)
            return null;
        TreeNode root = new TreeNode(preorder[preStart]);
        int rootIndex = 0;
        for(int i = inStart; i <= inEnd; i++) {
            if(inorder[i] == root.val) {
                rootIndex = i;
                break;
            }
        }
        root.left = helper(preStart+1, inStart, rootIndex-1, preorder, inorder);
        root.right = helper(preStart + rootIndex - inStart + 1, rootIndex+1, inEnd, preorder, inorder);
        return root;
    }
}
