package Acmicpc.As.B2.ThirtyThousandth.Three.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Diary33869 {
	static Set<Character> set = new HashSet<>();
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = br.readLine(), key = "";
		String str2 = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (set.contains(c)) continue;
			key += c;
			set.add(c);
		}
		for (char c = 'A'; c <= 'Z'; c++) {
			if (!set.contains(c)) {
				key += c;
			}
		}
		for (int i = 0; i < str2.length(); i++) {
			int idx = str2.charAt(i)-'A';
			sb.append(key.charAt(idx));
		}
		System.out.println(sb.toString());
		br.close();
	}
}
