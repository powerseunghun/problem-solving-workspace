package Codeforce.Ctps.First;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class test {
	static boolean check(String str, String pattern) {
		int i = 0, patternIdx = 0, idx = 0;
		int[] idxs = new int[pattern.length()];
		
		for (i = 0; i < str.length(); i++) {
			if (str.charAt(i) == pattern.charAt(patternIdx)) {
				idxs[idx++] = i;
				patternIdx++;
				if (idx == pattern.length()) break;
			}
		}
		if (idx < pattern.length()) return false;
		
		for (i = i+1; i < str.length(); i++) {
			if (pattern.contains(str.charAt(i)+"")) return false;
		}
		return true;
	}
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null;
		int N = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			if (check(tmp.split(" ")[0], tmp.split(" ")[1])) sb.append("YES\n");
			else sb.append("NO\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
