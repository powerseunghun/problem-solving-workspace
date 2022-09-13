package Acmicpc.As.B3.TenThousandth.Nine.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Fractification19751 {
	static int[] arr = new int[4];
	static int[] nums = new int[4];
	static int[] res = new int[4];
	static boolean[] check = new boolean[4];
	static double min = Integer.MAX_VALUE;
	static void func(int n, int d) {
		if (d >= n) {
			if (calc() < min) {
				min = calc();
				for (int i = 0; i < arr.length; i++) {
					res[i] = arr[i];
				}
			}
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
	static double calc() {
		return ((double)arr[0]/arr[1]) + ((double)arr[2]/arr[3]); 
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		
		for (int i = 0; i < nums.length; i++) {
			nums[i] = Integer.parseInt(tmp.split(" ")[i]);
		}
		
		func(nums.length, 0);
		for (int el : res) {
			System.out.print(el + " ");
		}
		System.out.println();
		
		br.close();
	}
}
