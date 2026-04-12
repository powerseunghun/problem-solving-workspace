package Acmicpc.As.B2.TenThousandth.Zero.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LongestSequence10202 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), cnt = 0, res = 0;
		String str = null;
		
		while(T-- > 0) {
			cnt = 0;
			res = 0;
			str = br.readLine().replaceAll("[^OX]", "");
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) == 'X') cnt++;
				else cnt = 0;
				res = Math.max(res, cnt);
			}
			sb.append("The longest contiguous subsequence of X's is of length ").append(res).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
