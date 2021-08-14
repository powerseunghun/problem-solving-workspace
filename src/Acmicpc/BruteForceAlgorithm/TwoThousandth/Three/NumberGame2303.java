package Acmicpc.BruteForceAlgorithm.TwoThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberGame2303 {
	static int[] arr = new int[3];
	static int[] card = new int[5];
	static int maxValue = Integer.MIN_VALUE;
	static int maxIdx = 0;
	static void dfs(int d, int person, int idx) {
		if (d >= 3) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			sum %= 10;
			
			if (sum >= maxValue) {
				maxIdx = person;
				maxValue = sum;
			}
			return;
		}
		
		for (int i = idx; i < card.length; i++) {
			arr[d] = card[i];
			dfs(d+1, person, i+1);
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < card.length; j++) {
				card[j] = Integer.parseInt(st.nextToken());
			}
			dfs(0, i, 0);
		}
		System.out.println(maxIdx);
	}
}
