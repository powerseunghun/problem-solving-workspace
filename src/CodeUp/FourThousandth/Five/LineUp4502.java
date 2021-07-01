package CodeUp.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class LineUp4502 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> q = new LinkedList<>();
		Deque<Integer> tmpQ = new LinkedList<>();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 1, val = 0; i <= n; i++) {
			val = Integer.parseInt(st.nextToken());
			if (i == 1) q.addFirst(i);
			else {
				if (val == 0) {
					q.addLast(i);
				}
				else {
					tmpQ.clear();
					for (int j = 0; j < val; j++) {
						tmpQ.addFirst(q.pollLast());
					}
					q.addLast(i);
					for (int j = 0; j < val; j++) {
						q.addLast(tmpQ.pollFirst());
					}
				}
			}
		}
		while (!q.isEmpty()) {
			System.out.print(q.pollFirst() + " ");
		}
	}
}
