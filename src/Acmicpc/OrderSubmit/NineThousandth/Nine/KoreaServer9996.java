package Acmicpc.OrderSubmit.NineThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KoreaServer9996 {
	static boolean check(String[] pat, String str) {
		// StringIndexOutOfBounds
		if (pat[0].length() + pat[1].length() > str.length()) return false;
		if (pat[0].equals(str.substring(0, pat[0].length()))) {
			if (pat[1].equals(str.subSequence(str.length()-pat[1].length(), str.length()))) {
				return true;
			}
		}
		return false;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String[] tmp = br.readLine().split("\\*");
		String str = null;
		
//		for (String s : tmp) {
//			System.out.println(s);
//		}
		
		for (int i = 0; i < N; i++) {
			str = br.readLine();
			if (check(tmp, str)) sb.append("DA");
			else sb.append("NE");
			sb.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
