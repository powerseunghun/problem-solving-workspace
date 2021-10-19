package LettCode.TwoHundred.Medium;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
	int val;
	TreeNode left;
	TreeNode right;
	public TreeNode() {}
	public TreeNode(int val) { this.val = val; }
	public TreeNode(int val, TreeNode left, TreeNode right) {
		this.val = val;
		this.left = left;
		this.right = right;
	}
}
public class P102BinaryTreeLevelOrderTraversal {
	static List<List<Integer>> list = new ArrayList<>();
	static void dfs(TreeNode root, int d) {
		if (root == null) return;
		if (list.size() <= d) list.add(new ArrayList<>());
		list.get(d).add(root.val);
		dfs(root.left, d+1);
		dfs(root.right, d+1);
		return;
	}
    static List<List<Integer>> levelOrder(TreeNode root) {
        list.clear();
        dfs(root, 0);
        
        return list;
    }
	public static void main(String[] args) {
		
	}
}
