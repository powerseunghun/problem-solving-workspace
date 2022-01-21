package Acmicpc.OrderSubmit.TenThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OneTwoThreePlus15988 {
	static final int mod = 1000000009;
	static void init(long[] arr) {
		arr[1] = 1;
		arr[2] = 2;
		arr[3] = 4;
		
		for (int i = 4; i < arr.length; i++) {
			arr[i] = (arr[i-1]+arr[i-2]+arr[i-3]) % mod; 
		}
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		long[] arr = new long[1000001];
		int T = Integer.parseInt(br.readLine());
		init(arr);
		
		for (int i = 0, n = 0; i < T; i++) {
			n = Integer.parseInt(br.readLine());
			sb.append(arr[n] + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
