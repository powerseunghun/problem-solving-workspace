package LettCode.TwoHundred.Medium;

import java.util.ArrayList;
import java.util.List;

public class P113PathSum2 {
	static List<List<Integer>> list = new ArrayList<>();
	static List<Integer> moveToList(List<Integer> tList) {
		List<Integer> curList = new ArrayList<>();
		for (int i = 0; i < tList.size(); i++) {
			curList.add(tList.get(i));
		}
		return curList;
	}
	static void search(TreeNode root, List<Integer> tList, int sum, int targetSum) {
		if (root == null) return;
		if (root.left == null && root.right == null) {
			if (sum+(root.val) == targetSum) {
				tList.add(root.val);
				list.add(tList);
			}
			return;
		}
		tList.add(root.val);
		List<Integer> toLeft = moveToList(tList);
		List<Integer> toRight = moveToList(tList);
		search(root.left, toLeft, sum+root.val, targetSum);
		search(root.right, toRight, sum+root.val, targetSum);
	}
    static List<List<Integer>> pathSum(TreeNode root, int targetSum) {
    	list.clear();
    	search(root, new ArrayList<>(), 0, targetSum);
    	
    	return list;
    }
	public static void main(String[] args) {
		TreeNode root = new TreeNode(5);
		root.left = new TreeNode(4);
		root.right = new TreeNode(8);
		root.left.left = new TreeNode(11);
		root.left.left.left = new TreeNode(7);
		root.left.left.right = new TreeNode(2);
		root.right.left = new TreeNode(13);
		root.right.right = new TreeNode(4);
		root.right.right.left = new TreeNode(5);
		root.right.right.right = new TreeNode(1);
		
		pathSum(root, 22);
	}
}
