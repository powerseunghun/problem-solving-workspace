package Acmicpc.DynamicProgramming.NineThousandth.Zero;

import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

public class PlusOneTwoThree9095 {
	static int[] arr = new int[12];
	static boolean[] check = new boolean[12];
	static int getSum(int n) {
		if (check[n]) return arr[n];
		if (n <= 2) {
			check[n] = true;
			return arr[n] = n;
		}
		else if (n == 3) {
			check[n] = true;
			return arr[n] = 4;
		}
		else {
			check[n] = true;
			return arr[n] = getSum(n-3) + getSum(n-2) + getSum(n-1);
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		for (int i = 0; i < T; i++) {
			sb.append(getSum(Integer.parseInt(br.readLine())) + "\n");
		}
		
		System.out.print(sb.toString());
	}
}
