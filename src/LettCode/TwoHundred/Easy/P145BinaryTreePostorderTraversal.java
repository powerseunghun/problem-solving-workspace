package LettCode.TwoHundred.Easy;

import java.util.ArrayList;
import java.util.List;

public class P145BinaryTreePostorderTraversal {
    static void postOrder(TreeNode root, List<Integer> list) {
        if (root == null) return;

        if (root.left != null) postOrder(root.left, list);
        if (root.right != null) postOrder(root.right, list);
        list.add(root.val);
    }
    static List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        postOrder(root, list);
        
        return list;
    }
    public static void main(String[] args) {
		
	}
}
