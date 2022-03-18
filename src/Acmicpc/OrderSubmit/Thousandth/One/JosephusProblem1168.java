package Acmicpc.OrderSubmit.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class JosephusProblem1168 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Queue<Integer> q = new LinkedList<>();
		String tmp = br.readLine();
		StringBuilder sb = new StringBuilder();
		
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int K = Integer.parseInt(tmp.split(" ")[1]), t = 0;
		
		for (int i = 1; i <= N; i++) {
			q.add(i);
		}
		
		sb.append("<");
		while (true) {
			for (int i = 0; i < K-1; i++) {
				q.add(q.poll());
			}
			sb.append(q.poll());
			
			if (q.isEmpty()) break;
			sb.append(", ");
		}
		sb.append(">\n");
		
		System.out.print(sb.toString());
		br.close();
	}
}
