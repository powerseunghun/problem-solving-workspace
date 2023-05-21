package Acmicpc.As.B2.NineThousandth.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class SubstitutionCipher9046 {
	static int[] cnts = null;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine()), max = 0, cnt = 0;
		String str = null;
		
		while(N-- > 0) {
			str = br.readLine();
			cnts = new int[26];
			max = 0;
			cnt = 0;
			for (int i = 0, w = 0; i < str.length(); i++) {
				if (str.charAt(i) == ' ') continue;
				w = str.charAt(i) - 97;
				cnts[w]++;
				max = Math.max(cnts[w], max);
			}
			for (int el : cnts) {
				if (el == max) cnt++;
			}
			if (cnt > 1) {
				sb.append("?").append("\n");
			}
			else {
				for (int i = 0; i < cnts.length; i++) {
					if (cnts[i] == max) {
						sb.append((char)(i+97)).append("\n");
					}
				}
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
