package Acmicpc.Tree.TwoThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

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
	public void preOrder(Node root) {
		System.out.println(root.getData());
		if (root.getLeft() != null) preOrder(root.getLeft());
		if (root.getRight() != null) preOrder(root.getRight());
	}
}
public class getPreOrder2263 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> list = new ArrayList<>();
		Node r = null;
		br.readLine();
		br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		while (st.hasMoreTokens()) {
			list.add(Integer.parseInt(st.nextToken()));
		}
		
		for (int i = list.size()-1; i >= 0; i--) {
			if (r == null) r = new Node(list.get(i));
			else r.insert(list.get(i));
		}
		
		r.preOrder(r);
	}
}
