package Acmicpc.String.Thousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakePalindrome1213 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		StringBuilder sb = new StringBuilder();
		int[] alphaCount = new int[26];
		int oddCount = 0, oddIdx = alphaCount.length+1;
		
		for (int i = 0; i < s.length(); i++) {
			alphaCount[s.charAt(i)-'A']++;
		}
		for (int i = 0; i < alphaCount.length; i++) {
			if (alphaCount[i] % 2 != 0) {
				oddCount++;
				oddIdx = i;
			}
		}
		if (oddCount > 1) {
			System.out.println("I'm Sorry Hansoo");
			return;
		}
		
		for (int i = 0; i < alphaCount.length; i++) {
			if (alphaCount[i] != 0) {
				for (int j = 0; j < alphaCount[i] / 2; j++) {
					sb.append((char)('A' + i));
				}
			}
		}
		
		if (oddIdx != alphaCount.length+1) {
			sb.append((char)('A' + oddIdx));
		}
		for (int i = alphaCount.length-1; i >= 0; i--) {
			for (int j = 0; j < alphaCount[i]/2; j++) {
				sb.append((char)('A' + i));
			}
		}
		System.out.println(sb.toString());
		
		
		
	}
}
