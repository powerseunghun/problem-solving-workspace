package Acmicpc.As.B3.FiveThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountingSwannsCoins5292 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int N = Integer.parseInt(br.readLine().replaceAll(" ", ""));
		boolean flag = false;
		
		for (int i = 1; i <= N; i++) {
			flag = false;
			if (i%3 == 0 || i%5 == 0) {
				if (i%3 == 0) sb.append("Dead");
				if (i%5 == 0) sb.append("Man");
				flag = true;
			}
			sb.append(flag ? "\n" : (i + " "));
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
