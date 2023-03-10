package Acmicpc.As.B2.FourThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LookAndSay4841 {
	static String func(String tmp) {
		StringBuilder sb = new StringBuilder();
		int cnt = 1;
		char c = tmp.charAt(0);
		for (int i = 1; i < tmp.length(); i++) {
			if (tmp.charAt(i) == c) {
				cnt++;
				continue;
			}
			sb.append(cnt).append(c);
			cnt = 1;
			c = tmp.charAt(i);		
		}
		
		sb.append(cnt).append(c).append("\n");
		return sb.toString();
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String tmp = null;
		
		while(T-- > 0) {
			tmp = br.readLine();
			sb.append(func(tmp));
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
