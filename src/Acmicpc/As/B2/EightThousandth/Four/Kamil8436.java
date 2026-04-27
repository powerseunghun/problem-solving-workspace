package Acmicpc.As.B2.EightThousandth.Four;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Kamil8436 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int t = 0, d = 0, l = 0, f = 0;
		long res = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c == 'T' || c == 'D' || c == 'L' || c == 'F') {
				res++;
			}
		}
		
		System.out.println(1 << res);
		br.close();
	}
}
