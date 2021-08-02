package Acmicpc.DataStructure.TenThousandth.Five.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class CardCoalescence15903 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Long> q = new PriorityQueue<>();
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int m = Integer.parseInt(tmp.split(" ")[1]);
		long x = 0, y = 0, sum = 0;
		
		while (st.hasMoreTokens()) {
			q.add(Long.parseLong(st.nextToken()));
		}
		
		for (int i = 0; i < m; i++) {
			x = q.poll();
			y = q.poll();
			q.add(x+y);
			q.add(x+y);
		}
		
		while (!q.isEmpty()) {
			sum += q.poll();
		}
		
		System.out.println(sum);
	}
}
