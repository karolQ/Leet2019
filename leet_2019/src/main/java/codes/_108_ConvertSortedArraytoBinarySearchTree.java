package codes;

import utils.TreeNode;

public class _108_ConvertSortedArraytoBinarySearchTree {
    public TreeNode sortedArrayToBST(int[] nums) {
        return helper(0, nums.length-1, nums);
    }

    private TreeNode helper(int start, int end, int[] nums) {
        if(start > end)
            return null;
        int rootIndex = (end-start)%2 == 0 ? (start + (end-start) / 2) : (start + (end-start) / 2 + 1);
        TreeNode root = new TreeNode(nums[rootIndex]);

        root.left = helper(start, rootIndex-1, nums);
        root.right = helper(rootIndex+1, end, nums);
        return root;
    }
}
