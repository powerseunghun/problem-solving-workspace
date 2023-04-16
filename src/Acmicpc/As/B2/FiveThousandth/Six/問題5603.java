package Acmicpc.As.B2.FiveThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 問題5603 {
	static String func(String str) {
		StringBuilder sb = new StringBuilder();
		char c = str.charAt(0);
		int cnt = 1;
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) != c) {
				sb.append(cnt).append(c);
				cnt = 1;
			}
			else cnt++;
			
			c = str.charAt(i);
		}
		sb.append(cnt).append(c);
		return sb.toString();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String str = br.readLine();
		
		while(n-- > 0) {
			str = func(str);
		}
		
		System.out.println(str);
		br.close();
	}
}
