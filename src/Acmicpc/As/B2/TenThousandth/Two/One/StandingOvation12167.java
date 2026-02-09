package Acmicpc.As.B2.TenThousandth.Two.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StandingOvation12167 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), a = 0, res = 0, cnt = 0;
		String str = null, s = null;
		
		for (int i = 1; i <= T; i++) {
			str = br.readLine();
			a = Integer.parseInt(str.split(" ")[0]);
			s = str.split(" ")[1];
			res = 0;
			cnt = s.charAt(0)-'0';
			for (int j = 1; j <= a; j++) {
				if (j > cnt) {
					res += j-cnt;
					cnt += j-cnt;
				}
				cnt += s.charAt(j)-'0';
			}
			sb.append("Case #").append(i).append(": ").append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
