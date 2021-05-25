package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DNA2730 {
	static int[][] lcs = null;
	static int LCS(String a, String b) {
		int max = 0;
		for (int i = 1; i < lcs.length; i++) {
			for (int j = 1; j < lcs[i].length; j++) {
				if (a.charAt(i-1) == b.charAt(j-1)) {
					lcs[i][j] = lcs[i-1][j-1] + 1;
				}
				else lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
				max = Math.max(max, lcs[i][j]);
			}
		}
		return max;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String b = br.readLine();
		
		lcs = new int[a.length()+1][b.length()+1];
		for (int i = 0; i < lcs.length; i++) {
			Arrays.fill(lcs[i], 0);
		}
		System.out.println(LCS(a, b));
	}
}
