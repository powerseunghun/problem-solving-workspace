package Acmicpc.DataStructure.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Median2696 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), N = 0;
		StringTokenizer st = null;
		PriorityQueue<Integer> maxQ = null;
		PriorityQueue<Integer> minQ = null;
		
		for (int i = 0; i < T; i++) {
			maxQ = new PriorityQueue<>(Collections.reverseOrder());
			minQ = new PriorityQueue<>();
			N = Integer.parseInt(br.readLine());
			System.out.println(N/2+1);
			
			for (int j = 0; j < N; j++) {
				if (j % 10 == 0) st = new StringTokenizer(br.readLine());
				
				if (maxQ.size() == minQ.size()) {
					maxQ.add(Integer.parseInt(st.nextToken()));
				}
				else minQ.add(Integer.parseInt(st.nextToken()));
				
				if ((!maxQ.isEmpty() && !minQ.isEmpty()) && (minQ.peek() < maxQ.peek())) {
					int tmp1 = maxQ.poll();
					int tmp2 = minQ.poll();
					minQ.add(tmp1);
					maxQ.add(tmp2);
				}
				if (j % 2 == 0) {
					System.out.print(maxQ.peek() + " ");
				}
			}
			System.out.println();
		}
	}
}
