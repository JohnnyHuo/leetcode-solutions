// Given a binary tree, determine if it is a valid binary search tree (BST).
//************下面这种不对, 因为多次调用isValidBST()的时候, lastInput始终是连贯的, 所以会出错***********
/**
 * Definition for binary tree
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
/*
public class Solution {
    public static int lastInput = Integer.MIN_VALUE;
    public static boolean isValidBST(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null)    return true;
        
        if(!isValidBST(root.left))  return false;
        
        if(root.val <= lastInput)    return false;
        lastInput = root.val;
        
        if(!isValidBST(root.right)) return false;
        
        return true;
    }
}
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

// 这样就解决了上面的问题, 其实只要保证每次instantiate new instance 时, 用来比较的variable不会被初始化就行了, 所以下面把需要递归的部分单独写出来.
/*
public class Solution {
    //Integer prev;
    int prev;
    public boolean isValidBST(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null){
            return true;
        }
        prev = Integer.MIN_VALUE;
        return inOrder(root);
    }
    
    private boolean inOrder(TreeNode root){
        if (root == null){
            return true;
        }
        if (!inOrder(root.left)){
            return false;
        }
        if (root.val <= prev){
            return false;
        }
        prev = root.val;
        return inOrder(root.right);
    }
}
*/
//+===============第二天又写了一个, 也是对的=====================================
public class Solution {
    int lastVal;
    public boolean isValidBST(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
    
    lastVal = Integer.MIN_VALUE;
    
    return checkBST(root);
    
    }
    
    private boolean checkBST(TreeNode root){
        
        if(root == null)    return true;
        
        if(!checkBST(root.left))    return false;
        
        if(root.val <= lastVal)     return false;
        lastVal = root.val;
        
        if(!checkBST(root.right))   return false;
        
        return true;
    }
}
