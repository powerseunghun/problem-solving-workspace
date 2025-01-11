package Acmicpc.As.B3.ThirtyThousandth.Three.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class AppendAndPanic33135 {
	static String eraseString(String str) {
		StringBuilder sb = new StringBuilder();
		Set<Character> set = new HashSet<>();
		char[] cArr = str.toCharArray();
		Arrays.sort(cArr);
		for (char c : cArr) {
			if (set.contains(c)) continue;
			sb.append(c);
			set.add(c);
		}
		return sb.toString();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String eraseString = eraseString(str);
		
		System.out.println(str.length() - eraseString.length());
		br.close();
	}
}
