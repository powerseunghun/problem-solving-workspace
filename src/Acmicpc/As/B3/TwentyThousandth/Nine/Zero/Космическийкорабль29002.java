package Acmicpc.As.B3.TwentyThousandth.Nine.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Космическийкорабль29002 {
	static long[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()), idx = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		arr = new long[n];
		long v = 0, sum = 0;
		
		while(st.hasMoreTokens()) {
			v = Long.parseLong(st.nextToken());
			arr[idx++] = v;
			sum += v;
		}
		sum /= 2;
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == sum) continue;
			sb.append(arr[i]).append(" ");
		}
		sb.append(sum);
		
		System.out.print(sb.toString());
		br.close();
	}
}
