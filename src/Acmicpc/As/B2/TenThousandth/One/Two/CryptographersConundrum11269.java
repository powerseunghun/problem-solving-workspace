package Acmicpc.As.B2.TenThousandth.One.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CryptographersConundrum11269 {
	static final String t = "PER";
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = 0;
		
		for (int i = 0; i < str.length(); i+=t.length()) {
			for (int j = 0; j < t.length(); j++) {
				if (str.charAt(i+j) != t.charAt(j)) res++; 
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
