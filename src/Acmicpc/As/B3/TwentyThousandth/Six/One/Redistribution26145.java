package Acmicpc.As.B3.TwentyThousandth.Six.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Redistribution26145 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = br.readLine();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(tmp.split(" ")[0]);
		int M = Integer.parseInt(tmp.split(" ")[1]), idx = 0, sum = 0, val = 0;
		arr = new int[N+M];
		
		while(st.hasMoreTokens()) {
			arr[idx++] = Integer.parseInt(st.nextToken());
		}
		
		for (int i = 0; i < N; i++) {
			idx = 0;
			sum = 0;
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				val = Integer.parseInt(st.nextToken());
				sum += val;
				arr[idx++] += val;
			}
			arr[i] -= sum;
		}
		
		for (int el : arr) {
			sb.append(el + " ");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
