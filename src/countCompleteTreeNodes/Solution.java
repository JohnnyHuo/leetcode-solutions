package countCompleteTreeNodes;


/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public int countNodes(TreeNode root) {
        int res = 0;
            
        TreeNode node = root;
        while(node != null){
            res++;
//            int leftDepth = getDepth(root.left);
//            int rightDepth = getDepth(root.right);
            int leftDepth = getDepth(node.left);
            int rightDepth = getDepth(node.right);
            if(leftDepth == rightDepth){
                res = leftDepth == 0 ? res : res + (1 << leftDepth) - 1;
                node = node.right;
            }else{
                res = rightDepth == 0 ? res : res + (1 << rightDepth) - 1;
                node = node.left;
            }
        }
        
        return res;
    }
    
    public int getDepth(TreeNode root){
        if(root == null)
            return 0;

        return getDepth(root.left) + 1;
    }
}