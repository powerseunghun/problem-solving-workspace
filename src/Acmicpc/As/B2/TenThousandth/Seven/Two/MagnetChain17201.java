package Acmicpc.As.B2.TenThousandth.Seven.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MagnetChain17201 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		char c = str.charAt(0);
		boolean flag = true;
		
		for (int i = 1; i < str.length(); i++) {
			if (c == str.charAt(i)) {
				flag = false;
				break;
			}
			c = str.charAt(i);
		}
		
		System.out.println(flag ? "Yes" : "No");
		br.close();
	}
}
