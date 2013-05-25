/*
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.
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
    public TreeNode sortedArrayToBST(int[] num) {
        // Start typing your Java solution below
        // DO NOT write main() function
        
        int len = num.length;
        
        if(num == null || len == 0) return null;
        
        return sortedArrayToBSTHelper(num, 0, len - 1);
    }
    
    private TreeNode sortedArrayToBSTHelper(int[] num, int start, int end){
        
        if(start > end) return null;
        
        //if(num == null || num.length == 0) return null;
        
        int mid = start + (end - start) / 2;
        
        TreeNode root = new TreeNode(num[mid]);
        
        root.left = sortedArrayToBSTHelper(num, start, mid - 1);
        root.right = sortedArrayToBSTHelper(num, mid + 1, end);
        
        return root;


    }
}
