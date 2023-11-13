package Acmicpc.As.B5.SixThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SubString6550 {
	static Boolean check(String s, String t) {
		int cnt = 0;
		for (int i = 0, targetIdx = 0; i < t.length(); i++) {
			if (s.charAt(targetIdx) == t.charAt(i)) {
				cnt++;
				targetIdx++;
				if (cnt == s.length()) return true;
			}
		}
		return false;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null, s = null, t = null;
		
		while((str = br.readLine()) != null) {
			if (str.equals("")) break;
			s = str.split(" ")[0];
			t = str.split(" ")[1];
			
			sb.append(check(s, t) ? "Yes" : "No").append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
