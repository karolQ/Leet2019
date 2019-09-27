## Questions: 
https://leetcode.com/problems/kth-smallest-element-in-a-bst/

## Keys
1. Binary Search Tree(BST): 
    - The left subtree of a node contains only nodes with keys less than the node's key.
    - The right subtree of a node contains only nodes with keys greater than the node's key.
    - Both the left and right subtrees must also be binary search trees.
2. The following type is not a valid BST:
![](../resources/98_not_bst_3.png)

## Corner Cases:
1. null => -1

## Solutions:
1. Iteration/Recursion
2. Inorder Traversal (+ Stack)
    - Traversal:
        ![](../resources/145_transverse.png)

#### Related problems:
[94. Binary Tree Inorder Traversal](https://leetcode.com/problems/binary-tree-inorder-traversal/)  
[98. Validate Binary Search Tree](https://leetcode.com/problems/validate-binary-search-tree/)
