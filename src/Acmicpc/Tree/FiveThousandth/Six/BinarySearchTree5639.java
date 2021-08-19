package Acmicpc.Tree.FiveThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
	private int data;
	private Node left;
	private Node right;
	
	public Node(int d) {
		this.data = d;
	}
	public Node(int d, Node l, Node r) {
		this.data = d;
		this.left = l;
		this.right = r;
	}
	public int getData() {
		return this.data;
	}
	public void setData(int d) {
		this.data = d;
	}
	public Node getLeft() {
		return this.left;
	}
	public Node getRight() {
		return this.right;
	}
	public void setLeft(Node l) {
		this.left = l;
	}
	public void setRight(Node r) {
		this.right = r;
	}
	public void insert(int d) {
		if (d < this.getData()) {
			if (this.getLeft() == null) {
				this.left = new Node(d);
			}
			else this.left.insert(d);
		}
		else {
			if (this.right == null) {
				this.right = new Node(d);
			}
			else this.right.insert(d);
		}
	}
	public void postOrder(Node root) {
		if (root.getLeft() != null) postOrder(root.getLeft());
 		if (root.getRight() != null) postOrder(root.getRight());
 		System.out.println(root.getData());
	}
}
public class BinarySearchTree5639 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Node r = null;
		String str = null;
		while ((str = br.readLine()) != null) {
			int val = Integer.parseInt(str);
			if (r == null) {
				r = new Node(val);
			}
			else r.insert(val);
		}
		r.postOrder(r);
	}
}
