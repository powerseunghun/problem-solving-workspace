package Acmicpc.As.B1.NineThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class WordLadder9229 {
	static boolean res = true;
	static boolean check(String str1, String str2) {
		int d = 0;
		if (str1.length() != str2.length()) return false;
		for (int i = 0; i < str1.length(); i++) {
			if (str1.charAt(i) != str2.charAt(i)) d++;
		}
		return d == 1;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str1 = null, str2 = null;
		
		while (true) {
			str1 = br.readLine();
			if (str1.equals("#")) break;
			res = true;
			while(true) {
				str2 = br.readLine();
				if (str2.equals("#")) {
					sb.append(res ? "Correct" : "Incorrect").append("\n");
					break;
				}
				if (!res) continue;
				res = check(str1, str2);
				str1 = str2;
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
