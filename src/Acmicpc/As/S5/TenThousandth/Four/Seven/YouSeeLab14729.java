package Acmicpc.As.S5.TenThousandth.Four.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class YouSeeLab14729 {
	static final int st = 7;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		PriorityQueue<Double> pq = new PriorityQueue<Double>();
		
		while(N-- > 0) {
			pq.add(Double.parseDouble(br.readLine()));
		}
		
		for (int i = 0; i < st; i++) {
			sb.append(pq.poll()).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
