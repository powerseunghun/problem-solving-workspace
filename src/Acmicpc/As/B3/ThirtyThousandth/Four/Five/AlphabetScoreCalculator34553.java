package Acmicpc.As.B3.ThirtyThousandth.Four.Five;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class AlphabetScoreCalculator34553 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = 1, v = 1;
		
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i-1) < str.charAt(i)) {
				v++;
			} else v = 1;
			
			res += Math.max(v, 1);
		}
		
		System.out.println(res);
		br.close();
	}
}
