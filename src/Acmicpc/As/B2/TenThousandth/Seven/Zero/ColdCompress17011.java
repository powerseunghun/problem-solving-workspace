package Acmicpc.As.B2.TenThousandth.Seven.Zero;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ColdCompress17011 {
	static String compress(String str) {
		StringBuilder sb = new StringBuilder();
		char base = str.charAt(0);
		int cnt = 1;
		
		for (int i = 1; i < str.length(); i++) {
			if (base != str.charAt(i)) {
				sb.append(cnt).append(" ").append(base).append(" ");
				base = str.charAt(i);
				cnt = 1;
				continue;
			}
			cnt++;
		}
		sb.append(cnt).append(" ").append(base);
		return sb.toString();
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine().replaceAll(" ", ""));
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			sb.append(compress(str)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
