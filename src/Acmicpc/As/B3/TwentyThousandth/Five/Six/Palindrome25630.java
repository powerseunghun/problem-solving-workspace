package Acmicpc.As.B3.TwentyThousandth.Five.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome25630 {
	static int func(String str) {
		int cnt = 0;
		for (int i = 0, j = str.length()-1; i < j; i++, j--) {
			if (str.charAt(i) != str.charAt(j)) cnt++;
		}
		return cnt;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		br.readLine();
		String str = br.readLine();
		
		System.out.println(func(str));
		br.close();
	}
}
