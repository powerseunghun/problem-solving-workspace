package Acmicpc.As.B4.TwentyThousandth.Five.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class MajesticeTen25893 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), cnt = 0, val = 0;
		StringTokenizer st = null;
		
		while(N-- > 0) {
			st = new StringTokenizer(br.readLine());
			cnt = 0;
			while (st.hasMoreTokens()) {
				val = Integer.parseInt(st.nextToken());
				sb.append(val + " ");
				cnt = val >= 10 ? cnt+1 : cnt;
			}
			sb.append("\n");
			sb.append(cnt >= 3 ? "triple-double\n" : cnt >= 2 ? "double-double\n" : cnt >= 1 ? "double\n" : "zilch\n");
			if (N == 0) continue;
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
