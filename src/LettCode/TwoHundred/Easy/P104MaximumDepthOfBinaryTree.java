package LettCode.TwoHundred.Easy;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode() {}
	TreeNode(int val) { this.val = val; }
	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
public class P104MaximumDepthOfBinaryTree {
    static int func(TreeNode root, int d) {
        if (root == null) return d;
        else return Math.max(func(root.left, d+1), func(root.right, d+1));
    }
    static int maxDepth(TreeNode root) {
        return func(root, 0);
    }
	public static void main(String[] args) {
		
	}
}
