package Acmicpc.Step22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class SayMiddleValue1655 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> q1 = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> q2 = new PriorityQueue<>();
		StringBuilder sb = new StringBuilder();
		for (int i = 0, val = 0; i < n; i++) {
			val = Integer.parseInt(br.readLine());
			if (q1.size() == q2.size()) q1.add(val);
			else q2.add(val);
			
			if (!q1.isEmpty() && !q2.isEmpty()) {
				if (q1.peek() > q2.peek()) {
					int q1Val = q1.poll();
					int q2Val = q2.poll();
					
					q1.add(q2Val);
					q2.add(q1Val);
				}
			}
			sb.append(q1.peek() + "\n");
		}
		System.out.println(sb.toString());
	}
}
