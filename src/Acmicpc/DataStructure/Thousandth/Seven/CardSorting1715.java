package Acmicpc.DataStructure.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class CardSorting1715 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Long> q = new PriorityQueue<>();
		int N = Integer.parseInt(br.readLine());
		long a = 0, b = 0, sum = 0;
		for (int i = 0; i < N; i++) {
			q.add(Long.parseLong(br.readLine()));
		}
		while (q.size() > 1) {
			a = q.poll();
			b = q.poll();
			sum += a + b;
			q.add(a+b);
		}
		
		System.out.println(sum);
	}
}
