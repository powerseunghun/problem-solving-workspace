package SWExpertAcademy.D3.ThreeThousandth.Three;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCS3304 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String tmp = null, A = null, B = null;
		int[][] lcs = null;
		int T = Integer.parseInt(br.readLine());
		
		for (int i = 1; i <= T; i++) {
			tmp = br.readLine();
			A = tmp.split(" ")[0];
			B = tmp.split(" ")[1];
			lcs = new int[B.length()+1][A.length()+1];
			
			for (int j = 0; j < lcs.length; j++) {
				for (int k = 0; k < lcs[j].length; k++) {
					if (j == 0 || k == 0) lcs[j][k] = 0;
					else if (B.charAt(j-1) == A.charAt(k-1)) {
						lcs[j][k] = lcs[j-1][k-1]+1;
					}
					else lcs[j][k] = Math.max(lcs[j-1][k], lcs[j][k-1]);
				}
			}
			sb.append("#" + i + " " + lcs[B.length()][A.length()] + "\n");
		}
		System.out.print(sb.toString());
	}
}
