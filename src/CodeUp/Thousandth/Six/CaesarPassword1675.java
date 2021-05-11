package CodeUp.Thousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CaesarPassword1675 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String pw = br.readLine();
		char[] alp = new char[26];
		for (int i = 0; i < alp.length; i++) {
			alp[i] = (char)(97 + i);
		}
		
		for (int i = 0, base = 0; i < pw.length(); i++) {
			if (pw.charAt(i) != 32) {
				base = pw.charAt(i)-3-97;
				if (base < 0) System.out.print(alp[alp.length+base]);
				else System.out.print(alp[base]);
			}
			else {
				System.out.print((char)32);
			}
		}
	}
}
