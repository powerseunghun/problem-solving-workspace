package Acmicpc.As.B2.TenThousandth.Six.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RunLengthEncodingRun16634 {
	static StringBuilder sb = new StringBuilder();
	static String encode(String str) {
		int cnt = 1;
		char base = str.charAt(0);
		
		for (int i = 1; i < str.length(); i++) {
			if (base == str.charAt(i)) {
				cnt++;
			}
			else {
				sb.append(base).append(cnt);
				base = str.charAt(i);
				cnt = 1;
			}
		}
		sb.append(base).append(cnt).append("\n");
		return sb.toString();
	}
	static String decode(String str) {
		char base = str.charAt(0);
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
				for (int j = 0; j < str.charAt(i)-'0'; j++) {
					sb.append(base);
				}
			}
			else {
				base = str.charAt(i);
			}
		}
		
		return sb.append("\n").toString();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		char c = str.split(" ")[0].charAt(0);
		str = str.split(" ")[1];
		
		System.out.print(c == 'E' ? encode(str) : decode(str));
		br.close();
	}
}
