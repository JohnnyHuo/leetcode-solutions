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
    public int sumNumbers(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null)    return 0;
        //ArrayList<Integer> helper = new ArrayList<Integer>();
        return sumNumbers(root, 0);
    }
    
    public int sumNumbers(TreeNode root, int sum){

        if(root == null)    return 0;
        
        sum = sum * 10 + root.val;
        //base case
        if(root.left == null && root.right == null) return sum;
        //recursion
        return sumNumbers(root.left, sum) + sumNumbers(root.right, sum);
    }
}