package Acmicpc.As.B2.FiveThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Pangram5704 {
	static String check(String str) {
		Set<Character> set = new HashSet<>();
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				set.add(str.charAt(i));
			}
		}
		return set.size() == 26 ? "Y" : "N";
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String str = null;
		
		while (true) {
			str = br.readLine().replaceAll(" ", "").toLowerCase();
			if (str.equals("*")) break;
			sb.append(check(str)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
