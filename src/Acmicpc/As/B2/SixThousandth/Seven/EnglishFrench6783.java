package Acmicpc.As.B2.SixThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EnglishFrench6783 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), ct = 0, cs = 0;
		String str = null;
		
		while(N-- > 0) {
			str = br.readLine();
			for (int i = 0; i < str.length(); i++) {
				switch(str.charAt(i)) {
				case 't': case 'T':
					ct++;
					break;
				case 's': case 'S':
					cs++;
					break;
				}
			}
		}
		
		System.out.println(cs >= ct ? "French" : "English");
		br.close();
	}
}
