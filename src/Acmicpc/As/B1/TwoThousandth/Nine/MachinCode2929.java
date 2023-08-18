package Acmicpc.As.B1.TwoThousandth.Nine;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class MachinCode2929 {
	static final int len = 4;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int res = 0;
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			if (c >= 'A' && c <= 'Z') {
				while ((i + res) % len != 0) res++;
			}
		}
		
		System.out.println(res);
		br.close();
	}
}
