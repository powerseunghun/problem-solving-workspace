package Goorm.Level2;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class JaeWonNumber {
	static long[] arr = new long[31];
	static long getJaeWonNumber(int N) {
		if (arr[N] != 0) return arr[N];
		if (N == 1) return arr[N] = 3;
		else return arr[N] = (long)(getJaeWonNumber(N-1)+ Math.pow(3, N));
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Arrays.fill(arr, 0);
		
		System.out.println(getJaeWonNumber(N));
	}
}
