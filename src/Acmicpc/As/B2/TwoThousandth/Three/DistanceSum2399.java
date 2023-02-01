package Acmicpc.As.B2.TwoThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DistanceSum2399 {
	static long[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		long res = 0;
		arr = new long[n];
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = Long.parseLong(st.nextToken());
		}
		
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (i == j) continue;
				res += Math.abs(arr[i]-arr[j]);
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
