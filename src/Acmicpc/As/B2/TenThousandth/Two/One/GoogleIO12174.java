package Acmicpc.As.B2.TenThousandth.Two.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GoogleIO12174 {
	static int func(String str) {
		int res = 0, w = 0;
		for (int i = str.length()-1; i >= 0; i--) {
			res += (str.charAt(i)-'0') * Math.pow(2, w++);
		}
		return res;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String str = null;
		
		for (int i = 1; i <= T; i++) {
			br.readLine();
			str = br.readLine().replaceAll("O", "0").replaceAll("I", "1");
			sb.append("Case #").append(i).append(": ");
			for (int j = 0; j < str.length(); j+=8) {
				sb.append((char)func(str.substring(j, j+8)));
			}
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
