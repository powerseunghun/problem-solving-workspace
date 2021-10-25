package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;

public class EmployeeBlack {
	static int function(Deque<Integer> q, int K) {
		int count = 0, val = 0;
		
		while (!q.isEmpty()) {
			count++;
			int size = q.size();
			for (int i = 0; i < Math.min(size, K); i++) {
				val = q.pollFirst();
				if (q.isEmpty()) return count;
				if (i == K-1) q.addFirst(val);
			}
		}
		
		return count;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int K = Integer.parseInt(tmp.split(" ")[1]);
		Deque<Integer> q = new LinkedList<>();
		
		for (int i = 1; i <= N; i++) {
			q.addLast(i);
		}
		System.out.println(function(q, K));
	}
}
