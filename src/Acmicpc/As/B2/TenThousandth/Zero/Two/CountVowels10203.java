package Acmicpc.As.B2.TenThousandth.Zero.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CountVowels10203 {
	static Set<Character> vowels = new HashSet<>(Arrays.asList('a','e','i','o','u'));
	static int func(String str) {
		int cnt = 0;
		for (int i = 0; i < str.length(); i++) {
			if (vowels.contains(str.charAt(i))) cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String str = null;
		
		//The number of vowels in despicable is 4.
		while(T-- > 0) {
			str = br.readLine();
			sb.append("The number of vowels in ")
			.append(str)
			.append(" is ")
			.append(func(str))
			.append(".")
			.append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
