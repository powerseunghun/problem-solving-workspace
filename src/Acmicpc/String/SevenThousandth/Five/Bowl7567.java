package Acmicpc.String.SevenThousandth.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Bowl7567 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int sum = 10;
		String s = br.readLine();
		for (int i = 1; i < s.length(); i++) {
			if (s.charAt(i) != s.charAt(i-1)) sum += 10;
			else sum += 5;
		}
		System.out.println(sum);
	}
}
