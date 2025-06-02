package Acmicpc.As.B2.TenThousandth.Two.Six;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StoreCredit12603 {
	static int[] arr = null;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), C = 0, I = 0;
		StringTokenizer st = null;
		
		for (int i = 1; i <= N; i++) {
			C = Integer.parseInt(br.readLine());
			I = Integer.parseInt(br.readLine());
			st = new StringTokenizer(br.readLine());
			arr = new int[I];
			
			for (int j = 0; j < arr.length; j++) {
				arr[j] = Integer.parseInt(st.nextToken());
			}
			for (int j = 0; j < arr.length-1; j++) {
				for (int k = j+1; k < arr.length; k++) {
					if (arr[j]+arr[k] == C) {
						sb.append("Case #").append(i).append(": ");
						sb.append(j+1).append(" ").append(k+1).append("\n");
						k = arr.length+1;
						j = arr.length+1;
					}
				}
			}
		}
		System.out.print(sb.toString());
		br.close();
	}
}
