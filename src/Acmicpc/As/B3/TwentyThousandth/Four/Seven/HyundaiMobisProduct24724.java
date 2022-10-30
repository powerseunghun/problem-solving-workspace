package Acmicpc.As.B3.TwentyThousandth.Four.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HyundaiMobisProduct24724 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine()), N = 0, A = 0, B = 0;
		String tmp = null;
		
		for (int i = 1; i <= T; i++) {
			N = Integer.parseInt(br.readLine());
			tmp = br.readLine();
			sb.append("Material Management " + i + "\n");
			for (int j = 0; j < N; j++) {
				tmp = br.readLine();
			}
			sb.append("Classification ---- End!\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
