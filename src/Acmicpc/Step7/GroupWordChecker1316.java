package Acmicpc.Step7;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class GroupWordChecker1316 {
	static boolean checker(String str) {
		boolean[] check = new boolean[26];
		Arrays.fill(check, false);
		
		for (int i = 0; i < str.length(); i++) {
			if (check[str.charAt(i) - 97]) {
				return false;
			}
			else {
				char tmp = str.charAt(i);
				// use shortened operation
				if (i < str.length() - 1 && tmp != str.charAt(i+1)) {
					check[tmp - 97] = true;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), answer = 0;
		for (int i = 0; i < N; i++) {
			if(checker(br.readLine())) {
				answer++;
			}
		}
		System.out.println(answer);
	}
}
