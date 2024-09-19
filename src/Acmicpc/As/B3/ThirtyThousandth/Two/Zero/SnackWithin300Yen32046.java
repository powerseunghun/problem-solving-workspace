package Acmicpc.As.B3.ThirtyThousandth.Two.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SnackWithin300Yen32046 {
	static final int limit = 300;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = null;
		int n = 0, v = 0, res = 0;
		
		while(true) {
			n = Integer.parseInt(br.readLine());
			if (n == 0) break;
			st = new StringTokenizer(br.readLine());
			res = 0;
			while(st.hasMoreTokens()) {
				v = Integer.parseInt(st.nextToken());
				if (res + v > limit) continue;
				res += v;
			}
			sb.append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
