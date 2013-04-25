/* Given a binary tree, flatten it to a linked list in-place.

 * For example,
 * Given

         1
        / \
       2   5
      / \   \
     3   4   6
 * The flattened tree should look like:
   1
    \
     2
      \
       3
        \
         4
          \
           5
            \
             6
 * Hints:
 * If you notice carefully in the flattened tree, each node's right child points to the next node of a pre-order traversal.
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
    ArrayList<TreeNode> list;

    public void flatten(TreeNode root) {
        // Start typing your Java solution below
        // DO NOT write main() function
        if(root == null)    return;
        list = new ArrayList<TreeNode>();
        preorderDFS(root);
        relink(list);
    }
    
    private void preorderDFS(TreeNode root){
        if(root == null)    return;
        list.add(root);
        preorderDFS(root.left);
        preorderDFS(root.right);
        
    }
    
    private void relink(ArrayList list){
        this.list = list;
        //if(list.size() == 0 || list.size() == 1)    return;
        for(int i = 0; i < list.size(); i++){
            this.list.get(i).left = null;
            if(i == list.size() - 1){
                this.list.get(i).right = null;
            }else{
                this.list.get(i).right = this.list.get(i + 1);
            }
        }
    }
}
//======上面的写法中, relink(list){}里面的list不是class中声明的list了, 所以要用this, 或者不传入变量, 直接relink();=================
//========如下所示

private void relink() {
        for (int i = 0; i < list.size(); i++) {
            list.get(i).left = null;

            if (i == list.size() - 1) {
                list.get(i).right = null;
            } else {
                list.get(i).right = list.get(i + 1);
            }
        }
    }
