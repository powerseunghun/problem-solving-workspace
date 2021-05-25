package CodeUp.TwoThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class DNA2731 {
	static int[][] lcs = null;
//	static String[][] sequence = null;
	static int LCS(String a, String b) {
		int max = 0;
		for (int i = 1; i < lcs.length; i++) {
			for (int j = 1; j < lcs[i].length; j++) {
				if (a.charAt(i-1) == b.charAt(j-1)) {
					lcs[i][j] = lcs[i-1][j-1] + 1;
//					sequence[i][j] = sequence[i-1][j-1]+a.charAt(i-1);
				}
				else {
					lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
//					sequence[i][j] = sequence[i-1][j].length() >= sequence[i][j-1].length() 
//								   ? sequence[i-1][j].toString() : sequence[i][j-1].toString();
				}
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
//		sequence = new String[a.length()+1][b.length()+1];
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < lcs.length; i++) {
			Arrays.fill(lcs[i], 0);
//			Arrays.fill(sequence[i], "");
		}
		
		System.out.println(LCS(a, b));
		int x = a.length(), y = b.length();
		while(lcs[x][y] != 0) {
			if (lcs[x][y] == lcs[x-1][y]) x--;
			else if (lcs[x][y] == lcs[x][y-1]) y--;
			else if (lcs[x][y] -1 == lcs[x-1][y-1]) {
				sb.append(b.charAt(y-1));
				x--;
				y--;
			}
		}
		System.out.println(sb.reverse().toString());
//		for (int i = 0; i < lcs.length; i++) {
//			for (int j = 0; j < lcs[i].length; j++) {
//				System.out.print(lcs[i][j] + " ");
//			}
//			System.out.println();
//		}
//		System.out.println(sequence[a.length()][b.length()]);
	}
}
