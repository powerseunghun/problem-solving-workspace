package Acmicpc.BruteForceAlgorithm.TwoThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class InequalitySign2529 {
	static int[] nums = null;
	static int[] arr = null;
	static char[] eq = null;
	static boolean[] check = null;
	static long max = Long.MIN_VALUE;
	static long min = Long.MAX_VALUE;
	static String maxString = null;
	static String minString = null;
	static void dfs(int n, int d) {
		if (d >= n) {
			StringBuilder sb = new StringBuilder();
			int val1 = 0, val2 = 0;
			for (int i = 0, eqIdx = 0; i < arr.length-1; i++, eqIdx++) {
				val1 = arr[i];
				val2 = arr[i+1];
				sb.append(val1);
				char c = eq[eqIdx];
				switch(c) {
				case '<':
					if (!(val1 < val2)) return; 
					break;
				case '>':
					if (!(val1 > val2)) return;
					break;
				}
			}
			sb.append(val2);
			long tmp = Long.parseLong(sb.toString());
			if (tmp > max) {
				max = tmp;
				maxString = sb.toString();
			}
			if (tmp < min) {
				min = tmp;
				minString = sb.toString();
			}
			return;
		}
		
		for (int i = 0; i < 10; i++) {
			if (!check[i]) {
				arr[d] = i;
				check[i] = true;
				dfs(n, d+1);
				check[i] = false;
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		eq = new char[N];
		arr = new int[N+1];
		nums = new int[N+1];
		check = new boolean[10];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i = 0; i < eq.length; i++) {
			eq[i] = st.nextToken().charAt(0);
		}
		dfs(nums.length, 0);
		System.out.println(maxString);
		System.out.println(minString);
	}
}
