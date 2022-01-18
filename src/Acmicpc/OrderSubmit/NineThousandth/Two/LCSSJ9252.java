package Acmicpc.OrderSubmit.NineThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LCSSJ9252 {
	static String getLCSString(int[][] lcs, String str1, String str2) {
		StringBuilder sb = new StringBuilder();
		int idx1 = lcs.length-1, idx2 = lcs[0].length-1, val = 0;
		while (lcs[idx1][idx2] != 0) {
			val = lcs[idx1][idx2];
			if (lcs[idx1-1][idx2] == val) idx1--;
			else if (lcs[idx1][idx2-1] == val) idx2--;
			else {
				sb.append(str1.charAt(idx1-1));
				idx1--;
				idx2--;
			}
		}
		
		return sb.reverse().toString();
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str1 = br.readLine(), str2 = br.readLine();
		int[][] lcs = new int[str1.length()+1][str2.length()+1];
		int res = 0;
		
		for (int i = 0; i < lcs.length; i++) {
			for (int j = 0; j < lcs[i].length; j++) {
				if (i == 0 || j == 0) lcs[i][j] = 0;
				else if (str1.charAt(i-1) == str2.charAt(j-1)) lcs[i][j] = lcs[i-1][j-1]+1;
				else lcs[i][j] = Math.max(lcs[i-1][j], lcs[i][j-1]);
			}
		}
		res = lcs[str1.length()][str2.length()];
		System.out.println(res);
		br.close();
		if (res == 0) return;
		
		System.out.println(getLCSString(lcs, str1, str2));
	}
}
