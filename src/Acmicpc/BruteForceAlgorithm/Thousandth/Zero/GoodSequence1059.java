package Acmicpc.BruteForceAlgorithm.Thousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class GoodSequence1059 {
	static int[] arr = new int[2];
	static int[] nums = null;
	static int[] check = null;
	static int N = 0, count = 0, max = 0;
	static void dfs(int n, int d, int idx) {
		if (d >= n) {
			boolean flag1 = false, flag2 = true;
			for (int i = arr[0]; i <= arr[1]; i++) {
				if(i == N) {
					flag1 = true;
					break;
				}
			}
			
			if (flag1) {
				for (int i = arr[0]; i <= arr[1]; i++) {
					for (int j = 0; j < check.length; j++) {
						if (i == check[j]) {
							flag2 = false;
							break;
						}
					}
				}
			}
			if (flag1 && flag2) count++;
			return;
		}
		
		for (int i = idx; i <= max; i++) {
			arr[d] = i;
			dfs(n, d+1, i+1);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int L = Integer.parseInt(br.readLine());
		nums = new int[L+1];
		check = new int[L];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0, val = 0; i < check.length; i++) {
			val = Integer.parseInt(st.nextToken());
			check[i] = val;
			nums[i] = val;
			max = Math.max(max, val);
		}
		N = Integer.parseInt(br.readLine());
		nums[L] = N;
		Arrays.sort(nums);
		dfs(2, 0, 1);
		
		System.out.println(count);
	}
}
