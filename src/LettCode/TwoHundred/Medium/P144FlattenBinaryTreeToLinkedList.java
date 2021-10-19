package LettCode.TwoHundred.Medium;

import java.util.Stack;

public class P144FlattenBinaryTreeToLinkedList {
    static void flatten(TreeNode root) {
    	if (root == null) return;
    	// use stack collection
    	Stack<TreeNode> st = new Stack<>();
    	st.clear();
    	st.push(root);
    	
    	// subtree handling
    	while (!st.isEmpty()) {
    		TreeNode tmp = st.pop();
    		if (tmp.right != null) st.push(tmp.right);
    		if (tmp.left != null) st.push(tmp.left);
    		if (!st.isEmpty()) tmp.right = st.peek();
    		
    		tmp.left = null;
    	}
    }
	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(3);
		root.left.right = new TreeNode(4);
		root.right.right = new TreeNode(6);
	}
}
