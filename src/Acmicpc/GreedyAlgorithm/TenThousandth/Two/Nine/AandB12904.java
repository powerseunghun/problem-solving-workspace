package Acmicpc.GreedyAlgorithm.TenThousandth.Two.Nine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AandB12904 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int ans = 0;
		String s1 = br.readLine();
		String s2 = br.readLine();
		StringBuilder sb = null;
		while (true) {
			if (s1.length() == s2.length()) {
				if (s1.equals(s2)) ans = 1;
				break;
			}
			if (s2.charAt(s2.length()-1) == 'A') {
				s2 = s2.substring(0, s2.length()-1);
			}
			else {
				sb = new StringBuilder(s2.substring(0, s2.length()-1));
				s2 = sb.reverse().toString();
			}
		}
		System.out.println(ans);
	}
}
