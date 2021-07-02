package CodeUp.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NumberGame4546 {
	static int[] arr = new int[3];
	static int[] maxOneDigit = null;
	static boolean[] check = new boolean[5];
	static int maxCount = 0;
	static void bt(int n, int d, int idx, int pIdx, int[][] nums) {
		if (n == d) {
			int sum = 0;
			for (int i = 0; i < arr.length; i++) {
				sum += arr[i];
			}
			sum %= 10;
			maxCount = sum >= maxCount ? sum :maxCount;
			maxOneDigit[pIdx] = sum >= maxOneDigit[pIdx] ? sum : maxOneDigit[pIdx];
			return;
		}
		
		for (int i = idx; i < nums[pIdx].length; i++) {
			if (!check[i]) {
				check[i] = true;
				arr[d] = nums[pIdx][i];
				bt(n, d+1, i+1, pIdx, nums);
				check[i] = false;
			}
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		StringBuilder sb = null;
		int n = Integer.parseInt(br.readLine());
		maxOneDigit = new int[n];
		int[][] nums = new int[n][5];
		
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < nums[i].length; j++) {
				nums[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for (int i = 0; i < nums.length; i++) {
			bt(3, 0, 0, i, nums);
		}
		
		for (int i = 0; i < maxOneDigit.length; i++) {
			if (maxCount == maxOneDigit[i]) {
				sb = new StringBuilder().append(i+1);
			}
		}
		System.out.println(sb.toString());
	}
}
