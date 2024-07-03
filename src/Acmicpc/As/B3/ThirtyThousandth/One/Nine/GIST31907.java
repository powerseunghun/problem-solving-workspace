package Acmicpc.As.B3.ThirtyThousandth.One.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class GIST31907 {
	static String[] strs = {"G...", ".I.T", "..S."};
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder(), tSb = null;;
		int K = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < strs.length; i++) {
			tSb = new StringBuilder();
			for (int j = 0; j < strs[i].length(); j++) {
				for (int k = 0; k < K; k++) {
					tSb.append(strs[i].charAt(j));
				}
			}
			tSb.append("\n");
			for (int j = 0; j < K; j++) {
				sb.append(tSb.toString());
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
