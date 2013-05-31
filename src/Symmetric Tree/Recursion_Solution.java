/*
Given a binary tree, check whether it is a mirror of itself (ie, symmetric around its center).

For example, this binary tree is symmetric:

    1
   / \
  2   2
 / \ / \
3  4 4  3
But the following is not:

    1
   / \
  2   2
   \   \
   3    3
Note:
Bonus points if you could solve it both recursively and iteratively.

confused what "{1,#,2,3}" means? > read more on how binary tree is serialized on OJ.
*/
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSymmetric(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null)    return true;
        
        if(root.left == null && root.right == null) return true;
        
        if(root.left == null || root.right == null) return false;
        
        return isSymmetricHelper(root.left, root.right);
        
        
    }
    
    public boolean isSymmetricHelper(TreeNode left, TreeNode right){
        if(left == null && right  == null)  return true;
        if(left == null || right == null)   return false;
        if(left.val != right.val)   return false
        boolean inner = isSymmetricHelper(left.right, right.left);
        boolean outer = isSymmetricHelper(left.left, right.right);
        
        return inner && outer;
    }
}