package Goorm.AlgorithmHeroes.T8;

class Node {
	private int value;
	private Node next;
	
	public Node() {
		this.value = 0;
		this.next = null;
	}
	public Node(int v) {
		this.value = v;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public Node getNext() {
		return next;
	}
	public void setNext(Node next) {
		this.next = next;
	}
}
public class LinkedListRemove {
	static Node root = null;
	static int size = 0;
	static void insert(Node node, int v) {
		Node insertNode = new Node(v);
		size++;
		if (root == null) root = insertNode;
		else {
			Node tmpRoot = root;
			while (tmpRoot.getNext() != null) {
				tmpRoot = tmpRoot.getNext();
			}
			tmpRoot.setNext(insertNode);
		}
	}
	static void remove(int idx) {
		if (root == null || (idx < 0 || idx > size)) return;
		Node tmp = root;
		for (int i = 1; i < idx-1; i++) {
			tmp = root.getNext();
		}
		Node tmp2 = tmp.getNext().getNext();
		tmp.setNext(tmp2);
	}
	static void printList() {
//		while (root != null) {
//			System.out.println(root.getValue());
//			root = root.getNext();
//		}
		if (root == null) return;
		Node tmp = root;
		for (int i = 0; i < size; i++) {
			if (tmp == null) {
				System.out.print("NULL");
				continue;
			}
			System.out.print(tmp.getValue() + " ");
			tmp = tmp.getNext();
		}
	}
	public static void main(String[] args) {
		for (int i = 1; i <= 5; i++) {
			insert(root, i);
		}
		remove(3);
		printList();
	}
}
