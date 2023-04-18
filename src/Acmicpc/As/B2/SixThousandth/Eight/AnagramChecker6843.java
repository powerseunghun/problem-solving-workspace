package Acmicpc.As.B2.SixThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AnagramChecker6843 {
	static final int len = 26;
	static void preWork(int[] arr, String str) {
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') continue;
			arr[str.charAt(i)-65]++;
		}
	}
	static boolean func(String base, String str) {
		int[] bc = new int[len];
		int[] sc = new int[len];
		preWork(bc, base);
		preWork(sc, str);
		
		for (int i = 0; i < len; i++) {
			System.out.println(bc[i] + " " + sc[i]);
			if (bc[i] != sc[i]) return false;
		}
		return true;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		boolean check = func(br.readLine(), br.readLine());
		
		System.out.println("Is" + (!check ? " not " : " ") + "an anagram.");
		br.close();
	}
}
