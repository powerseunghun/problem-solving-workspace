package Acmicpc.String.Thousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MakeAnagram1919 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] count1 = new int[26];
		int[] count2 = new int[26];
		int count = 0;
		String s1 = br.readLine();
		String s2 = br.readLine();
		
		for (int i = 0; i < s1.length(); i++) {
			count1[s1.charAt(i)-'a']++;
		}
		for (int i = 0; i < s2.length(); i++) {
			count2[s2.charAt(i)-'a']++;
		}
		for (int i = 0; i < count1.length; i++) {
			if (count1[i] != count2[i]) {
				count += Math.abs(count1[i] - count2[i]);
			}
		}
		
		System.out.println(count);
	}
}
