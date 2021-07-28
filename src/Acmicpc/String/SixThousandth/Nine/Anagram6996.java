package Acmicpc.String.SixThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagram6996 {
	static boolean checkAnagram(String str1, String str2) {
		int[] alphaCount1 = new int[26], alphaCount2 = new int[26];
		int sum = 0;
		if (str1.length() != str2.length()) return false;
		for (int i = 0; i < str1.length(); i++) {
			alphaCount1[str1.charAt(i)-'a']++;
		}
		for (int i = 0; i < str2.length(); i++) {
			alphaCount2[str2.charAt(i)-'a']++;
		}
		
		for (int i = 0; i < alphaCount1.length; i++) {
			sum += Math.abs(alphaCount1[i] - alphaCount2[i]);
		}
		
		if (sum == 0) return true;
		else return false;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String tmp = null, str1 = null, str2 = null;
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < N; i++) {
			tmp = br.readLine();
			str1 = tmp.split(" ")[0];
			str2 = tmp.split(" ")[1];
			if (checkAnagram(str1, str2)) {
				sb.append(str1 + " & " + str2 + " are anagrams.\n");
			}
			else sb.append(str1 + " & " + str2 + " are NOT anagrams.\n");
		}
		System.out.print(sb.toString());
	}
}
