package Acmicpc.Step19;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JosephusProblem11866 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		ArrayList<Integer> list = new ArrayList<>();
		int N = sc.nextInt(), K = sc.nextInt(), count = 0;
		
		for (int i = 1; i <= N; i++) {
			q.add(i);
		}
		
		for (int i = 0; list.size() != N; i++) {
			for (int j = 0; j < (K-1); j++) {
				q.add(q.poll());
			}
			list.add(q.poll());
		}
		System.out.print("<");
		for (int i = 0; i < list.size(); i++) {
			System.out.print(list.get(i));
			if (i != list.size() - 1) {
				System.out.print(", ");
			}
		}
		System.out.print(">");
	}
}
