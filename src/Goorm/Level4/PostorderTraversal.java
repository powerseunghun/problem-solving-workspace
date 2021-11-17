package Goorm.Level4;

public class PostorderTraversal {
	static void postOrder(StringBuilder sb, Node root) {
		if (root.getLeft() != null) postOrder(sb, root.getLeft());
		if (root.getRight() != null) postOrder(sb, root.getRight());
		sb.append(root.getData() + " ");
	}
	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		Node root = new Node(6);
		root.setLeft(new Node(3));
		root.setRight(new Node(9));
		root.getLeft().setLeft(new Node(1));
		root.getLeft().setRight(new Node(5));
		root.getRight().setLeft(new Node(7));
		root.getRight().setRight(new Node(11));
		
		postOrder(sb, root);
		System.out.print(sb.toString());
	}
}
