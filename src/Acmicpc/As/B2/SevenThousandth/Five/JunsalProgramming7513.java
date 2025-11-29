package Acmicpc.As.B2.SevenThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class JunsalProgramming7513 {
	static String[] arr = null;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int t = Integer.parseInt(br.readLine()), m = 0, n = 0;
		
		for (int a = 1; a <= t; a++) {
			m = Integer.parseInt(br.readLine());
			arr = new String[m];
			for (int i = 0; i < arr.length; i++) {
				arr[i] = br.readLine();
			}
			sb.append("Scenario #").append(a).append(":\n");
			
			n = Integer.parseInt(br.readLine());
			for (int i = 0, v = 0; i < n; i++) {
				st = new StringTokenizer(br.readLine());
				st.nextToken();
				while(st.hasMoreTokens()) {
					v = Integer.parseInt(st.nextToken());
					sb.append(arr[v]);
				}
				sb.append("\n");				
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
