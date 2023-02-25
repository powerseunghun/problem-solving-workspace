package Acmicpc.As.B2.FourThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ReplaceDuplicate4592 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int n = 0, cur = 0, bef = 0;
		
		while (true) {
			st = new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken());
			if (n == 0) break;
			cur = 0; bef = 0;
			while (st.hasMoreTokens()) {
				cur = Integer.parseInt(st.nextToken());
				if (cur == 0 || cur != bef) {
					sb.append(cur + " ");
				}
				bef = cur;
			}
			
			sb.append("$").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
		
	}
}
