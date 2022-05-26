package Acmicpc.As.B3.TwoThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CenterMoveAlgorithm2903 {
	static long[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), base = 3;
		arr = new long[N+1];
		arr[0] = 4;
		
		for (int i = 1; i < arr.length; i++) {
			arr[i] = base * base;
			base += Math.pow(2, i);
		}
		
		System.out.println(arr[N]);
		br.close();
	}
}
