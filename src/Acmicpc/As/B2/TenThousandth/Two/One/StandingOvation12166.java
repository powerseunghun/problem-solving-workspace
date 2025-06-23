package Acmicpc.As.B2.TenThousandth.Two.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandingOvation12166 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, res = 0, c = 0;
		String str = null;
		
		for (int i = 1; i <= T; i++) {
			str = br.readLine();
			N = Integer.parseInt(str.split(" ")[0]);
			str = str.split(" ")[1];
			c = str.charAt(0)-'0';
			res = 0;
			for (int j = 1; j <= N; j++) {
				if (j > c) {
					res += j-c;
					c += j-c;
				}
				c += str.charAt(j)-'0';
			}
			sb.append("Case #").append(i).append(": ").append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
