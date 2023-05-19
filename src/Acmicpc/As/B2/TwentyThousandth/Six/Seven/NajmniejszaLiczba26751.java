package Acmicpc.As.B2.TwentyThousandth.Six.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class NajmniejszaLiczba26751 {
	static final int len = 3;
	static int[] nums = new int[len];
	static int[] arr = new int[len];
	static boolean[] check = new boolean[3];
	static int res = Integer.MAX_VALUE;
	static void func(int n, int d) {
		if (d >= n) {
			int w = 0, idx = 2;
			for (int i = 0; i < arr.length; i++) {
				w += (int) (arr[i] * Math.pow(10, idx--));
			}
			if (String.valueOf(w).length() >= 3) {
				res = Math.min(res, w);
			}
			return;
		}
		
		for (int i = 0; i < arr.length; i++) {
			if (!check[i]) {
				arr[d] = nums[i];
				check[i] = true;
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
		
		func(len, 0);
		
		System.out.println(res);
		br.close();
	}
}

