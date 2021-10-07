package LettCode.TwoHundred.Easy;

import java.util.ArrayList;
import java.util.List;

public class P144BinaryTreePreorderTraversal {
    static void preOrder(TreeNode root, List<Integer> list) {
        if (root == null) return;
        
        list.add(root.val);
        if (root.left != null) preOrder(root.left, list);
        if (root.right != null) preOrder(root.right, list);
    }
    static List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        preOrder(root, list);
        
        return list;
    }
	public static void main(String[] args) {
		
	}
}
