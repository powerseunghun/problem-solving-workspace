package Goorm.Level4;

public class Tree {
	Node root;
	void insert(char data, char leftData, char rightData) {
		if (root == null) {
			if (data != '.') root = new Node(data);
			if (leftData != '.') root.setLeft(new Node(leftData));
			if (rightData != '.') root.setRight(new Node(rightData));
		}
		else {
			
		}
	}
	void search(Node root, char data, char leftData, char rightData) {
		if (root == null) return;
		if (root.getData() == data) {
		}
	}
}
