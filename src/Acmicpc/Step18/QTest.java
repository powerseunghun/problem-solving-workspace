package Acmicpc.Step18;

import java.util.Deque;
import java.util.LinkedList;

public class QTest {
	public static void main(String[] args) {
		Deque<Integer> q = new LinkedList<>();
		q.add(3);
		q.add(5);
		boolean[] check = new boolean[3];
		for (int i = 0; i < check.length; i++) {
			System.out.println(check[i]);
		}
		System.out.println(q.peekFirst());
		System.out.println(q.peekLast());
		System.out.println(q.peekFirst());
		System.out.println(q.peekLast());
	}
}
