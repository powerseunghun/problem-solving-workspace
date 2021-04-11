package Acmicpc.Step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class WordPractice1157 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String tmp = null;
		int[] count = new int[26];
		int max = 0, cnt = 0, index = 0;
		
		Arrays.fill(count, 0);
		
		tmp = br.readLine();
		
		for (int i = 0; i < tmp.length(); i++) {
			char c = tmp.charAt(i);
			if (c >= 'a' && c <= 'z') {
				count[c-97]++;
			}
			else if (c >= 'A' && c <= 'Z') {
				count[c-65]++;
			}
		}
		
		for (int i = 0; i < count.length; i++) {
			if (count[i] >= max) {
				index = i;
				max = count[i];
			}
		}
		
		for (int i = 0; i < count.length; i++) {
			if (max == count[i]) cnt++;
		}
		
		if (cnt >= 2) {
			System.out.println("?");
		}
		else {
			System.out.println((char)(index + 65));
		}
	}
}
