package Acmicpc.As.B2.TenThousandth.Eight.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class PenguinDive18228 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		int res = 0, v = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		Queue<Integer> pq = new PriorityQueue<>();
		
		while(st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken());
			if (v != -1) {
				pq.offer(v);
				continue;
			}
			res += pq.poll();
			pq.clear();
		}
		
		System.out.println(res+pq.poll());
		br.close();
	}
}
