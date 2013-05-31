/*
 * Two elements of a binary search tree (BST) are swapped by mistake.
 * 
 * Recover the tree without changing its structure.
 * 
 * Note:
 * A solution using O(n) space is pretty straight forward. Could you devise a constant space solution?
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
 /*
 
 // ==================================自己写的烂代码=============================
public class Solution {
    int bar;
    ArrayList<TreeNode> container;
    public void recoverTree(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null)    return;
        if(root.left == null && root.right == null) return;
        container = new ArrayList<TreeNode>(2);
        //container.add(Integer.MIN_VALUE);
        bar = Integer.MIN_VALUE;
        //recoverTreeHelper(root, container);
        return;
    }
    
    public  void recoverTreeHelper(TreeNode root/*, ArrayList<TreeNode> container){
        
        if(root == null)    return;
        recoverTreeHelper(root.left);
        if(root.val > bar){
            bar = root.val;
        }else{
            container.add(root);
        }
        recoverTreeHelper(root.right);
        
        //swap two TreeNode
            //int tmp = container.get(0).val;
            //container.get(0).val = container.get(1).val;
            //container.get(1).val = tmp;
        TreeNode tmp = container.get(0);
        container.get(0) = container.get(1);
        container.get(1) = tmp;
    }   
}
*/
//================================正确解=================================================


public class Solution{
    
    ArrayList<TreeNode> al;  // ********这里的<TreeNode>不可省略, 否则 下面的val会不识别
    TreeNode prev;
    
    public void recoverTree(TreeNode root){
        
        if(root == null)    return;
        
        al = new ArrayList<TreeNode>(); // 忘记写了... 这里 al = new ArrayList(); 也可以
        prev = null;
        
        inorder(root);
        
        int tmp = al.get(0).val;
        al.get(0).val = al.get(al.size() - 1).val;
        al.get(al.size() - 1).val = tmp; 
    }
    
    public void inorder(TreeNode root){
        if(root == null)    return;
        
        inorder(root.left);
        
        //while(prev != null && prev.val > root.val){    *******检查来检查去, 你用的while啊......********
        if(prev != null && prev.val > root.val){
            if(! al.contains(prev)) al.add(prev);
            if(! al.contains(root)) al.add(root);
        }
        
        prev = root;
        
        inorder(root.right);
        
    }
}