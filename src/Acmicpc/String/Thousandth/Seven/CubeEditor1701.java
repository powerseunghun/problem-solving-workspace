package Acmicpc.String.Thousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CubeEditor1701 {
	static int[] pi = null;
	static int getPiMax(String str) {
		int j = 0, max = 0;
		pi = new int[str.length()];
		
		for (int i = 1; i < str.length(); i++) {
			while (j > 0 && str.charAt(i) != str.charAt(j)) {
				j = pi[j-1];
			}
			if (str.charAt(i) == str.charAt(j)) max = Math.max(max, pi[i]=++j);
		}
		return max;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine(), tmp = null;
		int max = 0;
		for (int i = 0; i < s.length(); i++) {
			tmp = s.substring(i, s.length());
			max = Math.max(max, getPiMax(tmp));
		}
		
		System.out.println(max);
	}
}
