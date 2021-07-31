package Acmicpc.GraphTheory.TenThousandth.Zero.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PermutationCycle10451 {
	static int[] arr = null;
	static boolean[] check = null;
	static void search(int n) {
		if (check[n])return;
		check[n] = true;
		search(arr[n]);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), N = 0, count = 0;;
		StringTokenizer st = null;
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < T; i++) {
			count = 0;
			N = Integer.parseInt(br.readLine());
			arr = new int[N+1];
			check = new boolean[N+1];
			st = new StringTokenizer(br.readLine());
			for (int j = 1; j <= N; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			for (int j = 1; j <= N; j++) {
				if (!check[j]) {
					count++;
					search(j);
				}
			}
			sb.append(count+"\n");
		}
		System.out.print(sb.toString());
	}
}
