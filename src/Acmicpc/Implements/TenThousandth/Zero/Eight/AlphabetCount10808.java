package Acmicpc.Implements.TenThousandth.Zero.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AlphabetCount10808 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int[] countAlpha = new int[26];
		String s = br.readLine();
		for (int i = 0; i < s.length(); i++) {
			countAlpha[s.charAt(i)-97]++;
		}
		
		for (int el : countAlpha) {
			System.out.print(el + " ");
		}
	}
}
