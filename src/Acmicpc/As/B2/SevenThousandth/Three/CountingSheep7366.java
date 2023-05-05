package Acmicpc.As.B2.SevenThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class CountingSheep7366 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), res = 0;
		StringTokenizer st = null;
		
		for (int i = 1; i <= T; i++) {
			br.readLine();
			st = new StringTokenizer(br.readLine());
			res = 0;
			while (st.hasMoreTokens()) {
				if ("sheep".equals(st.nextToken())) res++;
			}
			sb.append("Case ").append(i + ": ");
			sb.append("This list contains ").append(res).append(" sheep.");
			if (i == T) continue;
			sb.append("\n").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
