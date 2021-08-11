package Acmicpc.BruteForceAlgorithm.Thousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SubsequenceSum1182 {
	static int[] seq = null;
	static int S = 0, count = 0;
	static void dfs(int n, int d, int val) {
		if (d >= n) return;
		
		if (val + seq[d] == S) count++;
		dfs(n, d+1, val);
		dfs(n, d+1, val+seq[d]);
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		int N = Integer.parseInt(tmp.split(" ")[0]);
		S = Integer.parseInt(tmp.split(" ")[1]);
		StringTokenizer st = new StringTokenizer(br.readLine());
		seq = new int[N];
		for (int i = 0; i < seq.length; i++) {
			seq[i] = Integer.parseInt(st.nextToken());
		}
		dfs(N, 0, 0);
		
		System.out.println(count);
	}
}
