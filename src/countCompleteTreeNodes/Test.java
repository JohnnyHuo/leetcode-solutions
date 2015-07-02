package countCompleteTreeNodes;

public class Test {
	public static void main(String[] args){
		TreeNode root = new TreeNode(1);
		TreeNode left = new TreeNode(2);
		TreeNode right = new TreeNode(3);
		root.left = left;
		root.right = right;
		
		Solution sol = new Solution();
		System.out.println(sol.countNodes(root));
		
		System.out.println(sol.getDepth(root));
		System.out.println(sol.getDepth(left));
		System.out.println(sol.getDepth(right));


	}
}
