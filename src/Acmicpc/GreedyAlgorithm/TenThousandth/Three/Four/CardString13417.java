package Acmicpc.GreedyAlgorithm.TenThousandth.Three.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class CardString13417 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0;
		char[] arr = null;
		Deque<Character> q = new LinkedList<>();
		
		for (int i = 0; i < T; i++) {
			N = Integer.parseInt(br.readLine());
			arr = new char[N];
			q.clear();
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < arr.length; j++) {
				arr[j] = st.nextToken().charAt(0);
				if (q.isEmpty()) q.add(arr[j]);
				else {
					if (q.peek() >= arr[j]) {
						q.addFirst(arr[j]);
					}
					else q.addLast(arr[j]);
				}
			}
			while (!q.isEmpty()) {
				sb.append(q.poll());
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
	}
}
