package Acmicpc.As.B2.TenThousandth.Seven.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BonusScore17389 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		int res = 0;
		
		for (int i = 0, b = 0; i < str.length(); i++) {
			if (str.charAt(i) == 'O') {
				res += (i+1) + (b++);
			}
			else {
				b = 0;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
