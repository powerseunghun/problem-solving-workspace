package Acmicpc.String.TwoThousandth;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SimilarWord2607 {
	static int check(int[] baseAlphaCount, int[] alphaCount) {
		int sum = 0;
		for (int i = 0; i < baseAlphaCount.length; i++) {
			sum += Math.abs(baseAlphaCount[i] - alphaCount[i]);
		}
		return sum;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()), count = 0;
		int[] baseAlphaCount = new int[26];
		int[] alphaCount = new int[26];
		String base = br.readLine(), tmp = null;
		
		for (int i = 0; i < base.length(); i++) {
			baseAlphaCount[base.charAt(i)-'A']++;
		}
		
		for (int i = 0; i < N-1; i++) {
			Arrays.fill(alphaCount, 0);
			tmp = br.readLine();
			if (Math.abs(base.length()-tmp.length()) > 1) continue;
			for (int j = 0; j < tmp.length(); j++) {
				alphaCount[tmp.charAt(j)-'A']++;
			}
			if (check(baseAlphaCount, alphaCount) <= 2) count++;
		}
		System.out.println(count);
	}
}
