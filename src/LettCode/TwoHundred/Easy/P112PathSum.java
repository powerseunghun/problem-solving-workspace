package LettCode.TwoHundred.Easy;

public class P112PathSum {
    static boolean flag = false;
    static void func(TreeNode root, int sum, int targetSum) {
        if (root == null) return;
        sum += root.val;
        if (root.left == null && root.right == null) {
            if (sum == targetSum) {
                flag = true;
            }
            return;
        }
        else {
            if (root.left != null) func(root.left, sum, targetSum);
            if (root.right != null) func(root.right, sum, targetSum);
        }
    }
    public boolean hasPathSum(TreeNode root, int targetSum) {
        flag = false;
        func(root, 0, targetSum);
        return flag;
    }
    public static void main(String[] args) {
		
	}
}
