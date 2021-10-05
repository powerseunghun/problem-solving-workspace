package LettCode.Hundred.Easy;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	TreeNode() {};
	TreeNode(int val) { this.val = val; };
	TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
public class P94BinaryTreeInorderTraversal {
	static List<Integer> list = null;
    static void inorder(TreeNode root) {
        if (root == null) return;
        if (root.left != null) inorder(root.left);
        list.add(root.val);
        if (root.right != null) inorder(root.right);
    }
    static List<Integer> inorderTraversal(TreeNode root) {
        list = new ArrayList<>();
        inorder(root);
        return list;
    }
    public static void main(String[] args) {
    	TreeNode root = new TreeNode();
		List<Integer> list = inorderTraversal(root);
	}
}
