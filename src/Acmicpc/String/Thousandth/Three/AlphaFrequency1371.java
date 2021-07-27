package Acmicpc.String.Thousandth.Three;

import java.io.InputStreamReader;

import java.io.BufferedReader;
import java.io.IOException;

public class AlphaFrequency1371 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] alphaCount = new int[26];
		int max = 0;
		String str = null;
		while ((str = br.readLine()) != null) {
			for (int i = 0; i < str.length(); i++) {
				if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
					alphaCount[str.charAt(i)-'a']++;
					max = Math.max(alphaCount[str.charAt(i)-'a'], max);
				}
			}
		}
		
		for (int i = 0; i < alphaCount.length; i++) {
			if (alphaCount[i] == max) {
				System.out.print((char)(i+97));
			}
		}
	}
}
