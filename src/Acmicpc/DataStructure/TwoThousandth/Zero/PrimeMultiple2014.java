package Acmicpc.DataStructure.TwoThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class PrimeMultiple2014 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PriorityQueue<Long> q = new PriorityQueue<>();
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(tmp.split(" ")[0]);
		int N = Integer.parseInt(tmp.split(" ")[1]);
		long val = 0;
		long[] arr = new long[K];

		for (int i = 0; i < K; i++) {
			arr[i] = Long.parseLong(st.nextToken());
			q.add(arr[i]);
		}
		
		for (int i = 0; i < N; i++) {
			val = q.poll();
			for (int j = 0; j < K; j++) {
				q.add(val * arr[j]);
				if (val % arr[j] == 0) break;
			}
		}
		System.out.println(val);
	}
}
