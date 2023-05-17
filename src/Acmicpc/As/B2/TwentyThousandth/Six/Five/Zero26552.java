package Acmicpc.As.B2.TwentyThousandth.Six.Five;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Zero26552 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine()), k = 0;
		String tmp = null;
		
		while(n-- > 0) {
			k = Integer.parseInt(br.readLine());
			for (int i = k+1; ; i++) {
				tmp = String.valueOf(i);
				if (tmp.length() == tmp.replaceAll("0", "").length()) {
					sb.append(tmp).append("\n");
					break;
				}
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
