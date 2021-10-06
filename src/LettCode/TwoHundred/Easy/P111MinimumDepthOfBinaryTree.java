package LettCode.TwoHundred.Easy;

public class P111MinimumDepthOfBinaryTree {
    static int min = 0;
    static void func(TreeNode root, int d) {
        if (root == null) return;
        
        if (root.left == null && root.right == null) {
            min = Math.min(min, d);
            return;
        }
        else {
            if (root.left != null) func(root.left, d+1);
            if (root.right != null) func(root.right, d+1);
        }
    }
    static int minDepth(TreeNode root) {
        min = Integer.MAX_VALUE;
        func(root, 0);
        return min == Integer.MAX_VALUE ? 0 : min+1;
    }
    public static void main(String[] args) {
		
	}
}
