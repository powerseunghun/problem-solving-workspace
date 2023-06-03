package Acmicpc.As.B2.TwentyThousandth.Four.Five;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TimeComplexity24510 {
	static String[] loops = {"for", "while"};
	static int diff(String str, String base) {
		String fStr = str.replaceAll(base, "");
		
		return Math.abs(str.length() - fStr.length());
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine()), w = 0, max = 0;
		String str = null;
		
		while(T-- > 0) {
			str = br.readLine();
			w = 0;
			for (String loop : loops) {
				w += diff(str, loop) / loop.length();
			}
			max = Math.max(max, w);
		}
		
		System.out.println(max);
		br.close();
	}
}
