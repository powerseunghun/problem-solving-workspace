package Goorm.Level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

class ListNode {
	private int data;
	private ListNode link;
	
	public ListNode() {
		this.data = 0;
		this.link = null;
	}
	public ListNode(int d) {
		this.data = d;
		this.link = null;
	}
	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public ListNode getLink() {
		return link;
	}
	public void setLink(ListNode link) {
		this.link = link;
	}
}
public class RemoveInLinkedList {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		ListNode root = new ListNode(1);
		root.setLink(new ListNode(2));
		root.getLink().setLink(new ListNode(3));
		root.getLink().getLink().setLink(new ListNode(4));
		root.getLink().getLink().getLink().setLink(new ListNode(5));
		
		ListNode first = root, second = null;
		
		while (first != null) {
			if (first.getData() == 3) {
				if (second == null) {
					second = first.getLink();
				}
				else second.setLink(first.getLink());
			}
			second = first;
			first = first.getLink();
		}
		
		ListNode tmp = root;
		while (true) {
			sb.append(tmp == null ? "NULL" : tmp.getData() + " ");
			if (tmp == null) break;
			tmp = tmp.getLink();
		}
		
		System.out.print(sb.toString());
	}
}
