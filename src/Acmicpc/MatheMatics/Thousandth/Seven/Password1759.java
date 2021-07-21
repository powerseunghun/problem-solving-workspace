package Acmicpc.MatheMatics.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Password1759 {
	static char[] arr = null;
	static char[] alps = null;
	static PriorityQueue<String> q = new PriorityQueue<>();
	static void bt(int n, int d, char before, int consCount, int vowelCount) {
		if (d >= n) {
			StringBuilder sb = new StringBuilder();
			if (consCount < 2 || vowelCount < 1) return;
			for (int i = 0; i < arr.length; i++) {
				sb.append(arr[i]);
			}
			q.add(sb.toString());
			return;
		}
		
		for (int i = 0; i < alps.length; i++) {
			if (alps[i] > before) {
				arr[d] = alps[i];
				if (alps[i] == 'a' || alps[i] == 'e' || alps[i] == 'i' || alps[i] == 'o' || alps[i] == 'u') {
					bt(n, d+1, alps[i], consCount, vowelCount+1);
				}
				else bt(n, d+1, alps[i], consCount+1, vowelCount);
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int L = Integer.parseInt(st.nextToken());
		int C = Integer.parseInt(st.nextToken());
		arr = new char[L];
		alps = new char[C];
		
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < alps.length; i++) {
			alps[i] = st.nextToken().charAt(0);
		}
		bt(L, 0, '0', 0, 0);
		
		while (!q.isEmpty()) {
			System.out.println(q.poll());
		}
		
	}
}
