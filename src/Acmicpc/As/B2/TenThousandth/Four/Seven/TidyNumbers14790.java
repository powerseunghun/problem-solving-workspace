package Acmicpc.As.B2.TenThousandth.Four.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TidyNumbers14790 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String str = null;
		
		for (int i = 1, n = 0; i <= T; i++) {
			str = br.readLine();
			char[] cs = str.toCharArray();
			
			for (int j = cs.length-1; j > 0; j--) {
				if (cs[j] >= cs[j-1]) continue;
				cs[j-1]--;
				for (int k = cs.length-1; k >= j; k--) {
					cs[k] = '9';
				}
			}
			sb.append("Case #").append(i).append(": ").append(Long.valueOf(String.valueOf(cs))).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
