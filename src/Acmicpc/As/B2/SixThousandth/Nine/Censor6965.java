package Acmicpc.As.B2.SixThousandth.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Censor6965 {
	static final int limitLen = 4;
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine());
		String str = null, tmp = null;
		
		while(N-- > 0) {
			str = br.readLine();
			for (int i = 0; i < str.split(" ").length; i++) {
				tmp = str.split(" ")[i];
				sb.append(tmp.length() == limitLen ? "****" : tmp);
				if (i == str.split(" ").length) continue;
				sb.append(" ");
			}
			if (N == 0) continue;
			sb.append("\n\n");
		}
		
		System.out.println(sb.toString());
		br.close();
	}
}
