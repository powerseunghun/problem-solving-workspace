package Acmicpc.As.B2.ThreeThousandth.Four;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class HammingDistance3449 {
	static int getHm(String s1, String s2) {
		int res = 0;
		for (int i = 0; i < s1.length(); i++) {
			if (s1.charAt(i) != s2.charAt(i)) res++;
		}
		return res;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		String s1 = null, s2 = null;
		
		while(T-- > 0) {
			s1 = br.readLine();
			s2 = br.readLine();
			sb.append("Hamming distance is " + getHm(s1, s2) + ".\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
