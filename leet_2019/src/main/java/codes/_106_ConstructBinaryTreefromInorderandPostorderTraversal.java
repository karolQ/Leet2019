package codes;

import utils.TreeNode;

public class _106_ConstructBinaryTreefromInorderandPostorderTraversal {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        return helper(postorder.length-1, 0, inorder.length-1, inorder, postorder);
    }

    private TreeNode helper(int postEnd, int inStart, int inEnd, int[] inorder, int[] postorder) {
        if(postEnd < 0 || inStart > inEnd)
            return null;
        TreeNode root = new TreeNode(postorder[postEnd]);
        int rootIndex = 0;
        for(int i = inStart; i <= inEnd; i++) {
            if(inorder[i] == root.val){
                rootIndex = i;
                break;
            }
        }
        root.right = helper(postEnd-1, rootIndex+1, inEnd, inorder, postorder);
        root.left = helper(postEnd-inEnd+rootIndex-1, inStart, rootIndex-1, inorder, postorder);

        return root;
    }
}
