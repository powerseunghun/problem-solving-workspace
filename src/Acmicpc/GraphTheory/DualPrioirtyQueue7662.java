package Acmicpc.GraphTheory;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class DualPrioirtyQueue7662 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Integer> q1 = new PriorityQueue<>(Collections.reverseOrder());
		PriorityQueue<Integer> q2 = new PriorityQueue<>();
		int T = Integer.parseInt(br.readLine()), k = 0, item = 0;
		String tmp = null, command = null, val = null;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < T; i++) {
			q1.clear();
			q2.clear();
			
			k = Integer.parseInt(br.readLine());
			for (int j = 0; j < k; j++) {
				tmp = br.readLine();
				command = tmp.split(" ")[0];
				val = tmp.split(" ")[1];
				
				switch(command) {
				case "I":
					q1.add(Integer.parseInt(val));
					q2.add(Integer.parseInt(val));
					break;
				case "D":
					if (q1.isEmpty() || q2.isEmpty()) continue;
					if (val.contains("-")) {
						item = q2.poll();
						q1.remove(item);
					}
					else {
						item = q1.poll();
						q2.remove(item);
					}
					break;
				}
			}
			if (q1.isEmpty() || q2.isEmpty()) {
				sb.append("EMPTY\n");
			}
			else sb.append(q1.peek() + " " + q2.peek() + "\n");
		}
		System.out.print(sb.toString());
	}
}
