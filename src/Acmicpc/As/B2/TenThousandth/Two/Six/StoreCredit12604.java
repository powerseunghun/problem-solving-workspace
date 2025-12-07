package Acmicpc.As.B2.TenThousandth.Two.Six;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class StoreCredit12604 {
	static int[] arr = null;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), C = 0, I = 0;
		StringTokenizer st = null;
		
		for (int t = 1; t <= N; t++) {
			C = Integer.parseInt(br.readLine());
			I = Integer.parseInt(br.readLine());
			arr = new int[I];
			st = new StringTokenizer(br.readLine());
			for (int i = 0; i < I; i++) {
				arr[i] = Integer.parseInt(st.nextToken());
			}
			
			for (int i = 0; i < I-1; i++) {
				for (int j = i+1; j < I; j++) {
					if (arr[i] + arr[j] == C) {
						sb.append("Case #").append(t).append(": ");
						sb.append(i+1).append(" ").append(j+1).append("\n");
						i = I+1;
						break;
					}
				}
			}
		}
		System.out.print(sb.toString());
		br.close();
	}
}
