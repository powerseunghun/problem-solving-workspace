package Acmicpc.As.B2.TenThousandth.Seven.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class GreedilyIncreasingSubsequence17931 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), v = 0, cur = 0, cnt = 0;
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		while(st.hasMoreTokens()) {
			v = Integer.parseInt(st.nextToken());
			if (v <= cur) continue;
			cnt++;
			sb.append(v + " ");
			cur = v;
		}
		
		System.out.println(cnt);
		System.out.println(sb.toString());
		br.close();
	}
}
