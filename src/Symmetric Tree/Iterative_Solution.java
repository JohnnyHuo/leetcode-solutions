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
        Deque<TreeNode> left = new LinkedList<TreeNode>();
        Deque<TreeNode> right = new LinkedList<TreeNode>();
        left.addLast(root.left);
        right.addLast(root.right);
        while(left.size() != 0){
            TreeNode l = left.pollLast();
            TreeNode r = right.pollLast();
            if(l.val != r.val)  return false;
            if(!equal(l.left, r.right) || !equal(l.right, r.left)){
                return false;
            }
            
            if(l.left != null)  left.addLast(l.left);
            if(l.right != null)  left.addLast(l.right);
            if(r.right != null)  right.addLast(r.right);
            if(r.left != null)  right.addLast(r.left);
        }
        
        return true;

    }
    
    public boolean equal(TreeNode l, TreeNode r){
        if(l == null && r == null ) return true;
        if(l == null || r == null)  return false;  //.......这一句不能省啊........
        if(l.val != r.val)  return false;
        
        return true;
    }
}