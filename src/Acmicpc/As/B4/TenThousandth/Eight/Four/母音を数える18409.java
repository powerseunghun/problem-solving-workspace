package Acmicpc.As.B4.TenThousandth.Eight.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class 母音を数える18409 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String s = br.readLine();
		int cnt = 0;
		char c = ' ';
		
		for (int i = 0; i < s.length(); i++) {
			c = s.charAt(i);
			if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') cnt++;
		}
		
		System.out.println(cnt);
		br.close();
	}
}
