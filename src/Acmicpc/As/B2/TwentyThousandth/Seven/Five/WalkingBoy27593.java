package Acmicpc.As.B2.TwentyThousandth.Seven.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class WalkingBoy27593 {
	static final int w = 1440;
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()), n = 0, res = 0;
		StringTokenizer st = null;
		
		while(t-- > 0) {
			n = Integer.parseInt(br.readLine());
			arr = new int[n+2];
			arr[0] = 0;
			arr[n+1] = w;
			st = new StringTokenizer(br.readLine());
			for (int i = 1; i <= n; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			res = 0;
			for (int i = 0; i <= n; i++) {
				res += (arr[i+1]-arr[i])/120;
			}
			sb.append(res > 1 ? "YES" : "NO").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
