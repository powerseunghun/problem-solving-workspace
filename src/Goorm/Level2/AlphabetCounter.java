package Goorm.Level2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabetCounter {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int[] count = new int[26];
		
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') count[str.charAt(i)-'a']++;
			else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') count[str.charAt(i)-'A']++;
		}
		
		for (int i = 0; i < count.length; i++) {
			System.out.println((char)(i+97) + " : " + count[i]);
		}
	}
}
