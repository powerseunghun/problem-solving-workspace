package Acmicpc.GreedyAlgorithm.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class CombineNumber1744 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> q = new PriorityQueue<>(Collections.reverseOrder());
		int N = Integer.parseInt(br.readLine()), sum = 0, val1 = 0, val2 = 0;
		
		for (int i = 0; i < N; i++) {
			q.add(Integer.parseInt(br.readLine()));
		}
		
		while (!q.isEmpty()) {
			if (q.size() >= 2) {
				val1 = q.poll();
				val2 = q.poll();
				if (val1 <= 0 && val2 <= 0) sum += (val1 * val2);
				else if (val1 <= 0 || val2 <= 0) sum += (val1 + val2);
				else sum += (val1 * val2);
			}
			else {
				sum += q.poll();
			}
		}
		System.out.println(sum);
	}
}
