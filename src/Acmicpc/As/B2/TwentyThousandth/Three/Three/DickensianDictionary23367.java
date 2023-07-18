package Acmicpc.As.B2.TwentyThousandth.Three.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class DickensianDictionary23367 {
	static String l = "qwertasdfgzxcvb", r = "yuiophjklnm";
	static boolean check(String str) {
		char base = str.charAt(0);
		base = l.contains(base+"") ? 'l' : 'r';
		
		for (int i = 1; i < str.length(); i++) {
			char c = str.charAt(i);
			c = l.contains(c+"") ? 'l' : 'r';
			if (c == base) return false;
			base = c;
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		System.out.println(check(str) ? "yes" : "no");
		br.close();
	}
}
