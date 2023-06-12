package Acmicpc.As.B2.TenThousandth.Four.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class TaroShopping14969 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		StringTokenizer st = null;
		int n = 0, m = 0, max = 0;
		
		while(true) {
			str = br.readLine();
			n = Integer.parseInt(str.split(" ")[0]);
			m = Integer.parseInt(str.split(" ")[1]);
			if (n == 0 && m == 0) break;
			arr = new int[n];
			
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			max = Integer.MIN_VALUE;
			for (int i = 0; i < arr.length; i++) {
				for (int j = 0; j < arr.length; j++) {
					if (i == j || arr[i] + arr[j] > m) continue;
					max = Math.max(max, arr[i]+arr[j]);
				}
			}
			sb.append(max == Integer.MIN_VALUE ? "NONE" : max).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
