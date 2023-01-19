package Acmicpc.As.B3.TwentyThousandth.Seven.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Пары27272 {
	static int[] nums = new int[4], arr = new int[4];
	static boolean[] check = new boolean[4];
	static int max = Integer.MIN_VALUE;
	static void func(int n, int d) {
		if (d >= n) {
			max = Math.max(arr[0]*arr[1] + arr[2]*arr[3], max);
			return;
		}
		
		for (int i = 0; i < nums.length; i++) {
			if (!check[i]) {
				check[i] = true;
				arr[d] = nums[i];
				func(n, d+1);
				check[i] = false;
			}
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(st.nextToken());
		}
		func(arr.length, 0);
		
		System.out.println(max);
		br.close();
	}
}
