package Acmicpc.BruteForceAlgorithm.TenThousandth.Six.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class EnergyGathering16198 {
	static int[] bead = null;
	static int[] arr = null;
	static boolean[] check = null;
	static int max = Integer.MIN_VALUE;
	static void dfs(int n, int d) {
		if (d >= n) {
			int[] tmpBead = bead.clone();
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				int left = arr[i]-1;
				int right = arr[i]+1;
				while (tmpBead[left] == 0) left--;
				while (tmpBead[right] == 0) right++;
				
				sum += (tmpBead[left] * tmpBead[right]);
				tmpBead[arr[i]] = 0;
			}
			max = Math.max(max, sum);
			return;
		}
		
		for (int i = 1; i < bead.length-1; i++) {
			if (!check[i]) {
				check[i] = true;
				arr[d] = i;
				dfs(n ,d+1);
				check[i] = false;
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		bead = new int[N];
		check = new boolean[N];
		arr = new int[N-2];
		
		for (int i = 0; i < bead.length; i++) {
			bead[i] = Integer.parseInt(st.nextToken());
		}
		dfs(N-2, 0);
		System.out.println(max);
	}
}
