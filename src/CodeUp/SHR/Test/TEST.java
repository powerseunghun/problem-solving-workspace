package CodeUp.SHR.Test;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class TEST {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int a = Integer.parseInt(tmp.split(" ")[1]);
		int b = Integer.parseInt(tmp.split(" ")[2]);
		long value = 0, prevValue = 0, sum = 0;
		
		// max
		PriorityQueue<Long> q1 = new PriorityQueue<>(Collections.reverseOrder());
		// min
		PriorityQueue<Long> q2 = new PriorityQueue<>();
		
		q1.add(1983L);
		prevValue = 1983L;
		sum += 1983L;
		for (int i = 1; i < N; i++) {
			value = prevValue * (a + b) % 20090711;
 			if (q1.size() == q2.size()) q1.add(value);
			else q2.add(value);
			
			if (!q1.isEmpty() && !q2.isEmpty()) {
				if (q1.peek() > q2.peek()) {
					long tValue = q1.poll();
					long tValue2 = q2.poll();
					q1.add(tValue2);
					q2.add(tValue);
				}
			}
			prevValue = value;
			sum += q1.peek();
		}
		
		System.out.println(sum);
	}
}
