/**
 * Given a binary tree, find the maximum path sum.

 * The path may start and end at any node in the tree.

 * For example:
 * Given the below binary tree,

 *     1
 *    / \ 
 *   2   3
 *  Return 6.
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
    public static int maxPathSum(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        ArrayList<Integer> res = new ArrayList<Integer>(1);  //注意为什么用ArrayList(1), 而不用int res, int是值传递, 此处要用引用传递
        
        res.add(Integer.MIN_VALUE); 
        
        maxPathSum(root, res);
        
        return res.get(0);
        
    }
    
    public static int maxPathSum(TreeNode root, ArrayList<Integer> res){
        
        if(root == null)
            return 0;
            
        int leftMax = Math.max(0, maxPathSum(root.left, res)),      //注意是root.left的左节点与0比较大小, 如果小于0, 则不记入
        
            rightMax = Math.max(0, maxPathSum(root.right, res));
        
        res.set(0, Math.max(res.get(0), root.val + leftMax + rightMax));
        
        return Math.max(root.val + leftMax, root.val + rightMax);
    }
}