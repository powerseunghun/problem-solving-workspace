package CodeUp.TwoThousandth.Six;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class SubStringLCSDP2699 {
	static int[][] lcsDP = null;
	static int LCS(String a, String b) {
		int res = 0;
		for (int i = 1; i < lcsDP.length; i++) {
			for (int j = 1; j < lcsDP[i].length; j++) {
				if (a.charAt(i-1) == b.charAt(j-1)) {
					lcsDP[i][j] = lcsDP[i-1][j-1] + 1;
				}
				else {
					lcsDP[i][j] = Math.max(lcsDP[i-1][j], lcsDP[i][j-1]);
				}
				res = Math.max(res, lcsDP[i][j]);
			}
		}
		return lcsDP[a.length()][b.length()];
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String a = br.readLine();
		String b = br.readLine();
		lcsDP = new int[a.length()+1][b.length()+1];
		for (int i = 0; i < lcsDP.length; i++) {
			Arrays.fill(lcsDP[i], 0);
		}
		
		System.out.println(LCS(a, b));
	}
}
