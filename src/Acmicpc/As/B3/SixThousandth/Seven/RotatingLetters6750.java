package Acmicpc.As.B3.SixThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RotatingLetters6750 {
	static boolean check(String tmp) {
		for (int i = 0; i < tmp.length(); i++) {
			switch(tmp.charAt(i)) {
			case 'I': case'O': case 'S': case 'H': 
			case 'Z': case 'X': case 'N':
				continue;
			}
			return false;
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = br.readLine();
		
		System.out.println(check(tmp) ? "YES" : "NO");
		br.close();
	}
}
