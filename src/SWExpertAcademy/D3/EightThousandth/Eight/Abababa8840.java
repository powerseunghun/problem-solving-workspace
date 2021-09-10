package SWExpertAcademy.D3.EightThousandth.Eight;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Abababa8840 {
	static long func(long n) {
		return ((n-1) / 2) * ((n-1) / 2);
	}
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int T = Integer.parseInt(br.readLine());
		long N = 0;
		
		for (int i = 1; i <= T; i++) {
			N = Long.parseLong(br.readLine());
			sb.append("#" + i + " " + func(N) + "\n");
		}
		System.out.print(sb.toString());
	}
}
