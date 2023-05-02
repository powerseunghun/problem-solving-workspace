package Acmicpc.As.B2.SixThousandth.Seven;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BigBangSecrets6766 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int K = Integer.parseInt(br.readLine()), w = 0, m = 0;
		String str = br.readLine();
		
		for (int i = 0; i < str.length(); i++) {
			w = 3 * (i+1) + K;
			m = str.charAt(i) - (w % 26);
			m = m < 65 ? m += 26 : m;
			sb.append((char)m);
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
