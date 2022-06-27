package Acmicpc.As.B3.NineThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MathTutoring9299 {
	static int[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int t = Integer.parseInt(br.readLine()), n = 0;
		StringTokenizer st = null;
		
		for (int i = 1; i <= t; i++) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			sb.append("Case " + i + ": " + (n-1) + " ");
			arr = new int[n+1];
			
			for (int j = arr.length-1; j >= 0; j--) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			for (int j = arr.length-1; j >= 1; j--) {
				sb.append((j * arr[j]) + " ");
			}
			sb.append("\n");
		}
		System.out.print(sb.toString());
		br.close();
	}
}
