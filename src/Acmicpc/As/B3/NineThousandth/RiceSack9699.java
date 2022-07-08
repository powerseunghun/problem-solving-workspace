package Acmicpc.As.B3.NineThousandth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class RiceSack9699 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), max = 0;
		StringTokenizer st = null;
		
		for (int i = 1; i <= T; i++) {
			max = Integer.MIN_VALUE;
			st = new StringTokenizer(br.readLine());
			while (st.hasMoreTokens()) {
				max = Math.max(max, Integer.parseInt(st.nextToken()));
			}
			sb.append("Case #" + i + ": " + max + "\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
