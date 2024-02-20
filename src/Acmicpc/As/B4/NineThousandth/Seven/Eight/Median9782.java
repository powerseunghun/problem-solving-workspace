package Acmicpc.As.B4.NineThousandth.Seven.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Median9782 {
	static int[] arr = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int n = 0, c = 1;
		
		while(true) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			if (n == 0) break;
			
			arr = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			sb.append("Case ").append(c++).append(": ");
			sb.append(n % 2 == 0 ? (arr[n/2-1]+arr[n/2]) / 2.0 : (double)arr[(n-1)/2]);
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
