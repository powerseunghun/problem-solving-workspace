package Acmicpc.As.B3.TwentyThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Triangle26509 {
	static final int len = 3;
	static int[] arr1 = null, arr2 = null;
	static void func(String[] strs, int[] arr) {
		for (int i = 0; i < strs.length; i++) {
			arr[i] = Integer.parseInt(strs[i]);
		}
	}
	static boolean check() {
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] != arr2[i]) return false;
		}
		
		return Math.pow(arr1[len-1], 2) == Math.pow(arr1[0], 2) + Math.pow(arr1[1], 2);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		
		while(N-- > 0) {
			arr1 = new int[len];
			arr2 = new int[len];
			func(br.readLine().split(" "), arr1);
			func(br.readLine().split(" "), arr2);
			
			sb.append(check() ? "YES" : "NO").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
