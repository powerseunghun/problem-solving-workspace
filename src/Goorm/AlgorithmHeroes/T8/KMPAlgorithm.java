package Goorm.AlgorithmHeroes.T8;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KMPAlgorithm {
	static void makePIArray(int[] pi, String pattern) {
		for (int i = 1, j = 0; i < pattern.length(); i++) {
			while (j > 0 && pattern.charAt(i) != pattern.charAt(j)) j = pi[j-1];
			if (pattern.charAt(i) == pattern.charAt(j)) pi[i] = ++j;
		}
	}
	static boolean kmp(int[] pi, String str, String pattern) {
		for (int i = 0, j = 0; i < str.length(); i++) {
			while (j > 0 && str.charAt(i) != pattern.charAt(j)) j = pi[j-1];
			if (str.charAt(i) == pattern.charAt(j)) {
				if (j == pattern.length()-1) return true;
				else ++j;
			}
		}
		return false;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String pattern = br.readLine();
		int[] pi = new int[pattern.length()];
		makePIArray(pi, pattern);
		
		if (kmp(pi, str, pattern)) System.out.println("Exist");
		else System.out.println("Not Exist");
		
		br.close();
	}
}
