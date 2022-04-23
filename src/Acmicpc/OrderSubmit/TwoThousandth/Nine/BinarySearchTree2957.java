package Acmicpc.OrderSubmit.TwoThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BinarySearchTree2957 {
	static Node root = null;
	static int counter = 0;
	static class Node {
		private int N;
		private Node l;
		private Node r;
		
		public Node(int N) {
			this.N = N;
			this.l = null;
			this.r = null;
		}
		public int getN() {
			return N;
		}
		public void setN(int n) {
			N = n;
		}
		public Node getL() {
			return l;
		}
		public void setL(Node l) {
			this.l = l;
		}
		public Node getR() {
			return r;
		}
		public void setR(Node r) {
			this.r = r;
		}
	}
	static void insert(int X, Node N) {
		Node tmp = root;
		counter++;
		if (X < tmp.getN()) {
			if (N.getL() == null) {
				Node tmpNode = new Node(X);
				N.setL(tmpNode);
			}
			else insert(X, N.getL());
		}
		else if (X > tmp.getN()) {
			if (N.getR() == null) {
				Node tmpNode = new Node(X);
				N.setR(tmpNode);
			}
			else insert(X, N.getR());
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), X = 0;
		
		for (int i = 0; i < N; i++) {
			X = Integer.parseInt(br.readLine());
			if (root == null) {
				root = new Node(X);
				sb.append("0\n");
				continue;
			}
			insert(X, root);
			sb.append(counter + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
