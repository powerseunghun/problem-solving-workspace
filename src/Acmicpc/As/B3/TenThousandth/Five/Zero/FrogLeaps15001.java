package Acmicpc.As.B3.TenThousandth.Five.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FrogLeaps15001 {
	static long[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		arr = new long[n];
		long res = 0;
		
		for (int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}
		for (int i = 1; i < arr.length; i++) {
			res += Math.pow(arr[i]-arr[i-1], 2);
		}
		
		System.out.println(res);
		br.close();
	}
}
