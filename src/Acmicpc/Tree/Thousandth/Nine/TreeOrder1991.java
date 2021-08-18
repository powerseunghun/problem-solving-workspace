package Acmicpc.Tree.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Node {
	private char data;
	private Node left;
	private Node right;
	public Node() {
		this.data = ' ';
		this.left = null;
		this.right = null;
	}
	
	public Node(char d) {
		this.data = d;
	}
	public char getData() {
		return this.data;
	}
	public void setLeft(Node left) {
		this.left = left;
	}
	public void setRight(Node right) {
		this.right = right;
	}
	public Node getLeft() {
		return this.left;
	}
	public Node getRight() {
		return this.right;
	}
}
class Tree {
	Node root;
	void insert(char data, char leftData, char rightData) {
		if (root == null) {
			if (data != '.') root = new Node(data);
			if (leftData != '.') root.setLeft(new Node(leftData));
			if (rightData != '.') root.setRight(new Node(rightData));
		}
		else search(root, data, leftData, rightData);
	}
	void search(Node root, char data, char leftData, char rightData) {
		// subtree 데이터에 삽입
		if (root == null) return;
		if (root.getData() == data) {
			if (leftData != '.') root.setLeft(new Node(leftData));
			if (rightData != '.') root.setRight(new Node(rightData));
		}
		// 다시 서브트리 탐색
		else {
			search(root.getLeft(), data, leftData, rightData);
			search(root.getRight(), data, leftData, rightData);
		}
	}
	// Root -> Left -> Right
	void preOrder(Node root) {
		System.out.print(root.getData());
		if (root.getLeft() != null) preOrder(root.getLeft());
		if (root.getRight() != null) preOrder(root.getRight());
	}
	// Left -> Root -> Right
	void inOrder(Node root) {
		if (root.getLeft() != null) inOrder(root.getLeft());
		System.out.print(root.getData());
		if (root.getRight() != null) inOrder(root.getRight());
	}
	// Left -> Right -> Root
	void postOrder(Node root) {
		if (root.getLeft() != null) postOrder(root.getLeft());
		if (root.getRight() != null) postOrder(root.getRight());
		System.out.print(root.getData());
	}
}
public class TreeOrder1991 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		Tree t = new Tree();
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			char data = tmp.split(" ")[0].charAt(0);
			char leftData = tmp.split(" ")[1].charAt(0);
			char rightData = tmp.split(" ")[2].charAt(0);
			t.insert(data, leftData, rightData);
		}
		t.preOrder(t.root);
		System.out.println();
		t.inOrder(t.root);
		System.out.println();
		t.postOrder(t.root);
	}
}
