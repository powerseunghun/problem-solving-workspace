package Acmicpc.As.B3.NineThousandth.Two;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MoreDice9288 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int x = Integer.parseInt(br.readLine()), n = 0;
		
		for (int i = 1; i <= x; i++) {
			sb.append("Case " + i + ":\n");
			n = Integer.parseInt(br.readLine());
			for (int j = 1; j <= 6; j++) {
				for (int k = 6; k >= j; k--) {
					if (j+k == n) sb.append("(" + j + "," + k + ")\n");
				}
			}
		}
		
		System.out.print(sb.toString());
		br.close();
	}
}
