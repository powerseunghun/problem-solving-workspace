package Goorm.Level4;

public class Node {
	private int data;
	private Node left;
	private Node right;
	
	public Node() {
		this.data = 0;
		this.left = null;
		this.right = null;
	}
	public Node(int d) {
		this.data = d;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public Node getLeft() {
		return left;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public Node getRight() {
		return right;
	}
	public void setRight(Node right) {
		this.right = right;
	}
}
