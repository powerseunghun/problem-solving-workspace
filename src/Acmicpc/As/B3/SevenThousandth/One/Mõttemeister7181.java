package Acmicpc.As.B3.SevenThousandth.One;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Mõttemeister7181 {
	static String func(String N, String str) {
		int r1 = 0, r2 = 0;
		for (int i = 0; i < Math.min(N.length(), str.length()); i++) {
			if (N.contains(str.charAt(i)+"")) {
				r1++;
			}
			if (N.charAt(i) == str.charAt(i)) r2++;
		}
		return r1 + " " + r2;
	}
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		String N = br.readLine(), str = null;
		int A = Integer.parseInt(br.readLine());
		
		while(A-- > 0) {
			str = br.readLine();
			sb.append(func(N, str)).append("\n");
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
