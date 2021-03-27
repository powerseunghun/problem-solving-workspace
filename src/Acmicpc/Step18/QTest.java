package Acmicpc.Step18;

import java.util.Deque;
import java.util.LinkedList;

public class QTest {
	public static void main(String[] args) {
		Deque<Integer> q = new LinkedList<>();
		q.add(3);
		q.add(6);
		q.add(5);
		
		q.addFirst(10);
		q.addLast(15);
		
		System.out.println(q);
		System.out.println(q.pollFirst());
	}
}
